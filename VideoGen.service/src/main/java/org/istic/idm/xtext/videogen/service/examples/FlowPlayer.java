/**
 * 
 */
package org.istic.idm.xtext.videogen.service.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
	private static PlayListImpl playlist = null;
	private static Boolean withConfigurator = true;
	
	// Templating
	private final static String playListType = "application/x-mpegurl"; 
	private final static String playListElementsTPL = "%playlistElements%";
	private final static String playlistSourceTPL = "%playlistSource%";
	private final static String playListTypeTPL = "%playlistType%";
	private final static String rootPathTPL = "%rootpath%";
	private final static String configuratorTPL = "%configurator%";

	//Resources
	private static Path videoGenPath = Paths.get(FlowPlayer.class.getResource("/test.vg").getPath());
	private static Path sitePath = Paths.get(FlowPlayer.class.getResource("/site/").getPath());
	private static String indexPath = sitePath + "/index.html";
	private static String generatedIndexPath = sitePath + "/generatedindex.html";
	private static String masterPL = "master.m3u8";
	private static String childPL = "child.m3u8";

	private StringBuffer templating(Stream<String> stream) {
		final StringBuffer content = new StringBuffer();
		System.out.println("Templating...");
		stream.forEach( new Consumer<String>() {
			public void accept(String line) {
				if (line.contains(playlistSourceTPL)) {
					line = line.replace(playlistSourceTPL, masterPL);
				}
				if (line.contains(rootPathTPL)) {
					line = line.replace(rootPathTPL, sitePath.toAbsolutePath().toString());
				}
				if (line.contains(playListTypeTPL)) {
					line = line.replace(playListTypeTPL, playListType);
				}
				if (line.contains(playListElementsTPL)) {
					StringBuffer subcontent = new StringBuffer();
					subcontent.append("<div class=\"fp-playlist\">");
					for (Video video : playlist.getVideo()) {
						subcontent.append("<a href=\"blob:file://" + video.getPath() + "\" style=\"background-image:url(" + video.getThumbnail() + ")\"></a>");
					}
					subcontent.append("</div>");
					line = line.replace(playListElementsTPL, subcontent);
				}
				if (line.contains(configuratorTPL)) {
					if (withConfigurator) {
						line = line.replace(configuratorTPL, VideoGenTransform.toConfigurator(videoGen));
					} else {
						line = line.replace(configuratorTPL, " ");
					}
				}
				content.append(line + "\n");
			}
		}); 
		return content;
	}
	
	public String generateIndex() throws IOException {
		assert playlist != null;
		BufferedReader reader = new BufferedReader(
			new FileReader( new File(indexPath)));
		final BufferedWriter writer = new BufferedWriter(
				new FileWriter(new File(generatedIndexPath)));
		writer.write(templating(reader.lines()).toString());
		reader.close();
		writer.flush();
		writer.close();
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
	
	public void setVideoGen(String string) {
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
			flowplayer.setVideoGen(args[0]);
			if (args.length > 1) {
				withConfigurator = Boolean.valueOf(args[1]);
			}
		}
		flowplayer.generatePlayList();
		
		System.out.println("Flowplayer launched...");
		String cmd = "firefox " + flowplayer.generateIndex();
		CommandLine commandLine = CommandLine.parse(cmd);
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(0);
		executor.execute(commandLine);
	}
	
	public static void setConfigurator(boolean b) {
		withConfigurator = b;
	}

	public static BufferedReader getPageContent() throws FileNotFoundException {
		return new BufferedReader(new FileReader(generatedIndexPath));
	}

}
