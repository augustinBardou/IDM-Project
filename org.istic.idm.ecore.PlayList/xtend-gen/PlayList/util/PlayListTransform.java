package PlayList.util;

import PlayList.PlayList;
import PlayList.Video;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class PlayListTransform {
  public PlayListTransform() {
  }
  
  public static String toM3U(final PlayList playlist) {
    String _xblockexpression = null;
    {
      final StringBuffer content = new StringBuffer();
      content.append("# Generated from videoGen\n");
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = new Consumer<Video>() {
        public void accept(final Video video) {
          String _path = video.getPath();
          String _plus = (_path + "\n");
          content.append(_plus);
        }
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
      final Consumer<Video> _function = new Consumer<Video>() {
        public void accept(final Video video) {
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
        }
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
