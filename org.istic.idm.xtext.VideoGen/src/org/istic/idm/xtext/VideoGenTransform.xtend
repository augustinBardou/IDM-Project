package org.istic.idm.xtext

import PlayList.PlayList
import PlayList.Video
import PlayList.impl.PlayListFactoryImpl
import PlayList.impl.PlayListImpl
import PlayList.impl.VideoImpl
import com.xuggle.xuggler.IContainer
import java.io.File
import org.istic.idm.xtext.videoGen.Alternative
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq
import org.istic.idm.xtext.videoGen.OptionalVideoSeq
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.VideoGenFactory
import org.istic.idm.xtext.videoGen.VideoSeq
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl
import org.istic.idm.xtext.videoGen.impl.VideoSeqImpl

class VideoGenTransform {
  
	new() { }
   
   	def private static transferData(Video p_video, VideoSeq videoseq) {
		p_video.duration = videoseq.length
		p_video.path = videoseq.url   
		p_video.description = videoseq.desc  
   	}
    
    def private static isOptionable(OptionalVideoSeq video) {
        
        var DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        
        var float proba
        
        if(video.videoseq.prob != 0){
            proba = video.videoseq.prob
        } else {
            proba = 50
        }
        
        drng.addNumber(1, proba)
        drng.addNumber(0, 100-proba)
        
        if(drng.getDistributedRandomNumber() > 0){
            return true
        }
        return false
    }
    
    def private static getAlternativeVideoSeq(Alternative alternative) {
        
        val DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        val nbAlternative = alternative.getVideoseqs().size
       	
        alternative.getVideoseqs().forEach[videoseq |
            var int count = 0
            var float proba
            if(videoseq.prob != 0){
                proba = videoseq.prob
            } else {
                proba = ((1 / nbAlternative) * 100)
            }
            drng.addNumber(count, proba)
        ]
            
        var int index = drng.getDistributedRandomNumber()
        return alternative.getVideoseqs().get(index) as VideoSeqImpl
    }
    
    def static toVideoGen(PlayList playList){
        var VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init()
        val VideoGenImpl videoGen = videoGenFactory.createVideoGen() as VideoGenImpl
        
        return videoGen as VideoGen
    }
    
    def static addMissingMetadata(VideoGen videogen){
        
        videogen.getStatements().forEach[statement |
			var VideoSeq videoSeq = null
			
			if (statement instanceof Alternative) {
				videoSeq = getAlternativeVideoSeq(statement)
			} else if(statement instanceof MandatoryVideoSeq){
				videoSeq = statement.videoseq
			} else if(statement instanceof OptionalVideoSeq) {
				if(isOptionable(statement)){
					videoSeq = statement.videoseq
				}
			}
			if (videoSeq != null) {
				val IContainer container = IContainer.make()
				if (container.open(new File(videoSeq.url).absolutePath, IContainer.Type.READ, null) <0) {
					   throw new RuntimeException("failed to open");  
				}
				var numStreams = container.getNumStreams();  
				for(var i = 0; i < numStreams; i++) {  
					videoSeq.length = (container.duration / 1000000) as int;
				}  
			}
        ]
    }
    
    
    def static toPlayList(VideoGen videogen){
        var PlayListFactoryImpl playlistFactory = PlayListFactoryImpl.init() as PlayListFactoryImpl
        val PlayListImpl playlist = playlistFactory.createPlayList() as PlayListImpl
        
        videogen.getStatements().forEach[statement |
			var VideoSeq videoSeq = null
			
			if (statement instanceof Alternative) {
				videoSeq = getAlternativeVideoSeq(statement)
			} else if(statement instanceof MandatoryVideoSeq){
				videoSeq = statement.videoseq
			} else if(statement instanceof OptionalVideoSeq) {
				if(isOptionable(statement)){
					videoSeq = statement.videoseq
				}
			}
			if (videoSeq != null) {
				var Object obj = new PlayListFactoryImpl().createVideo()
				var p_video = obj as Video
				transferData(p_video, videoSeq)
				playlist.video.add(p_video as VideoImpl)
			}
        ]
        playlist
    }
    
}