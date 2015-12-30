package org.istic.idm.xtext.utils

import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import org.istic.idm.ecore.PlayList.PlayList
import org.istic.idm.ecore.PlayList.Video
import org.istic.idm.ecore.PlayList.impl.PlayListFactoryImpl
import org.istic.idm.ecore.PlayList.impl.PlayListImpl
import org.istic.idm.ecore.PlayList.impl.VideoImpl
import org.istic.idm.xtext.videoGen.Alternatives
import org.istic.idm.xtext.videoGen.Mandatory
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import org.istic.idm.xtext.videoGen.Optional
import org.istic.idm.xtext.videoGen.Sequence
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.VideoGenFactory
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl
import java.util.HashMap

public class VideoGenTransform {
  
  	static Path tmp = Paths.get(System.getProperty("java.io.tmpdir") + "/VideoGenGenerated");
  
	new() { }
  
   	def private static transferData(Video p_video, Sequence videoseq) {
		p_video.duration = videoseq.length
		p_video.path = videoseq.url
		if (videoseq.description == null) {
			p_video.description = ""
		} else {
			p_video.description = videoseq.description
		}
		p_video.mimetype = videoseq.mimetype.getName
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
   
    def static Path createThumbnails(Sequence sequence){
	
		val dir = Paths.get(tmp + "/" + "thumbnails/")
		println("Thumbnails Temporary folder: " + dir)
		VideoGenHelper.mkDirs(dir)
		val fullPath = Paths.get(sequence.url)
		val extention = getFileExtension(fullPath.fileName.toString)
		val thumbFileName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, ".png"))
		VideoGenHelper.createThumbnails(fullPath, thumbFileName)
		thumbFileName
    }
    
    def static ConvertTo(VideoCodec type, VideoGen videogen){
		
		val dir = Paths.get(tmp + "/" + "converted" + "/" + type.name + "/")
		if (dir.toFile.exists) {
			VideoGenHelper.mkDirs(dir)
		}
		println("Convertion Temporary folder: " + dir)
		VideoGenHelper.mkDirs(dir)
        allSequences(videogen).forEach[sequence |
			
			val fullPath = Paths.get(sequence.url)
			val extention = getFileExtension(fullPath.fileName.toString)
			val newFullPathName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, "." + type.extention))
			VideoGenHelper.convert(fullPath, newFullPathName, type.format)
			sequence.url = newFullPathName.toAbsolutePath.toString
			sequence.mimetype = Mimetypes_Enum.getByName(type.name)
        ]
    }
    
    def static addMetadata(VideoGen videogen){
        
        allSequences(videogen).forEach[sequence |
        	val url = Paths.get(sequence.url)
			sequence.length = VideoGenHelper.getDuration(url)
			sequence.mimetype = VideoGenHelper.getMimeType(url)
        ]
        videogen
    }
    
    def static toPlayList(VideoGen videogen, Boolean withThumbnail){
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
				var video = p_video as VideoImpl
				if (withThumbnail) {
					video.thumbnail = createThumbnails(sequence).toAbsolutePath.toString
				}
				playlist.video.add(p_video as VideoImpl)
			}
        ]
        playlist
    }
    
    
    def static toConfigurator(VideoGen videogen){
    	val thumbnails = new HashMap
    	for (sequence: videogen.allSequences) {
    		thumbnails.put(sequence.name, createThumbnails(sequence))
    	}
	    '''
<!-- Automatically generated by VideoGen -->
<!--style type="text/css">
	#configurator {
		background-color:rgba(72,72,72,0.4);
		padding-left:35px;
		padding-right:35px;
		padding-top:35px;
		padding-bottom:50px;
		width: auto;
		height: auto;
		min-height: 100%;
		overflow:auto;
		position: relative;
		margin-top:-130px;
		-moz-border-radius: 7px;
		-webkit-border-radius: 7px;
		border-radius: 7px;
		clear: both;
  	}

	#configurator .sequence {
		font-size: medium;	
		margin-top: 10px;
		margin-right: 10px;
		padding:10px;
		display: block;
		width : 120px;
		height: 120px;
		float: left;
		text-align: center;
		border: 2px solid #000;
		-webkit-border-radius: 5px;
		-moz-border-radius: 5px;
		border-radius: 5px;
	}
	#configurator .description {
		font-size: small;
		font-stretch: condensed;
		font-variant: small-caps;
		margin-bottom : 5px;
		height: 70px;
	}

	#configurator .sequence img, select, option {
		width: 80px;
		height: 80px;
		margin: 5px;
		max-width: 100%;
		-webkit-border-radius: 50px;
		-moz-border-radius: 50px;
		border-radius: 50px;
		background: transparent !important
	}
	
	#button_valid{
		float:left;
		width: 100%;
		height: 50px;
		color: #0493bd;
		border: #fbfbfb solid 4px;
		cursor:pointer;
		background-color: rgba(0,0,0,0);
		font-size:24px;
		-webkit-transition: all 0.3s;
		-moz-transition: all 0.3s;
		transition: all 0.3s;
		font-weight:700;
		border-radius: 5px;
	}

	#button_valid:hover{
		background-color: #3498db;
		color:white;
	}
		
	.submit:hover {
		color: #3498db;
	}
		
	.ease {
		width: 0px;
		height: 74px;
		background-color: #fbfbfb;
		-webkit-transition: .3s ease;
		-moz-transition: .3s ease;
		-o-transition: .3s ease;
		-ms-transition: .3s ease;
		transition: .3s ease;
	}

	.submit:hover .ease{
	  width:100%;
	  background-color:white;
	}

</style-->
<script type="application/javascript">
function showTitle(name, description) {
	document.getElementById(name).value = description;
}
</script>
<form name="configurator" id="configurator" action="%actionUrl%">
<input class="button" type="submit" value="Generate" id="button_valid"><br />
«FOR statement: videogen.statements»
	«IF statement instanceof Alternatives»
		<div id="«statement.name»" class="sequence">
			<span id="«statement.name»_title" class="description">«statement.options.get(0).sequence.description»</span><br />
				<div class="alternatives">
				«FOR option: statement.options»
						<input checked id="«option.sequence.name»" onchange="showTitle('«statement.name»_title', '«option.sequence.description»')" type="radio" name="«statement.name»" value="«option.sequence.name»" />
						<label for="«option.sequence.name»" style="background-image:url('«thumbnails.get(option.sequence.name)»');"></label>
				«ENDFOR»
				</div>
			</div>
	«ENDIF»
	«IF statement instanceof Mandatory»
		<div id="«statement.sequence.name»" class="sequence mandatory">
			<label class="description">«statement.sequence.description»</label><br />
			<img src="«thumbnails.get(statement.sequence.name)»"/><br />
			<input hidden name="«statement.sequence.name»" value="«statement.sequence.name»">
		</div>
	«ENDIF»
	«IF statement instanceof Optional»
		<div id="«statement.sequence.name»" class="sequence optional">
			<label class="description">«statement.sequence.description»</label><br />
			<input name="«statement.sequence.name»" type="checkbox" value="1" checked/><br />
			<img src="«thumbnails.get(statement.sequence.name)»"/>
		</div>
	«ENDIF»
«ENDFOR»
</form>'''
	}
    
}