package org.istic.idm.xtext.utils;

import com.google.common.collect.Lists;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.ecore.PlayList.Video;
import org.istic.idm.ecore.PlayList.impl.PlayListFactoryImpl;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoGenHelper;
import org.istic.idm.xtext.utils.VideoGenTransform;
import org.istic.idm.xtext.videoGen.Mimetypes_Enum;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class VideoGenTranformTest {
  private VideoGen videoGen;
  
  private PlayList playList;
  
  private final ArrayList<String> oracle_file_list = Lists.<String>newArrayList(
    "/tmp/Mass.mp4", 
    "/tmp/TimsSuicide.mp4", 
    "/tmp/EddyWally-Wow.mp4", 
    "/tmp/haha.mp4");
  
  private final ArrayList<String> oracle_name_list = Lists.<String>newArrayList(
    "mass", 
    "tim", 
    "wow_maybe", 
    "haha_for_sure");
  
  private final ArrayList<Integer> oracle_duration_list = Lists.<Integer>newArrayList(
    Integer.valueOf(30), 
    Integer.valueOf(30), 
    Integer.valueOf(7), 
    Integer.valueOf(2));
  
  private final Mimetypes_Enum oracle_mimeType = Mimetypes_Enum.MP4;
  
  public VideoGen loadPlayList(final URI uri) {
    VideoGen _xblockexpression = null;
    {
      VideoGenStandaloneSetup.doSetup();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((VideoGen) _get);
    }
    return _xblockexpression;
  }
  
  public void savePlayList(final URI uri, final PlayList playList) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(playList);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public VideoGen loadVideoGen(final URI uri) {
    VideoGen _xblockexpression = null;
    {
      VideoGenStandaloneSetup.doSetup();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((VideoGen) _get);
    }
    return _xblockexpression;
  }
  
  public void saveVideoGen(final URI uri, final VideoGen pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(pollS);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Before
  public void setUp() {
    final PlayListFactoryImpl factory = new PlayListFactoryImpl();
    PlayList _createPlayList = factory.createPlayList();
    this.playList = _createPlayList;
    for (final String url : this.oracle_file_list) {
      {
        int indice = this.oracle_file_list.indexOf(url);
        Video video = factory.createVideo();
        video.setPath(url);
        Integer _get = this.oracle_duration_list.get(indice);
        video.setDuration((_get).intValue());
        String _name = this.oracle_mimeType.getName();
        video.setMimetype(_name);
        EList<Video> _video = this.playList.getVideo();
        _video.add(video);
      }
    }
    Path _get = Paths.get("resources/videos");
    File _file = _get.toFile();
    File[] _listFiles = _file.listFiles();
    final Consumer<File> _function = (File file) -> {
      try {
        String _absolutePath = file.getAbsolutePath();
        Path abs = Paths.get(_absolutePath);
        Path _fileName = abs.getFileName();
        String _plus = ("/tmp/" + _fileName);
        Path newAbs = Paths.get(_plus);
        File _file_1 = newAbs.toFile();
        boolean _exists = _file_1.exists();
        boolean _not = (!_exists);
        if (_not) {
          Files.copy(abs, newAbs);
        }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    };
    ((List<File>)Conversions.doWrapArray(_listFiles)).forEach(_function);
    Path _get_1 = Paths.get("resources/test.vg");
    Path _absolutePath = _get_1.toAbsolutePath();
    final String videoGenFile = _absolutePath.toString();
    URI _createURI = URI.createURI(videoGenFile);
    VideoGen _loadVideoGen = this.loadVideoGen(_createURI);
    this.videoGen = _loadVideoGen;
    Assert.assertNotNull(this.videoGen);
  }
  
  @Test
  public void toVideoGen() {
    Assert.assertTrue(true);
  }
  
  @Test
  public void toPlayList() {
    Assert.assertTrue(true);
  }
  
  @Test
  public void createThumbnails() {
    Collection<Sequence> _allSequences = VideoGenHelper.allSequences(this.videoGen);
    for (final Sequence sequence : _allSequences) {
      {
        final Path path = VideoGenTransform.createThumbnails(sequence);
        Path _absolutePath = path.toAbsolutePath();
        File _file = _absolutePath.toFile();
        boolean _exists = _file.exists();
        Assert.assertTrue(_exists);
        Path _absolutePath_1 = path.toAbsolutePath();
        File _file_1 = _absolutePath_1.toFile();
        boolean _isFile = _file_1.isFile();
        Assert.assertTrue(_isFile);
        Path _absolutePath_2 = path.toAbsolutePath();
        File _file_2 = _absolutePath_2.toFile();
        long _length = _file_2.length();
        Assert.assertNotEquals(0, _length);
        Path _fileName = path.getFileName();
        String _string = _fileName.toString();
        boolean _endsWith = _string.endsWith("png");
        Assert.assertTrue(_endsWith);
      }
    }
  }
  
  @Test
  public void ConvertTo() {
    final ArrayList<Path> pathes = VideoGenTransform.ConvertTo(Mimetypes_Enum.AVI, this.videoGen);
    for (final Path path : pathes) {
      {
        Path _absolutePath = path.toAbsolutePath();
        File _file = _absolutePath.toFile();
        boolean _exists = _file.exists();
        Assert.assertTrue(_exists);
        Path _absolutePath_1 = path.toAbsolutePath();
        File _file_1 = _absolutePath_1.toFile();
        boolean _isFile = _file_1.isFile();
        Assert.assertTrue(_isFile);
        Path _absolutePath_2 = path.toAbsolutePath();
        File _file_2 = _absolutePath_2.toFile();
        long _length = _file_2.length();
        Assert.assertNotEquals(0, _length);
        Path _fileName = path.getFileName();
        String _string = _fileName.toString();
        boolean _endsWith = _string.endsWith("avi");
        Assert.assertTrue(_endsWith);
      }
    }
  }
  
  @Test
  public void toConfigurator() {
    Assert.assertTrue(true);
  }
  
  @Test
  public void addMetadata() {
    VideoGenTransform.addMetadata(this.videoGen);
    Collection<Sequence> _allSequences = VideoGenHelper.allSequences(this.videoGen);
    for (final Sequence sequence : _allSequences) {
      {
        int _length = sequence.getLength();
        boolean _contains = this.oracle_duration_list.contains(Integer.valueOf(_length));
        Assert.assertTrue(_contains);
        Mimetypes_Enum _mimetype = sequence.getMimetype();
        Assert.assertEquals(this.oracle_mimeType, _mimetype);
      }
    }
  }
}
