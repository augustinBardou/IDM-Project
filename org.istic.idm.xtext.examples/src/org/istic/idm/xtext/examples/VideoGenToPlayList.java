package org.istic.idm.xtext.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.istic.idm.ecore.PlayList.impl.PlayListImpl;
import org.istic.idm.ecore.PlayList.util.PlayListTransform;
import org.istic.idm.xtext.VideoCodec;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.VideoGenTransform;
import org.istic.idm.xtext.videoGen.VideoGen;


public class VideoGenToPlayList {

	static VideoGen videoGen;
	static PlayListImpl playlist;
	static String filename = "test.vg";
	
	private static void writeToFile(String filename, String content) {
		FileWriter writer;
		try {
			writer = new FileWriter(new File(filename));
			writer.write(content);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void saveM3U() throws IOException {
		writeToFile("test.m3u", PlayListTransform.toM3U(playlist));
		System.out.println("M3U done.");
	}
	
	public static void saveM3UEXT() throws IOException {
		writeToFile("test-extended.m3u", PlayListTransform.toM3U(playlist, true, true));
		System.out.println("M3UEXT done.");
	}
	
	public static void saveFFMPEG() throws IOException {
		writeToFile("test.ffmpeg", PlayListTransform.toFFMPEG(playlist));
		System.out.println("FFMPEG done.");
	}
	
	public static void savePLS() throws IOException {
		writeToFile("test.pls", PlayListTransform.toPLS(playlist));
		System.out.println("PLS done.");
	}

	public static void launchFlowPlayer() throws IOException {
		writeToFile("flowplayer.m3u8", PlayListTransform.toM3U(playlist, true, true));
		PlayListTransform.toFlowPlayer(playlist);
		System.out.println("Flowplayer launched...");
	}
	
	public static void launchConfigurator() throws IOException {
		writeToFile("flowplayer.m3u8", PlayListTransform.toM3U(playlist, true, true));
		VideoGenTransform.toConfigurator(videoGen);
		System.out.println("Configurator launched...");
	}
	
	public static void main(String[] args) throws IOException {

		if (args.length > 0) {
			filename = args[0];
		}
		System.out.println("Converting '" + filename + "' to playlists.");

		// Only transformation
		videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		VideoGenTransform.createThumbnails(videoGen);
		VideoGenTransform.addMetadata(videoGen);
		playlist = VideoGenTransform.toPlayList(videoGen);
		saveM3U();
		saveM3UEXT();
		saveFFMPEG();
		savePLS();
		
		// Convertion then transformation
		VideoGenTransform.ConvertTo(VideoCodec.MPEGTS, videoGen);
		playlist = VideoGenTransform.toPlayList(videoGen);
		launchFlowPlayer();
		launchConfigurator();
	}

}
