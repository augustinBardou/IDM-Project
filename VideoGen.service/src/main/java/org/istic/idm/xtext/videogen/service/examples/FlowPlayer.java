/**
 * 
 */
package org.istic.idm.xtext.videogen.service.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.ecore.PlayList.PlayListFactory;
import org.istic.idm.ecore.PlayList.Video;
import org.istic.idm.ecore.PlayList.impl.PlayListFactoryImpl;
import org.istic.idm.ecore.PlayList.impl.PlayListImpl;
import org.istic.idm.ecore.PlayList.util.PlayListTransform;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoCodec;
import org.istic.idm.xtext.utils.VideoGenTransform;
import org.istic.idm.xtext.videoGen.VideoGen;

/**
 * @author blacknight
 *
 */
public class FlowPlayer {

	private static VideoGen videoGen = null;
	private static PlayListImpl playlist = null;;
	
	// Templating
	private final static String videoCodec = "application/x-mpegurl"; 
	private final static String playListElements = "%playlistElements%";
	private final static String playListTemplate = "%playlistSource%";
	private final static String playListType = "%playlistType%";
	private final static String rootPath = "%rootpath%";

	//Resources
	private static Path videoGenPath = Paths.get(FlowPlayer.class.getResource("/test.vg").getPath());
	private static Path sitePath = Paths.get(FlowPlayer.class.getResource("/site/").getPath());
	private static String indexPath = sitePath + "/index.html";
	private static String generatedIndexPath = sitePath + "/generatedindex.html";
	private static String masterPL = "master.m3u8";
	private static String childPL = "child.m3u8";
    	
	public String generateIndex() throws IOException {
		assert playlist != null;
		System.out.println("Templating...");
		BufferedReader reader = new BufferedReader(
			new FileReader( new File(indexPath)));
		final BufferedWriter rewriter = new BufferedWriter(
				new FileWriter(new File(generatedIndexPath)));
		reader.lines().forEach( new Consumer<String>() {
			public void accept(String line) {
				if (line.contains(playListTemplate)) {
					line = line.replace(playListTemplate, masterPL);
				}
				if (line.contains(rootPath)) {
					line = line.replace(rootPath, sitePath.toAbsolutePath().toString());
				}
				if (line.contains(playListType)) {
					line = line.replace(playListType, videoCodec);
				}
				if (line.contains(playListElements)) {
					StringBuffer content = new StringBuffer();
					content.append("<div class=\"fp-playlist\">");
					for (Video video : playlist.getVideo()) {
						content.append("<a href=\"blob:file://" + video.getPath() + "\" style=\"background-image:url(" + video.getThumbnail() + ")\"></a>\r");
					}
					line = line.replace(playListElements, content);
					content.append("</div>");
				}
				try {
					rewriter.write(line + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}); 
		reader.close();
		rewriter.flush();
		rewriter.close();
		return generatedIndexPath;
	}

	public PlayList generatePlayList() throws IOException {
		videoGen = VideoGenStandaloneSetup.loadVideoGen(videoGenPath.toString());
		VideoGenTransform.ConvertTo(VideoCodec.FLV, videoGen);
		System.out.println(videoGen);
		VideoGenTransform.addMetadata(videoGen);
		System.out.println("Playlist written...");
		playlist = VideoGenTransform.toPlayList(videoGen, true);
		Map<String, String> options = new HashMap<String, String>();
		options.put("BANDWITH", "684383");
		options.put("CODECS", "avc1.66.30,mp4a.40.2");
		options.put("RESOLUTION", "640x360");
		childPL = org.istic.idm.xtext.videogen.service.examples.PlayList.writeToFile(childPL, PlayListTransform.toM3U(playlist, true, true)).getAbsolutePath();
		PlayListFactory factory = new PlayListFactoryImpl();
		PlayList masterPlayList = factory.createPlayList();
		Video masterVideo = factory.createVideo();
		masterVideo.setPath(childPL);
		masterPlayList.getVideo().add(masterVideo);
		masterPL = org.istic.idm.xtext.videogen.service.examples.PlayList.writeToFile(masterPL, PlayListTransform.toM3U(playlist, true, false, options)).getAbsolutePath();
		return playlist;

	}
	
	public void setGrammar(String string) {
		videoGenPath = Paths.get(string);
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ExecuteException 
	 */
	public static void main(String[] args) throws ExecuteException, IOException {
		FlowPlayer flowplayer = new FlowPlayer();
		if (args.length > 0) {
			flowplayer.setGrammar(args[0]);
		}
		flowplayer.generatePlayList();
		
		System.out.println("Flowplayer launched...");
		String cmd = "firefox " + flowplayer.generateIndex();
		CommandLine commandLine = CommandLine.parse(cmd);
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(0);
		executor.execute(commandLine);
	}

}
