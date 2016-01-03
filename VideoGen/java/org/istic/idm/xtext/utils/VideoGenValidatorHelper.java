package org.istic.idm.xtext.utils;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.istic.idm.xtext.utils.VideoGenHelper;
import org.istic.idm.xtext.videoGen.Alternatives;
import org.istic.idm.xtext.videoGen.Optional;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;

@SuppressWarnings("all")
public class VideoGenValidatorHelper {
  /**
   * Helper class to manage null, like java Optional but simpler
   */
  public static class Result {
    private String result = null;
    
    public String set(final String value) {
      return this.result = value;
    }
    
    public String get() {
      return this.result;
    }
    
    public boolean isSet() {
      return (!Objects.equal(this.result, null));
    }
  }
  
  public static VideoGenValidatorHelper.Result checkIsUrlExists(final List<Sequence> sequences, final Sequence sequence) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      String _url = sequence.getUrl();
      File _file = new File(_url);
      boolean _exists = _file.exists();
      boolean _not = (!_exists);
      if (_not) {
        result.set("File not found");
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static VideoGenValidatorHelper.Result checkUniqueDescription(final List<Sequence> sequences, final Sequence sequence) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      final Function1<Sequence, Boolean> _function = (Sequence seq2) -> {
        boolean _equals = seq2.equals(sequence);
        return Boolean.valueOf((!_equals));
      };
      Iterable<Sequence> _takeWhile = IterableExtensions.<Sequence>takeWhile(sequences, _function);
      final Consumer<Sequence> _function_1 = (Sequence seq2) -> {
        String _description = seq2.getDescription();
        String _description_1 = sequence.getDescription();
        boolean _equals = _description.equals(_description_1);
        if (_equals) {
          result.set("Duplicated description.");
        }
      };
      _takeWhile.forEach(_function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static VideoGenValidatorHelper.Result checkUniqueURL(final List<Sequence> sequences, final Sequence sequence) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      final Function1<Sequence, Boolean> _function = (Sequence seq2) -> {
        boolean _equals = seq2.equals(sequence);
        return Boolean.valueOf((!_equals));
      };
      Iterable<Sequence> _takeWhile = IterableExtensions.<Sequence>takeWhile(sequences, _function);
      final Consumer<Sequence> _function_1 = (Sequence seq2) -> {
        String _url = seq2.getUrl();
        String _url_1 = sequence.getUrl();
        boolean _equals = _url.equals(_url_1);
        if (_equals) {
          result.set("Duplicated url.");
        }
      };
      _takeWhile.forEach(_function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static VideoGenValidatorHelper.Result checkUniqueIdentifiers(final List<Sequence> sequences, final Sequence sequence) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      final Function1<Sequence, Boolean> _function = (Sequence seq2) -> {
        boolean _equals = seq2.equals(sequence);
        return Boolean.valueOf((!_equals));
      };
      Iterable<Sequence> _takeWhile = IterableExtensions.<Sequence>takeWhile(sequences, _function);
      final Consumer<Sequence> _function_1 = (Sequence seq2) -> {
        String _name = seq2.getName();
        String _name_1 = sequence.getName();
        boolean _equals = _name.equals(_name_1);
        if (_equals) {
          result.set("Sequence name should be unique.");
        }
      };
      _takeWhile.forEach(_function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static VideoGenValidatorHelper.Result checkOptionalProbability(final Optional optional) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      int _probability = optional.getProbability();
      boolean _greaterThan = (_probability > 100);
      if (_greaterThan) {
        result.set("Optional probability should not be higher than 100%");
      } else {
        int _probability_1 = optional.getProbability();
        boolean _equals = (_probability_1 == 100);
        if (_equals) {
          result.set("Optional probability should not equal 100%, otherwize create a Mandatory sequence instead ;)");
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static VideoGenValidatorHelper.Result checkAlternativesProbability(final Alternatives alternatives) {
    VideoGenValidatorHelper.Result _xblockexpression = null;
    {
      final VideoGenValidatorHelper.Result result = new VideoGenValidatorHelper.Result();
      int total = 0;
      Optional lastOption = null;
      EList<Optional> _options = alternatives.getOptions();
      for (final Optional option : _options) {
        {
          int _tal = total;
          int _probability = option.getProbability();
          total = (_tal + _probability);
          lastOption = option;
        }
      }
      if ((total > 100)) {
        result.set("Probabilities sum inside an Alternatives should not exceed 100%");
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public static HashMap<String, List<String>> checkAll(final VideoGen videoGen) {
    HashMap<String, List<String>> _xblockexpression = null;
    {
      final HashMap<String, List<String>> result = new HashMap<String, List<String>>();
      ArrayList<String> _arrayList = new ArrayList<String>();
      result.put("error", _arrayList);
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      result.put("warning", _arrayList_1);
      ArrayList<String> _arrayList_2 = new ArrayList<String>();
      result.put("info", _arrayList_2);
      Resource _eResource = videoGen.eResource();
      TreeIterator<EObject> _allContents = _eResource.getAllContents();
      Iterator<Sequence> _filter = Iterators.<Sequence>filter(_allContents, Sequence.class);
      List<Sequence> _list = IteratorExtensions.<Sequence>toList(_filter);
      final List<Sequence> sequences = ((List<Sequence>) _list);
      Collection<Sequence> _allSequences = VideoGenHelper.allSequences(videoGen);
      final Consumer<Sequence> _function = (Sequence sequence) -> {
        VideoGenValidatorHelper.Result ret = VideoGenValidatorHelper.checkIsUrlExists(sequences, sequence);
        boolean _isSet = ret.isSet();
        if (_isSet) {
          List<String> _get = result.get("error");
          String _get_1 = ret.get();
          _get.add(_get_1);
        }
        VideoGenValidatorHelper.Result _checkUniqueDescription = VideoGenValidatorHelper.checkUniqueDescription(sequences, sequence);
        ret = _checkUniqueDescription;
        boolean _isSet_1 = ret.isSet();
        if (_isSet_1) {
          List<String> _get_2 = result.get("warning");
          String _get_3 = ret.get();
          _get_2.add(_get_3);
        }
        VideoGenValidatorHelper.Result _checkUniqueURL = VideoGenValidatorHelper.checkUniqueURL(sequences, sequence);
        ret = _checkUniqueURL;
        boolean _isSet_2 = ret.isSet();
        if (_isSet_2) {
          List<String> _get_4 = result.get("warning");
          String _get_5 = ret.get();
          _get_4.add(_get_5);
        }
        VideoGenValidatorHelper.Result _checkUniqueIdentifiers = VideoGenValidatorHelper.checkUniqueIdentifiers(sequences, sequence);
        ret = _checkUniqueIdentifiers;
        boolean _isSet_3 = ret.isSet();
        if (_isSet_3) {
          List<String> _get_6 = result.get("error");
          String _get_7 = ret.get();
          _get_6.add(_get_7);
        }
      };
      _allSequences.forEach(_function);
      EList<Statement> _statements = videoGen.getStatements();
      final Consumer<Statement> _function_1 = (Statement statement) -> {
        if ((statement instanceof Optional)) {
          VideoGenValidatorHelper.Result ret = VideoGenValidatorHelper.checkOptionalProbability(((Optional)statement));
          boolean _isSet = ret.isSet();
          if (_isSet) {
            List<String> _get = result.get("error");
            String _get_1 = ret.get();
            _get.add(_get_1);
          }
        } else {
          if ((statement instanceof Alternatives)) {
            VideoGenValidatorHelper.Result ret_1 = VideoGenValidatorHelper.checkAlternativesProbability(((Alternatives)statement));
            boolean _isSet_1 = ret_1.isSet();
            if (_isSet_1) {
              List<String> _get_2 = result.get("error");
              String _get_3 = ret_1.get();
              _get_2.add(_get_3);
            }
          }
        }
      };
      _statements.forEach(_function_1);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
