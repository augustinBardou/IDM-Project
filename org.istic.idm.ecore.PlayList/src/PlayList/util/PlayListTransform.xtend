package PlayList.util

import PlayList.PlayList
import java.io.File
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor

class PlayListTransform{
  
	new() { }
   
    def static toPLS(PlayList playlist){
    	val content = new StringBuffer
        content.append("[playlist]\n")
       	var indice = 0
       	for (video: playlist.video) {
       		indice++
			content.append("File" + indice + "=" + video.path + "\n")
        	content.append("Title" + indice + "=" + video.description + "\n")
        	content.append("Length" + indice + "=" + video.duration + "\n")
		}
		content.append("NumberOfEntries=" + indice + "\n")
		content.append("Version=2\n")
        content.toString
    }
    
   
    def static toM3U(PlayList playlist){
    	val content = new StringBuffer
        playlist.video.forEach[video | 
        	 content.append(video.path + "\n")
        ]
        content.toString
    }
    
    def static toM3UEXT(PlayList playlist){
    	val content = new StringBuffer
        content.append("#EXTM3U" + "\n")
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
    
    def static toFlowPlayer(PlayList playList) {
		val indexPath = Paths.get("/home/blacknight/workspace/org.istic.idm.ecore.PlayList/resources/site/index.html").toAbsolutePath
		val cmd = "firefox " + indexPath;
		val commandLine = CommandLine.parse(cmd);
		val executor = new DefaultExecutor();
		executor.setExitValue(1);
		val exitValue = executor.execute(commandLine);
    }
    
}