package org.istic.idm.ecore.PlayList.util

import java.io.FileWriter
import java.nio.file.Path
import org.istic.idm.ecore.PlayList.PlayList
import java.util.Map
import java.util.HashMap
import com.google.common.collect.Lists

class PlayListTransform{
  
	new() { }

	def static writeToFile(Path filename, String content) {
		val writer = new FileWriter(filename.toFile)
		writer.write(content)
		writer.flush()
		writer.close()
	}
	
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
    	return toM3U(playlist, false, false, new HashMap)
    }

    def static toM3U(PlayList playlist, Boolean extended){
    	return toM3U(playlist, extended, false, new HashMap)
    }

    def static toM3U(PlayList playlist, Boolean extended, Boolean discontinued){
    	return toM3U(playlist, extended, false, new HashMap)
    }

    def static toM3U(PlayList playlist, Boolean extended, Boolean discontinued, Map<String, String> options){
    	val content = new StringBuffer
        if (extended) {
        	content.append("#EXTM3U" + "\n")
			content.append("#EXT-X-VERSION:3" + "\n")
			content.append("#EXT-X-MEDIA-SEQUENCE:44850" + "\n")
		}
		if (!options.empty) {
			val list = Lists.newArrayList
			options.forEach[key, value| list.add(key + "=" + value)]
			content.append("#EXT-X-STREAM-INF:" + list.join(",") + "\n")
		}
        playlist.video.forEach[video | 
			if (extended) {
				if (discontinued) {
					content.append("#EXT-X-DISCONTINUITY" + "\n")
				}
				content.append("#EXTINF:" + video.duration + "," + video.description + "\n")
			}
        	content.append(video.path + "\n")
        ]
        if (extended) {
			content.append("#EXT-X-ENDLIST" + "\n")
		}
        content.toString
    }
    
    def static toFFMPEG(PlayList playlist){
    	val content = new StringBuffer
        playlist.video.forEach[video | 
        	content.append(video.path + "\n")
		]
        content.toString
    }
    
}