package org.istic.idm.xtext.utils;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import fr.nemomen.utils.VideoCodec;
import fr.nemomen.utils.Videos;
import fr.nemomen.utils.randomizers.DistributedRandomNumberGenerator;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.logging.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.ecore.PlayList.PlayListFactory;
import org.istic.idm.ecore.PlayList.Video;
import org.istic.idm.ecore.PlayList.impl.PlayListFactoryImpl;
import org.istic.idm.ecore.PlayList.impl.PlayListImpl;
import org.istic.idm.ecore.PlayList.impl.VideoImpl;
import org.istic.idm.xtext.utils.VideoGenHelper;
import org.istic.idm.xtext.videoGen.Alternatives;
import org.istic.idm.xtext.videoGen.Mandatory;
import org.istic.idm.xtext.videoGen.Mimetypes_Enum;
import org.istic.idm.xtext.videoGen.Optional;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.istic.idm.xtext.videoGen.VideoGenFactory;
import org.istic.idm.xtext.videoGen.impl.VideoGenFactoryImpl;
import org.istic.idm.xtext.videoGen.impl.VideoGenImpl;

/**
 * Define some VideoGen transformation's specifications
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * FIXME: Is it a good idea to have only one class to manage tranformations ? Should it be better to split inside the xtext/ecore framework ?
 */
@SuppressWarnings("all")
public class VideoGenTransform {
  /**
   * Local logger
   * 
   * @author <stephane.mangin@freesbee.fr>
   */
  protected static Logger LOGGER = Logger.getLogger("videoGen.transformations");
  
  /**
   * Add a temporay system path
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * TODO: could it be better to instanciate the class and allow the setting of a temporary path (local or remote) ?
   */
  private static Path tmp = Paths.get((System.getProperty("java.io.tmpdir") + "/VideoGenGenerated"));
  
  /**
   * Transfers (some) metadatas from a VideoGen Sequence instance to a PlayList Video instance (description, length, mime type and url)
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static void transferData(final Video p_video, final Sequence videoseq) {
    int _length = videoseq.getLength();
    p_video.setDuration(_length);
    String _url = videoseq.getUrl();
    p_video.setPath(_url);
    String _description = videoseq.getDescription();
    boolean _equals = Objects.equal(_description, null);
    if (_equals) {
      p_video.setDescription("");
    } else {
      String _description_1 = videoseq.getDescription();
      p_video.setDescription(_description_1);
    }
    Mimetypes_Enum _mimetype = videoseq.getMimetype();
    String _name = _mimetype.getName();
    p_video.setMimetype(_name);
  }
  
  /**
   * Apply the given Optional instance's percentage to allow or not its selectability
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static boolean isSelected(final Optional video) {
    DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    float proba = 0;
    int _probability = video.getProbability();
    boolean _notEquals = (_probability != 0);
    if (_notEquals) {
      int _probability_1 = video.getProbability();
      proba = _probability_1;
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
  
  /**
   * Selects a sequence inside the given Alternatices instance accordingly to options' percentages.
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  private static Sequence selectSequence(final Alternatives alternatives) {
    final DistributedRandomNumberGenerator drng = new DistributedRandomNumberGenerator();
    EList<Optional> _options = alternatives.getOptions();
    final int nbAlternatives = ((Object[])Conversions.unwrapArray(_options, Object.class)).length;
    EList<Optional> _options_1 = alternatives.getOptions();
    final Consumer<Optional> _function = (Optional option) -> {
      int count = 0;
      double proba = 0;
      int _probability = option.getProbability();
      boolean _notEquals = (_probability != 0);
      if (_notEquals) {
        int _probability_1 = option.getProbability();
        proba = _probability_1;
      } else {
        proba = (100 / nbAlternatives);
      }
      drng.addNumber(count, proba);
      count++;
    };
    _options_1.forEach(_function);
    int index = drng.getDistributedRandomNumber();
    EList<Optional> _options_2 = alternatives.getOptions();
    Optional _get = _options_2.get(index);
    return _get.getSequence();
  }
  
  /**
   * Tranform a VideoGen instance to a PlayList instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static VideoGen toVideoGen(final PlayList playList) {
    VideoGenFactory videoGenFactory = VideoGenFactoryImpl.init();
    VideoGen _createVideoGen = videoGenFactory.createVideoGen();
    final VideoGenImpl videoGen = ((VideoGenImpl) _createVideoGen);
    return ((VideoGen) videoGen);
  }
  
  /**
   * Return the file extention of the given file pathname
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * FIXME: use of Optional should welcomed ! Or add a helper method to detect format with file headers
   */
  private static String getFileExtension(final String fileName) {
    String _xblockexpression = null;
    {
      String extention = "";
      boolean _and = false;
      int _lastIndexOf = fileName.lastIndexOf(".");
      boolean _notEquals = (_lastIndexOf != (-1));
      if (!_notEquals) {
        _and = false;
      } else {
        int _lastIndexOf_1 = fileName.lastIndexOf(".");
        boolean _notEquals_1 = (_lastIndexOf_1 != 0);
        _and = _notEquals_1;
      }
      if (_and) {
        int _lastIndexOf_2 = fileName.lastIndexOf(".");
        int _plus = (_lastIndexOf_2 + 1);
        String _substring = fileName.substring(_plus);
        extention = _substring;
      }
      _xblockexpression = extention;
    }
    return _xblockexpression;
  }
  
