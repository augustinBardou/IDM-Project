package org.istic.idm.xtext.examples;

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
	
	public VideoGenToPlayList() {
		// TODO Auto-generated constructor stub
		videoGen = VideoGenStandaloneSetup.loadVideoGen("test.vg");
		playlist = VideoGenTransform.toPlayList(videoGen);
		
	}

	public static void saveM3U() throws IOException {
		FileWriter writer = new FileWriter("test.m3u");
		writer.write(PlayListTransform.toM3U(playlist));
		writer.flush();
		writer.close();
	}
	
	public static void saveM3UEXT() throws IOException {
		FileWriter writer = new FileWriter("test.m3u");
		writer.write(PlayListTransform.toM3UEXT(playlist));
		writer.flush();
		writer.close();
	}
	
	public static void saveFFMPEG() throws IOException {
		FileWriter writer = new FileWriter("test.m3u");
		writer.write(PlayListTransform.toFFMPEG(playlist));
		writer.flush();
		writer.close();
	}
	
	public static void main(String[] args) throws IOException {
		saveM3U();
		saveM3UEXT();
		saveFFMPEG();
	}

}
