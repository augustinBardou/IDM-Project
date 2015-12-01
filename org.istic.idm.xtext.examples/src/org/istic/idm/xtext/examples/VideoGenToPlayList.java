package org.istic.idm.xtext.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.VideoGenTransform;
import org.istic.idm.xtext.videoGen.VideoGen;

import PlayList.PlayList;
import PlayList.util.PlayListTransform;


public class VideoGenToPlayList {

	static VideoGen videoGen;
	static PlayList playlist;
	static String filename = "test.vg";
	
	public static void saveM3U() throws IOException {
		File m3u = new File("test.m3u");
		FileWriter writer = new FileWriter(m3u);
		writer.write(PlayListTransform.toM3U(playlist));
		writer.flush();
		writer.close();
		System.out.println("M3U done.");
	}
	
	public static void saveM3UEXT() throws IOException {
		File m3uext = new File("test-extended.m3u");
		FileWriter writer = new FileWriter(m3uext);
		writer.write(PlayListTransform.toM3UEXT(playlist));
		writer.flush();
		writer.close();
		System.out.println("M3UEXT done.");
	}
	
	public static void saveFFMPEG() throws IOException {
		File ffmpeg = new File("test.ffmpeg");
		FileWriter writer = new FileWriter(ffmpeg);
		writer.write(PlayListTransform.toFFMPEG(playlist));
		writer.flush();
		writer.close();
		System.out.println("FFMPEG done.");
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			filename = args[0];
		}
		System.out.println("Converting '" + filename + "' to playlists.");
		videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		playlist = VideoGenTransform.toPlayList(videoGen);
		saveM3U();
		saveM3UEXT();
		saveFFMPEG();
	}

}