  /**
   * create thumbnails for a Sequence instance
   * Use of VideoGenHelper helper class
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * @see VideoGenHelper#mkDirs(Path)
   * @see VideoGenHelper#createThumbnails(Path, Path)
   */
  public static Path createThumbnails(final Sequence sequence) {
    Path _xblockexpression = null;
    {
      String _plus = (VideoGenTransform.tmp + "/");
      String _plus_1 = (_plus + "thumbnails/");
      final Path dir = Paths.get(_plus_1);
      fr.nemomen.utils.System.mkDirs(dir);
      String _url = sequence.getUrl();
      final Path fullPath = Paths.get(_url);
      Path _fileName = fullPath.getFileName();
      String _string = _fileName.toString();
      final String extention = VideoGenTransform.getFileExtension(_string);
      String _plus_2 = (dir + "/");
      Path _fileName_1 = fullPath.getFileName();
      String _string_1 = _fileName_1.toString();
      String _replaceAll = _string_1.replaceAll(("." + extention), ".png");
      String _plus_3 = (_plus_2 + _replaceAll);
      final Path thumbFileName = Paths.get(_plus_3);
      Videos.createThumbnails(fullPath, thumbFileName);
      _xblockexpression = thumbFileName;
    }
    return _xblockexpression;
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
  public static ArrayList<Path> ConvertTo(final Mimetypes_Enum type, final VideoGen videogen) {
    ArrayList<Path> _xblockexpression = null;
    {
      String _name = type.getName();
      final VideoCodec codec = VideoCodec.getByFormat(_name);
      final ArrayList<Path> pathes = Lists.<Path>newArrayList();
      String _plus = (VideoGenTransform.tmp + "/");
      String _plus_1 = (_plus + "converted");
      String _plus_2 = (_plus_1 + "/");
      String _name_1 = type.getName();
      String _plus_3 = (_plus_2 + _name_1);
      String _plus_4 = (_plus_3 + "/");
      final Path dir = Paths.get(_plus_4);
      fr.nemomen.utils.System.mkDirs(dir);
      Collection<Sequence> _allSequences = VideoGenHelper.allSequences(videogen);
      final Consumer<Sequence> _function = (Sequence sequence) -> {
        String _url = sequence.getUrl();
        final Path fullPath = Paths.get(_url);
        Path _fileName = fullPath.getFileName();
        String _string = _fileName.toString();
        final String extention = VideoGenTransform.getFileExtension(_string);
        String _plus_5 = (dir + "/");
        Path _fileName_1 = fullPath.getFileName();
        String _string_1 = _fileName_1.toString();
        String _extention = codec.extention();
        String _plus_6 = ("." + _extention);
        String _replaceAll = _string_1.replaceAll(("." + extention), _plus_6);
        String _plus_7 = (_plus_5 + _replaceAll);
        final Path newFullPathName = Paths.get(_plus_7);
        pathes.add(newFullPathName);
        Videos.convert(fullPath, newFullPathName, codec);
        Path _absolutePath = newFullPathName.toAbsolutePath();
        String _string_2 = _absolutePath.toString();
        sequence.setUrl(_string_2);
        sequence.setMimetype(type);
      };
      _allSequences.forEach(_function);
      _xblockexpression = pathes;
    }
    return _xblockexpression;
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
  public static VideoGen addMetadata(final VideoGen videogen) {
    VideoGen _xblockexpression = null;
    {
      Collection<Sequence> _allSequences = VideoGenHelper.allSequences(videogen);
      final Consumer<Sequence> _function = (Sequence sequence) -> {
        String _url = sequence.getUrl();
        final Path url = Paths.get(_url);
        int _duration = Videos.getDuration(url);
        sequence.setLength(_duration);
        InputOutput.<Path>println(url);
        VideoCodec _mimeType = Videos.getMimeType(url);
        InputOutput.<VideoCodec>println(_mimeType);
        VideoCodec _mimeType_1 = Videos.getMimeType(url);
        String _name = _mimeType_1.name();
        Mimetypes_Enum _byName = Mimetypes_Enum.getByName(_name);
        sequence.setMimetype(_byName);
      };
      _allSequences.forEach(_function);
      _xblockexpression = videogen;
    }
    return _xblockexpression;
  }
  
  /**
   * Tranformation from VideoGen instance to Playlist instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static PlayListImpl toPlayList(final VideoGen videogen, final Boolean withThumbnail) {
    PlayListImpl _xblockexpression = null;
    {
      PlayListFactory _init = PlayListFactoryImpl.init();
      PlayListFactoryImpl playlistFactory = ((PlayListFactoryImpl) _init);
      PlayList _createPlayList = playlistFactory.createPlayList();
      final PlayListImpl playlist = ((PlayListImpl) _createPlayList);
      EList<Statement> _statements = videogen.getStatements();
      final Consumer<Statement> _function = (Statement statement) -> {
        Sequence sequence = null;
        if ((statement instanceof Mandatory)) {
          Sequence _sequence = ((Mandatory)statement).getSequence();
          sequence = _sequence;
        } else {
          if ((statement instanceof Optional)) {
            boolean _isSelected = VideoGenTransform.isSelected(((Optional)statement));
            if (_isSelected) {
              Sequence _sequence_1 = ((Optional)statement).getSequence();
              sequence = _sequence_1;
            }
          } else {
            if ((statement instanceof Alternatives)) {
              Sequence _selectSequence = VideoGenTransform.selectSequence(((Alternatives)statement));
              sequence = _selectSequence;
            }
          }
        }
        boolean _notEquals = (!Objects.equal(sequence, null));
        if (_notEquals) {
          PlayListFactoryImpl _playListFactoryImpl = new PlayListFactoryImpl();
          Object obj = _playListFactoryImpl.createVideo();
          Video p_video = ((Video) obj);
          VideoGenTransform.transferData(p_video, sequence);
          VideoImpl video = ((VideoImpl) p_video);
          if ((withThumbnail).booleanValue()) {
            Path _createThumbnails = VideoGenTransform.createThumbnails(sequence);
            Path _absolutePath = _createThumbnails.toAbsolutePath();
            String _string = _absolutePath.toString();
            video.setThumbnail(_string);
          }
          EList<Video> _video = playlist.getVideo();
          _video.add(((VideoImpl) p_video));
        }
      };
      _statements.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  /**
   * Transfert some data from a VideoGen Sequence instance to a PlayList Video instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   * 
   * FIXME: should find a better way to create this kind of ModelToText transformation. For instance, through multiples methods to get each portions of the resulting document.
   */
  public static CharSequence toConfigurator(final VideoGen videogen) {
    CharSequence _xblockexpression = null;
    {
      final HashMap<String, Path> thumbnails = new HashMap<String, Path>();
      Collection<Sequence> _allSequences = VideoGenHelper.allSequences(videogen);
      for (final Sequence sequence : _allSequences) {
        String _name = sequence.getName();
        Path _createThumbnails = VideoGenTransform.createThumbnails(sequence);
        thumbnails.put(_name, _createThumbnails);
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!-- Automatically generated by VideoGen -->");
      _builder.newLine();
      _builder.append("<!--style type=\"text/css\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color:rgba(72,72,72,0.4);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-left:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-right:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-top:35px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding-bottom:50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("min-height: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("overflow:auto;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("position: relative;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-top:-130px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 7px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("clear: both;");
      _builder.newLine();
      _builder.append("  \t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .sequence {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size: medium;\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-top: 10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-right: 10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("padding:10px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("display: block;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width : 120px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 120px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("float: left;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("text-align: center;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border: 2px solid #000;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .description {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size: small;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-stretch: condensed;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-variant: small-caps;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin-bottom : 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 70px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#configurator .sequence img, select, option {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 80px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 80px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("margin: 5px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("max-width: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background: transparent !important");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#button_valid{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("float:left;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 100%;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 50px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color: #0493bd;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border: #fbfbfb solid 4px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("cursor:pointer;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: rgba(0,0,0,0);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-size:24px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transition: all 0.3s;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("font-weight:700;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("border-radius: 5px;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("#button_valid:hover{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: #3498db;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color:white;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".submit:hover {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("color: #3498db;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".ease {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("width: 0px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("height: 74px;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("background-color: #fbfbfb;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-webkit-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-moz-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-o-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("-ms-transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("transition: .3s ease;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append(".submit:hover .ease{");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("width:100%;");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("background-color:white;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("</style-->");
      _builder.newLine();
      _builder.append("<script type=\"application/javascript\">");
      _builder.newLine();
      _builder.append("function showTitle(name, description) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("document.getElementById(name).value = description;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("</script>");
      _builder.newLine();
      _builder.append("<form name=\"configurator\" id=\"configurator\" action=\"%actionUrl%\">");
      _builder.newLine();
      _builder.append("<input class=\"button\" type=\"submit\" value=\"Generate\" id=\"button_valid\"><br />");
      _builder.newLine();
      {
        EList<Statement> _statements = videogen.getStatements();
        for(final Statement statement : _statements) {
          {
            if ((statement instanceof Alternatives)) {
              _builder.append("<div id=\"");
              String _name_1 = ((Alternatives)statement).getName();
              _builder.append(_name_1, "");
              _builder.append("\" class=\"sequence\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<span id=\"");
              String _name_2 = ((Alternatives)statement).getName();
              _builder.append(_name_2, "\t");
              _builder.append("_title\" class=\"description\">");
              EList<Optional> _options = ((Alternatives)statement).getOptions();
              Optional _get = _options.get(0);
              Sequence _sequence = _get.getSequence();
              String _description = _sequence.getDescription();
              _builder.append(_description, "\t");
              _builder.append("</span><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("<div class=\"alternatives\">");
              _builder.newLine();
              {
                EList<Optional> _options_1 = ((Alternatives)statement).getOptions();
                for(final Optional option : _options_1) {
                  _builder.append("\t\t");
                  _builder.append("<input checked id=\"");
                  Sequence _sequence_1 = option.getSequence();
                  String _name_3 = _sequence_1.getName();
                  _builder.append(_name_3, "\t\t");
                  _builder.append("\" onchange=\"showTitle(\'");
                  String _name_4 = ((Alternatives)statement).getName();
                  _builder.append(_name_4, "\t\t");
                  _builder.append("_title\', \'");
                  Sequence _sequence_2 = option.getSequence();
                  String _description_1 = _sequence_2.getDescription();
                  _builder.append(_description_1, "\t\t");
                  _builder.append("\')\" type=\"radio\" name=\"");
                  String _name_5 = ((Alternatives)statement).getName();
                  _builder.append(_name_5, "\t\t");
                  _builder.append("\" value=\"");
                  Sequence _sequence_3 = option.getSequence();
                  String _name_6 = _sequence_3.getName();
                  _builder.append(_name_6, "\t\t");
                  _builder.append("\" />");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("<label for=\"");
                  Sequence _sequence_4 = option.getSequence();
                  String _name_7 = _sequence_4.getName();
                  _builder.append(_name_7, "\t\t");
                  _builder.append("\" style=\"background-image:url(\'");
                  Sequence _sequence_5 = option.getSequence();
                  String _name_8 = _sequence_5.getName();
                  Path _get_1 = thumbnails.get(_name_8);
                  _builder.append(_get_1, "\t\t");
                  _builder.append("\');\"></label>");
                  _builder.newLineIfNotEmpty();
                }
              }
              _builder.append("\t\t");
              _builder.append("</div>");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("</div>");
              _builder.newLine();
            }
          }
          {
            if ((statement instanceof Mandatory)) {
              _builder.append("<div id=\"");
              Sequence _sequence_6 = ((Mandatory)statement).getSequence();
              String _name_9 = _sequence_6.getName();
              _builder.append(_name_9, "");
              _builder.append("\" class=\"sequence mandatory\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<label class=\"description\">");
              Sequence _sequence_7 = ((Mandatory)statement).getSequence();
              String _description_2 = _sequence_7.getDescription();
              _builder.append(_description_2, "\t");
              _builder.append("</label><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<img src=\"");
              Sequence _sequence_8 = ((Mandatory)statement).getSequence();
              String _name_10 = _sequence_8.getName();
              Path _get_2 = thumbnails.get(_name_10);
              _builder.append(_get_2, "\t");
              _builder.append("\"/><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<input hidden name=\"");
              Sequence _sequence_9 = ((Mandatory)statement).getSequence();
              String _name_11 = _sequence_9.getName();
              _builder.append(_name_11, "\t");
              _builder.append("\" value=\"");
              Sequence _sequence_10 = ((Mandatory)statement).getSequence();
              String _name_12 = _sequence_10.getName();
              _builder.append(_name_12, "\t");
              _builder.append("\">");
              _builder.newLineIfNotEmpty();
              _builder.append("</div>");
              _builder.newLine();
            }
          }
          {
            if ((statement instanceof Optional)) {
              _builder.append("<div id=\"");
              Sequence _sequence_11 = ((Optional)statement).getSequence();
              String _name_13 = _sequence_11.getName();
              _builder.append(_name_13, "");
              _builder.append("\" class=\"sequence optional\">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<label class=\"description\">");
              Sequence _sequence_12 = ((Optional)statement).getSequence();
              String _description_3 = _sequence_12.getDescription();
              _builder.append(_description_3, "\t");
              _builder.append("</label><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<input name=\"");
              Sequence _sequence_13 = ((Optional)statement).getSequence();
              String _name_14 = _sequence_13.getName();
              _builder.append(_name_14, "\t");
              _builder.append("\" type=\"checkbox\" value=\"1\" checked/><br />");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<img src=\"");
              Sequence _sequence_14 = ((Optional)statement).getSequence();
              String _name_15 = _sequence_14.getName();
              Path _get_3 = thumbnails.get(_name_15);
              _builder.append(_get_3, "\t");
              _builder.append("\"/>");
              _builder.newLineIfNotEmpty();
              _builder.append("</div>");
              _builder.newLine();
            }
          }
        }
      }
      _builder.append("</form>");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
