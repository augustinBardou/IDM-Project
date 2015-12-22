package org.istic.idm.xtext.VideoGen.service;

import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.xtext.utils.VideoGenTransform;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/converters")
public class Converters {

	@RequestMapping(value="/videoGenToPlayList", method=RequestMethod.POST)
	public PlayList fromVideoGenToPlayList(@RequestParam("videoGen") VideoGen videoGen) {
		return VideoGenTransform.toPlayList(videoGen, true);
	}
	
}
