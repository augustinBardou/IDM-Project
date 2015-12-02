package org.istic.idm.xtext.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.VideoGenTransform;
import org.istic.idm.xtext.VideoCodec;
import org.istic.idm.xtext.videoGen.VideoGen;

import PlayList.PlayList;
import PlayList.impl.PlayListImpl;
import PlayList.util.PlayListTransform;


public class VideoGenToPlayList {

	static String filename = "test.vg";
	
	public static void saveM3U() throws IOException {
		VideoGen videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		PlayListImpl playlist = VideoGenTransform.toPlayList(videoGen);
		File m3u = new File("test.m3u");
		FileWriter writer = new FileWriter(m3u);
		writer.write(PlayListTransform.toM3U(playlist));
		writer.flush();
		writer.close();
		System.out.println("M3U done.");
	}
	
	public static void saveM3UEXT() throws IOException {
		VideoGen videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		VideoGenTransform.addMissingMetadata(videoGen);
		PlayListImpl playlist = VideoGenTransform.toPlayList(videoGen);
		File m3uext = new File("test-extended.m3u");
		FileWriter writer = new FileWriter(m3uext);
		writer.write(PlayListTransform.toM3UEXT(playlist));
		writer.flush();
		writer.close();
		System.out.println("M3UEXT done.");
	}
	
	public static void saveFFMPEG() throws IOException {
		VideoGen videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		VideoGenTransform.addMissingMetadata(videoGen);
		PlayListImpl playlist = VideoGenTransform.toPlayList(videoGen);
		File ffmpeg = new File("test.ffmpeg");
		FileWriter writer = new FileWriter(ffmpeg);
		writer.write(PlayListTransform.toFFMPEG(playlist));
		writer.flush();
		writer.close();
		System.out.println("FFMPEG done.");
	}
	
	public static void savePLS() throws IOException {
		VideoGen videoGen = VideoGenStandaloneSetup.loadVideoGen(filename);
		VideoGenTransform.addMissingMetadata(videoGen);
		VideoGenTransform.ConvertTo(VideoCodec.MPEGTS, videoGen);
		PlayListImpl playlist = VideoGenTransform.toPlayList(videoGen);
		File ffmpeg = new File("test.pls");
		FileWriter writer = new FileWriter(ffmpeg);
		writer.write(PlayListTransform.toPLS(playlist));
		writer.flush();
		writer.close();
		System.out.println("PLS done.");
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			filename = args[0];
		}
		System.out.println("Converting '" + filename + "' to playlists.");
		saveM3U();
		saveM3UEXT();
		saveFFMPEG();
		savePLS();
	}

}
