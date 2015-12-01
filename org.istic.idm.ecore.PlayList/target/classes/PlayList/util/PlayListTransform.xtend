package PlayList.util

import PlayList.PlayList
import PlayList.PlayListFactory
import PlayList.Video
import PlayList.impl.PlayListFactoryImpl
import PlayList.impl.PlayListImpl
import PlayList.impl.VideoImpl
import org.istic.idm.xtext.DistributedRandomNumberGenerator
import org.istic.idm.xtext.videoGen.Alternative
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq
import org.istic.idm.xtext.videoGen.OptionalVideoSeq
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.VideoGenFactory
import org.istic.idm.xtext.videoGen.VideoSeq
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl

class PlayListTransform{
  
	new() { }
   
    def static toM3U(PlayList playlist){
    	val content = new StringBuffer
        content.append("# Generated from videoGen\n")
        playlist.video.forEach[video | 
        	 content.append(video.path + "\n")
        ]
        content.toString
    }
    
    def static toM3UEXT(PlayList playlist){
    	val content = new StringBuffer
        content.append("#EXTM3U" + "\n")
        content.append("# Generated from videoGen" + "\n")
        playlist.video.forEach[video | 
			 content.append("#EXT-X-DISCONTINUITY" + "\n")
        	 content.append("#EXTINF:" + video.duration + "," + video.description + "\n")
        	 content.append(video.path + "\n")
        ]
        content.append("#EXT-X-ENDLIST" + "\n")
        content.toString
    }
    
    def static toFFMPEG(PlayList playlist){
    	val content = new StringBuffer
        content.toString
    }
    
}