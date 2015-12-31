package org.istic.idm.xtext.utils

import java.nio.file.Path
import java.nio.file.Paths
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.logging.Logger
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
import com.google.common.collect.Lists

/**
 * Define some VideoGen transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * FIXME: Is it a good idea to have only one class to manage tranformations ? Should it be better to split inside the xtext/ecore framework ?
 */
 public class VideoGenTransform {
 
	/**
	 * Local logger
	 * 
	 * @author <stephane.mangin@freesbee.fr>
	 * 
	 */	
	protected static Logger LOGGER = Logger.getLogger("videoGen.transformations")
	
 	/**
 	 * Add a temporay system path
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * 
	 * TODO: could it be better to instanciate the class and allow the setting of a temporary path (local or remote) ?
 	 */
  	static Path tmp = Paths.get(System.getProperty("java.io.tmpdir") + "/VideoGenGenerated");
  
 	/**
 	 * Transfers (some) metadatas from a VideoGen Sequence instance to a PlayList Video instance (description, length, mime type and url)
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
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
   
 	/**
 	 * Apply the given Optional instance's percentage to allow or not its selectability
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
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
    
 	/**
 	 * Selects a sequence inside the given Alternatices instance accordingly to options' percentages.
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
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
    
 	/**
 	 * Tranform a VideoGen instance to a PlayList instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static toVideoGen(PlayList playList){
        var VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init()
        val VideoGenImpl videoGen = videoGenFactory.createVideoGen() as VideoGenImpl
        
        return videoGen as VideoGen
    }
     
 	/**
 	 * Return the file extention of the given file pathname
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * 
 	 * FIXME: use of Optional should welcomed ! Or add a helper method to detect format with file headers
 	 */ 
    def private static String getFileExtension(String fileName) {
    	var extention = ""
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			extention = fileName.substring(fileName.lastIndexOf(".")+1);
        }
        extention
    }
   
 	/**
 	 * create thumbnails for a Sequence instance
 	 * Use of VideoGenHelper helper class
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#mkDirs(Path)
 	 * @see VideoGenHelper#createThumbnails(Path, Path)
 	 */ 
    def static createThumbnails(Sequence sequence){
	
		val dir = Paths.get(tmp + "/" + "thumbnails/")
		VideoGenHelper.mkDirs(dir)
		val fullPath = Paths.get(sequence.url)
		val extention = getFileExtension(fullPath.fileName.toString)
		val thumbFileName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, ".png"))
		VideoGenHelper.createThumbnails(fullPath, thumbFileName)

		thumbFileName
    }
    
 	/**
 	 * Convert VideoGen Sequence url videos to the given mime type.
 	 * Use of VideoGenHelper helper class 
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#mkDirs(Path)
 	 * @see VideoGenHelper#convert(Path, Path, String)
	 * 
 	 * TODO: somethings should be done better... But what ?
 	 */ 
    def static ConvertTo(VideoCodec type, VideoGen videogen){
		val pathes = Lists.newArrayList
		val dir = Paths.get(tmp + "/" + "converted" + "/" + type.name + "/")
		VideoGenHelper.mkDirs(dir)
        VideoGenHelper.allSequences(videogen).forEach[sequence |
			
			val fullPath = Paths.get(sequence.url)
			val extention = getFileExtension(fullPath.fileName.toString)
			val newFullPathName = Paths.get(dir + "/" + fullPath.fileName.toString.replaceAll("." + extention, "." + type.extention))
			pathes.add(newFullPathName)
			VideoGenHelper.convert(fullPath, newFullPathName, type.format)
			sequence.url = newFullPathName.toAbsolutePath.toString
			sequence.mimetype = Mimetypes_Enum.getByName(type.name)
        ]
        pathes
    }
    
 	/**
 	 * Add some probably missing or misformatted metadatas into the VideoGen instance
 	 * For instance, videos duration and mime types.
 	 * Use of VideoGenHelper helper class 
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 * @see VideoGenHelper#getDuration(Path)
 	 * @see VideoGenHelper#getMimeType(Path)
	 * 
 	 * FIXME: should create a new VideoGen instance to not modify the given one.
 	 */ 
    def static addMetadata(VideoGen videogen){
        
        VideoGenHelper.allSequences(videogen).forEach[sequence |
        	val url = Paths.get(sequence.url)
			sequence.length = VideoGenHelper.getDuration(url)
			sequence.mimetype = VideoGenHelper.getMimeType(url)
        ]
        videogen
    }
    
 	/**
 	 * Tranformation from VideoGen instance to Playlist instance
 	 *  
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
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
    
 	/**
 	 * Transfert some data from a VideoGen Sequence instance to a PlayList Video instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 * 
 	 * FIXME: should find a better way to create this kind of ModelToText transformation. For instance, through multiples methods to get each portions of the resulting document.
 	 */ 
    def static toConfigurator(VideoGen videogen){
    	val thumbnails = new HashMap
    	for (sequence: VideoGenHelper.allSequences(videogen)) {
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