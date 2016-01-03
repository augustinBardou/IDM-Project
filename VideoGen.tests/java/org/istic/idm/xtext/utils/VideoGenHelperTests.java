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
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoGenHelper;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class VideoGenHelperTests {
  private VideoGen videoGen;
  
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
  public void allSequences() {
    Collection<Sequence> allSequences = VideoGenHelper.allSequences(this.videoGen);
    int _size = this.oracle_file_list.size();
    int _size_1 = allSequences.size();
    Assert.assertEquals(_size, _size_1);
    for (final Sequence sequence : allSequences) {
      {
        String _name = sequence.getName();
        boolean _contains = this.oracle_name_list.contains(_name);
        Assert.assertTrue(_contains);
        String _url = sequence.getUrl();
        boolean _contains_1 = this.oracle_file_list.contains(_url);
        Assert.assertTrue(_contains_1);
      }
    }
  }
}
