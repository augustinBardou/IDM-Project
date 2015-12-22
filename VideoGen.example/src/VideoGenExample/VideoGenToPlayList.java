package VideoGenExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.istic.idm.ecore.PlayList.Video;
import org.istic.idm.ecore.PlayList.impl.PlayListImpl;
import org.istic.idm.ecore.PlayList.util.PlayListTransform;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.Execute;
import org.istic.idm.xtext.utils.VideoCodec;
import org.istic.idm.xtext.videoGen.VideoGen;

import org.istic.idm.xtext.utils.VideoGenTransform;


public class VideoGenToPlayList {

	static VideoGen videoGen;
	static PlayListImpl playlist;
	static String filename = Paths.get("resources/test.vg").toAbsolutePath().toString();
	static Path path = Paths.get("bin/playlists/").toAbsolutePath();
	
	private static File writeToFile(String filename, String content) {
		if (!path.toFile().exists()) {
			Execute.mkDirs(path);
		}
		FileWriter writer;
		File file = new File(path  + "/" + filename);
		try {
			writer = new FileWriter(file);
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file; 
	}
	
	
	public static void launchFlowPlayer() throws IOException {
		VideoGenTransform.ConvertTo(VideoCodec.MPEGTS, videoGen);
		String videoCodec = "application/x-mpegurl"; 
		playlist = VideoGenTransform.toPlayList(videoGen, true);
		String playListElements = "%playlistElements%";
		String playListTemplate = "%playlistSource%";
		String playListType = "%playlistType%";
		System.out.println("Flowplayer launched...");
    	//Get file from resources folder
		Path path = Paths.get("resources/site/").toAbsolutePath();
		System.out.println(path);
		String flp = path + "/flowplayer.m3u8";
		System.out.println(flp);
    	
		FileWriter writer = new FileWriter(flp);
		writer.write(PlayListTransform.toM3U(playlist, true, true));
		writer.flush();
		writer.close();

		String indexPath = path + "/index.html";
		System.out.println(indexPath);
		String generatedIndexPath = path + "/generatedindex.html";
		System.out.println(generatedIndexPath);
		BufferedReader reader = new BufferedReader(new FileReader(new File(indexPath)));
		BufferedWriter rewriter = new BufferedWriter(new FileWriter(new File(generatedIndexPath)));
		reader.lines().forEach( new Consumer<String>() {
			@Override
			public void accept(String line) {
				if (line.contains(playListTemplate)) {
					System.out.println("Before: " + line);
					line = line.replace(playListTemplate, flp);
					System.out.println("After: " + line);
				}
				if (line.contains(playListType)) {
					System.out.println("Before: " + line);
					line = line.replace(playListType, videoCodec);
					System.out.println("After: " + line);
				}
				if (line.contains(playListElements)) {
					System.out.println("Before: " + line);
					StringBuffer content = new StringBuffer();
					for (Video video : playlist.getVideo()) {
						content.append("<a href=\"" + video.getPath() + "\" style=\"background-image:url(" + video.getThumbnail() + ")\"></a>");
					}
					line = line.replace(playListElements, content);
					System.out.println("After: " + line);
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
		
		String cmd = "firefox " + generatedIndexPath;
		CommandLine commandLine = CommandLine.parse(cmd);
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(0);
		executor.execute(commandLine);
    }
    
	
	public static void main(String[] args) throws IOException {

		if (args.length > 0) {
			filename = args[0];
		}
		System.out.println("Converting '" + filename + "' to playlists.");

		// Only transformation
		videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		//VideoGenTransform.addMetadata(videoGen);
		playlist = VideoGenTransform.toPlayList(videoGen, false);
		writeToFile("test.m3u", PlayListTransform.toM3U(playlist));
		writeToFile("test-extended.m3u", PlayListTransform.toM3U(playlist, true, true));
		writeToFile("test.ffmpeg", PlayListTransform.toFFMPEG(playlist));
		writeToFile("test.pls", PlayListTransform.toPLS(playlist));

		// Convertion then transformation
		launchFlowPlayer();
	}

}
