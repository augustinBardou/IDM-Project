package org.istic.idm.xtext;

import PlayList.PlayList;
import PlayList.PlayListFactory;
import PlayList.Video;
import PlayList.impl.PlayListFactoryImpl;
import PlayList.impl.PlayListImpl;
import PlayList.impl.VideoImpl;
import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.istic.idm.xtext.DistributedRandomNumberGenerator;
import org.istic.idm.xtext.videoGen.Alternative;
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq;
import org.istic.idm.xtext.videoGen.OptionalVideoSeq;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.istic.idm.xtext.videoGen.VideoGenFactory;
import org.istic.idm.xtext.videoGen.VideoSeq;
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl;
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl;

@SuppressWarnings("all")
public class Transformation {
  public Transformation() {
  }
  
  private static void transferData(final Video p_video, final VideoSeq videoseq) {
    int _length = videoseq.getLength();
    p_video.setDuration(_length);
    String _url = videoseq.getUrl();
    p_video.setPath(_url);
    String _desc = videoseq.getDesc();
    p_video.setDescription(_desc);
  }
  
  private static boolean isOptionable(final OptionalVideoSeq video) {
    DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    float proba = 0;
    VideoSeq _videoseq = video.getVideoseq();
    int _prob = _videoseq.getProb();
    boolean _notEquals = (_prob != 0);
    if (_notEquals) {
      VideoSeq _videoseq_1 = video.getVideoseq();
      int _prob_1 = _videoseq_1.getProb();
      proba = _prob_1;
    } else {
      proba = 50;
    }
    drng.addNumber(1, proba);
    drng.addNumber(0, (100 - proba));
    int _distributedRandomNumber = drng.getDistributedRandomNumber();
    boolean _greaterThan = (_distributedRandomNumber > 0);
    if (_greaterThan) {
      return true;
    }
    return false;
  }
  
  private static VideoSeq getAlternativeVideoSeq(final Alternative alternative) {
    final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    EList<VideoSeq> _videoseqs = alternative.getVideoseqs();
    final int nbAlternative = _videoseqs.size();
    EList<VideoSeq> _videoseqs_1 = alternative.getVideoseqs();
    final Consumer<VideoSeq> _function = (VideoSeq videoseq) -> {
      int count = 0;
      float proba = 0;
      int _prob = videoseq.getProb();
      boolean _notEquals = (_prob != 0);
      if (_notEquals) {
        int _prob_1 = videoseq.getProb();
        proba = _prob_1;
      } else {
        proba = ((1 / nbAlternative) * 100);
      }
      drng.addNumber(count, proba);
    };
    _videoseqs_1.forEach(_function);
    int index = drng.getDistributedRandomNumber();
    EList<VideoSeq> _videoseqs_2 = alternative.getVideoseqs();
    return _videoseqs_2.get(index);
  }
  
  public static VideoGenImpl toVideoGen(final PlayList playList) {
    VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init();
    VideoGen _createVideoGen = videoGenFactory.createVideoGen();
    final VideoGenImpl videoGen = ((VideoGenImpl) _createVideoGen);
    return videoGen;
  }
  
  public static PlayListImpl toPlayList(final VideoGen videogen) {
    PlayListImpl _xblockexpression = null;
    {
      PlayListFactory playlistFactory = PlayListFactoryImpl.init();
      PlayList _createPlayList = playlistFactory.createPlayList();
      final PlayListImpl playlist = ((PlayListImpl) _createPlayList);
      EList<Statement> _statements = videogen.getStatements();
      final Consumer<Statement> _function = (Statement statement) -> {
        VideoSeq videoSeq = null;
        if ((statement instanceof Alternative)) {
          VideoSeq _alternativeVideoSeq = Transformation.getAlternativeVideoSeq(((Alternative)statement));
          videoSeq = _alternativeVideoSeq;
        } else {
          if ((statement instanceof MandatoryVideoSeq)) {
            VideoSeq _videoseq = ((MandatoryVideoSeq)statement).getVideoseq();
            videoSeq = _videoseq;
          } else {
            if ((statement instanceof OptionalVideoSeq)) {
              boolean _isOptionable = Transformation.isOptionable(((OptionalVideoSeq)statement));
              if (_isOptionable) {
                VideoSeq _videoseq_1 = ((OptionalVideoSeq)statement).getVideoseq();
                videoSeq = _videoseq_1;
              }
            }
          }
        }
        boolean _notEquals = (!Objects.equal(videoSeq, null));
        if (_notEquals) {
          PlayListFactoryImpl _playListFactoryImpl = new PlayListFactoryImpl();
          Object obj = _playListFactoryImpl.createVideo();
          VideoImpl p_video = ((VideoImpl) obj);
          Transformation.transferData(p_video, videoSeq);
          EList<Video> _video = playlist.getVideo();
          _video.add(p_video);
        }
      };
      _statements.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  public static String toM3U(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      content.append("# Generated from videoGen\n");
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video video) -> {
        String _path = video.getPath();
        String _plus = (_path + "\n");
        content.append(_plus);
      };
      _video.forEach(_function);
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
  
  public static String toM3UEXT(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      content.append(("#EXTM3U" + "\n"));
      content.append(("# Generated from videoGen" + "\n"));
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video video) -> {
        content.append(("#EXT-X-DISCONTINUITY" + "\n"));
        int _duration = video.getDuration();
        String _plus = ("#EXTINF:" + Integer.valueOf(_duration));
        String _plus_1 = (_plus + ",");
        String _description = video.getDescription();
        String _plus_2 = (_plus_1 + _description);
        String _plus_3 = (_plus_2 + "\n");
        content.append(_plus_3);
        String _path = video.getPath();
        String _plus_4 = (_path + "\n");
        content.append(_plus_4);
      };
      _video.forEach(_function);
      content.append(("#EXT-X-ENDLIST" + "\n"));
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
  
  public static String toFFMPEG(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      _xblockexpression = content.toString();
    }
    return _xblockexpression;
  }
}
