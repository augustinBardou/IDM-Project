package org.istic.idm.xtext

import PlayList.PlayList
import PlayList.Video
import PlayList.impl.PlayListFactoryImpl
import PlayList.impl.PlayListImpl
import PlayList.impl.VideoImpl
import com.xuggle.xuggler.IContainer
import java.io.File
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.istic.idm.xtext.videoGen.Optional
import org.istic.idm.xtext.videoGen.Sequence
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.VideoGenFactory
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl
import org.istic.idm.xtext.videoGen.Alternatives
import org.istic.idm.xtext.videoGen.Mandatory

class VideoGenTransform {
  
	new() { }
   
   	def private static transferData(Video p_video, Sequence videoseq) {
		p_video.duration = videoseq.length
		p_video.path = videoseq.url   
		p_video.description = videoseq.description 
		p_video.mimetype = videoseq.mimetype
   	}
   
    def private static isSelected(Optional video) {
        
        var DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        
        var float proba
        
        if(video.probability != 0){
            proba = video.probability
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
    
    def private static selectSequence(Alternatives alternatives) {
        
        val DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        val nbAlternatives = alternatives.options.length
       	
        alternatives.options.forEach[option |
            var int count = 0
            var double proba
            if(option.probability != 0){
                proba = option.probability
            } else {
                proba = 100 / nbAlternatives
            }
            drng.addNumber(count, proba)
            count++
        ]
            
        var int index = drng.getDistributedRandomNumber()
        return alternatives.options.get(index).sequence
    }
    
    def static toVideoGen(PlayList playList){
        var VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init()
        val VideoGenImpl videoGen = videoGenFactory.createVideoGen() as VideoGenImpl
        
        return videoGen as VideoGen
    }
    
    def static private List<Sequence> allSequences(VideoGen videoGen) {
		val List<Sequence> sequences = new ArrayList<Sequence>
			
        videoGen.statements.forEach[statement |
			if (statement instanceof Alternatives) {
				statement.options.forEach[option |
					sequences += option.sequence
				]
			} else if(statement instanceof Mandatory) {
				sequences += statement.sequence
			} else if(statement instanceof Optional) {
				sequences += statement.sequence
			}
		]
		sequences
    }
     
    def private static String getFileExtension(String fileName) {
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			return fileName.substring(fileName.lastIndexOf(".")+1);
        }
        return "";
    }
   
    def static createThumbnails(VideoGen videogen){

        allSequences(videogen).forEach[sequence |
			
			val fullPath = Paths.get(sequence.url)
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
		
        allSequences(videogen).forEach[sequence |
			
			val fullPath = Paths.get(sequence.url)
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
			sequence.url = wd + "/" + type.format + "/" + newFullPathName
			sequence.mimetype = type.mimeType
        ]
    }
    
    def static addMetadata(VideoGen videogen){
        
        allSequences(videogen).forEach[sequence |

			val IContainer container = IContainer.make()
			if (container.open(new File(sequence.url).absolutePath, IContainer.Type.READ, null) <0) {
				   throw new RuntimeException("failed to open");
			}
			sequence.length = (container.duration / 1000000) as int;
			//video.mime = container.format.outputFormatMimeType;
        ]
    }
    
    def static toPlayList(VideoGen videogen){
        var PlayListFactoryImpl playlistFactory = PlayListFactoryImpl.init() as PlayListFactoryImpl
        val PlayListImpl playlist = playlistFactory.createPlayList() as PlayListImpl
        
        videogen.statements.forEach[statement |
			var Sequence sequence = null
			
			if(statement instanceof Mandatory) {
				sequence = statement.sequence
			} else if(statement instanceof Optional) {
				if(isSelected(statement)){
					sequence = statement.sequence
				}
			} else if (statement instanceof Alternatives) {
				sequence = selectSequence(statement)
			}
			if (sequence != null) {
				var Object obj = new PlayListFactoryImpl().createVideo()
				var p_video = obj as Video
				transferData(p_video, sequence)
				playlist.video.add(p_video as VideoImpl)
			}
        ]
        playlist
    }
    
    
    def static toConfigurator(VideoGen videogen){
       	'''
       	<div class="videogen">
       		<button class="generate">Generate</button>
       		«FOR statement: videogen.statements»
       			<div class="videoseq">
       			«IF statement instanceof Alternatives»
					«FOR option: statement.options»
						<div>«option.sequence.name» - «option.sequence.description»</div>
						<button type="radio">Activate ?</div>
				   	«ENDFOR»
				«ENDIF»
				«IF statement instanceof Mandatory»
					<div>«statement.sequence.name» - «statement.sequence.description»</div>
				«ENDIF»
				«IF statement instanceof Optional»
					<div>«statement.sequence.name» - «statement.sequence.description»</div>
					«IF statement.probability == 0»
						<button type="radio">Activate ?</div>
					«ENDIF»
				«ENDIF»
       			</div>
       		«ENDFOR»
       	</div>
       	''' 
    }
    
}