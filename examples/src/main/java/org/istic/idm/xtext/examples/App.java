package org.istic.idm.xtext.examples;

import org.istic.idm.xtext.Transformation;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.videoGen.VideoGen;

import PlayList.PlayList;

public class App 
{
	public static void main(String[] args) {
        VideoGen videoGen = VideoGenStandaloneSetup.loadVideoGen("test.vg");
        PlayList playlist = Transformation.toPlayList(videoGen);
        System.out.println(Transformation.toM3U(playlist));
        System.out.println(Transformation.toM3UEXT(playlist));
        System.out.println(Transformation.toFFMPEG(playlist));
	}

}
