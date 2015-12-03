package org.istic.idm.xtext

import PlayList.PlayList
import PlayList.Video
import PlayList.impl.PlayListFactoryImpl
import PlayList.impl.PlayListImpl
import PlayList.impl.VideoImpl
import com.xuggle.xuggler.IContainer
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.List
import org.istic.idm.xtext.videoGen.Alternative
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq
import org.istic.idm.xtext.videoGen.OptionalVideoSeq
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.VideoGenFactory
import org.istic.idm.xtext.videoGen.VideoSeq
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl
import org.istic.idm.xtext.videoGen.impl.VideoSeqImpl
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import java.nio.file.Paths

class VideoGenTransform {
  
	new() { }
   
   	def private static transferData(Video p_video, VideoSeq videoseq) {
		p_video.duration = videoseq.length
		p_video.path = videoseq.url   
		p_video.description = videoseq.desc  
		p_video.mimetype = videoseq.mime  
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
                proba = 100 / nbAlternative
            }
            drng.addNumber(count, proba)
            count++
        ]
            
        var int index = drng.getDistributedRandomNumber()
        return alternative.getVideoseqs().get(index) as VideoSeqImpl
    }
    
    def static toVideoGen(PlayList playList){
        var VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init()
        val VideoGenImpl videoGen = videoGenFactory.createVideoGen() as VideoGenImpl
        
        return videoGen as VideoGen
    }
    
    def static private List<VideoSeq> allVideos(VideoGen videoGen) {
		val List<VideoSeq> videoSeqs = new ArrayList<VideoSeq>
			
        videoGen.getStatements().forEach[statement |
			if (statement instanceof Alternative) {
				statement.videoseqs.forEach[video |
					videoSeqs += video
				]
			} else if(statement instanceof MandatoryVideoSeq){
				videoSeqs += statement.videoseq
			} else if(statement instanceof OptionalVideoSeq) {
				videoSeqs += statement.videoseq
			}
		]
		videoSeqs
    }
     
    def private static String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			return fileName.substring(fileName.lastIndexOf(".")+1);
        }
        return "";
    }
   
    def static createThumbnails(VideoGen videogen){

        allVideos(videogen).forEach[video |
			
			val fullPath = Paths.get(video.url)
			val wd = fullPath.parent
			val extention = getFileExtension(fullPath.fileName.toString)
			val thumbPathName = fullPath.fileName.toString.replaceAll("." + extention, ".png")
			val cmd = "avconv -i \"" + fullPath.fileName + "\" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 \"thumbnails/" + thumbPathName + "\""
			println(cmd)
			val commandLine = CommandLine.parse(cmd)
			val mkdir = CommandLine.parse("mkdir thumbnails")
			try {
				val executor = new DefaultExecutor()
				executor.setExitValue(1)
				executor.workingDirectory = wd.toFile
				executor.execute(mkdir)
			} catch (Exception e) {
				println(e.message)
			}
			try {
				val executor = new DefaultExecutor()
				executor.setExitValue(1)
				executor.workingDirectory = wd.toFile
				executor.execute(commandLine)
			} catch (Exception e) {
				println(e.message)
			}
        ]
    }
    
    def static ConvertTo(VideoCodec type, VideoGen videogen){
		
        allVideos(videogen).forEach[video |
			
			val fullPath = Paths.get(video.url)
			val wd = fullPath.parent
			val extention = getFileExtension(fullPath.fileName.toString)
			val newFullPathName =  "videogen_" + fullPath.fileName.toString.replaceAll("." + extention, "." + type.extention)
			val cmd = "avconv -i \"" + fullPath.fileName + "\" -strict -2 -f " + type.format + " \"" + type.format + "/" + newFullPathName + "\""
			println(cmd)
			try {
				val mkdir = CommandLine.parse("mkdir " + type.format)
				val executor = new DefaultExecutor()
				executor.setExitValue(1)
				executor.workingDirectory = wd.toFile
				executor.execute(mkdir)
			} catch (Exception e) {
				println(e.message)
			}
			try {
				val commandLine = CommandLine.parse(cmd)
				val executor = new DefaultExecutor()
				executor.setExitValue(1)
				executor.workingDirectory = wd.toFile
				executor.execute(commandLine)
			} catch (Exception e) {
				println(e.message)
			}
			video.url = wd + "/" + type.format + "/" + newFullPathName
			video.mime = type.mimeType
        ]
    }
    
    def static addMetadata(VideoGen videogen){
        
        allVideos(videogen).forEach[video |

			val IContainer container = IContainer.make()
			if (container.open(new File(video.url).absolutePath, IContainer.Type.READ, null) <0) {
				   throw new RuntimeException("failed to open");
			}
			video.length = (container.duration / 1000000) as int;
			//video.mime = container.format.outputFormatMimeType;
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