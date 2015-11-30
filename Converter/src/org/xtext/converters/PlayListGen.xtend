package org.xtext.converters

import java.io.File
import java.io.FileWriter
import java.net.URI
import org.xtext.videogen.dsl.Alternative

class PlaylistGen{
    
    new(){}
    
    def loadVideoGen(URI uri) {
        new VideogenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
        var res = new ResourceSetImpl().getResource(uri, true);
        res.contents.get(0) as VideoGen
    }
    
    def determineIfOptionalIsAdded(Optional video) {
        
        var DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        
        var float proba
        
        if(video.videoseq.proba != null){
            proba = Float.parseFloat(video.videoseq.proba)
        } else {
            proba = Float.parseFloat("0.5")
        }
        
        drng.addNumber(1, proba)
        drng.addNumber(0, 1-proba)
        
        if(drng.getDistributedRandomNumber() > 0){
            return true
        }
        return false
    }
    
    def determineWhichAlternativeIsAdded(Alternative video) {
        
        val DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator()
        val nbAlternative = video.videoseqs.size
        println(nbAlternative)
        
        video.videoseqs.forEach[videoseq |
            var int count = 0
            var float proba
            println(videoseq.proba)
            if(videoseq.proba != null){
                proba = Float.parseFloat(videoseq.proba)
            } else {
                proba = 1f / nbAlternative
            }
            drng.addNumber(count, proba)
        ]
            
        var int index = drng.getDistributedRandomNumber()
        
        return index
    }
    
    
    def videogenModelToPlaylistModel(VideoGen videogen){
        var PlaylistFactory playlistFactory = PlaylistFactoryImpl.init()
        val PlaylistImpl playlist = playlistFactory.createPlaylist() as PlaylistImpl
        
        videogen.videos.forEach[video |
            var Object obj = new PlaylistFactoryImpl().createVideoseq()
            var p_videoseq = obj as VideoseqImpl
            
            if (video instanceof Alternative) {
                var index = determineWhichAlternativeIsAdded(video)
                p_videoseq.duration = video.videoseqs.get(index).duree
                p_videoseq.location = video.videoseqs.get(index).location   
            } else if(video instanceof Mandatory){
                p_videoseq.duration = video.videoseq.duree
                p_videoseq.location = video.videoseq.location           
            } else if(video instanceof Optional) {
                if(determineIfOptionalIsAdded(video)){
                    p_videoseq.duration = video.videoseq.duree
                    p_videoseq.location = video.videoseq.location
                }
            } else {
                println("Instance inconnue");
            }
            playlist.addVideoseq(p_videoseq)
        ]
        
        return playlist
    }
    
    def playlistToM3U(URI uri, PlaylistImpl playlist){
        var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, true);
        fw.write("# This is a comment")
        playlist.videos.forEach[ videoseq | 
            
        ]
    }
    
    def playlistToM3UEtendue(){
        
    }
    
    def playlistToFfmpeg(){
        
    }
    
    def static void main(String[] args) {
        
        var playlistGen = new PlaylistGen
        
        var videoGen = playlistGen.loadVideoGen(URI.createURI("foo.videogen"))
        
        var playlist = playlistGen.videogenModelToPlaylistModel(videoGen)
        
        playlistGen.playlistToM3U(URI.createURI(""), playlist)

    }
}