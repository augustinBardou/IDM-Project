package org.istic.idm.xtext.webservice.web.rest;

import com.codahale.metrics.annotation.Timed;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.ecore.PlayList.util.PlayListTransform;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoGenTransform;
import org.istic.idm.xtext.videoGen.Mimetypes_Enum;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for view and managing Flowplayer.
 */
@RestController
@RequestMapping("/api")
public class FlowplayerResource {

    @RequestMapping(value = "/playlist.m3u8",
            method = RequestMethod.GET,
            produces = MediaType.TEXT_PLAIN_VALUE)
    @Timed
    public String getPlayList() {
    	VideoGenStandaloneSetup.doSetup();
		VideoGen videogen = (VideoGen) new ResourceSetImpl().getResource(
			URI.createURI(this.getClass().getResource("/test.vg").toString()), true).getContents().get(0);
		VideoGenTransform.addMetadata(videogen);
		VideoGenTransform.ConvertTo(Mimetypes_Enum.MPEGTS, videogen);
		PlayList playList = VideoGenTransform.toPlayList(videogen, true);
		return PlayListTransform.toM3U(playList, true, true);
    }
}
