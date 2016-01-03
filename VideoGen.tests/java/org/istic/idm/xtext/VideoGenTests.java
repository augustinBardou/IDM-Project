package org.istic.idm.xtext;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.istic.idm.xtext.VideoGenStandaloneSetup;
import org.istic.idm.xtext.utils.VideoGenTransform;
import org.istic.idm.xtext.videoGen.Alternatives;
import org.istic.idm.xtext.videoGen.Mandatory;
import org.istic.idm.xtext.videoGen.Optional;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class VideoGenTests {
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
  
  @Test
  public void test1() {
    Path _get = Paths.get("resources/test.vg");
    Path _absolutePath = _get.toAbsolutePath();
    String _string = _absolutePath.toString();
    URI _createURI = URI.createURI(_string);
    VideoGen videoGen = this.loadVideoGen(_createURI);
    Assert.assertNotNull(videoGen);
    URI _createURI_1 = URI.createURI("test.xmi");
    this.saveVideoGen(_createURI_1, videoGen);
    int indice = 0;
    EList<Statement> _statements = videoGen.getStatements();
    for (final Statement statement : _statements) {
      {
        if ((statement instanceof Mandatory)) {
          Sequence _sequence = ((Mandatory)statement).getSequence();
          Assert.assertNotNull(_sequence);
          Sequence _sequence_1 = ((Mandatory)statement).getSequence();
          _sequence_1.setName(("MandatorySequence_" + Integer.valueOf(indice)));
        }
        if ((statement instanceof Optional)) {
          Sequence _sequence_2 = ((Optional)statement).getSequence();
          Assert.assertNotNull(_sequence_2);
          int _probability = ((Optional)statement).getProbability();
          boolean _greaterEqualsThan = (100 >= _probability);
          Assert.assertTrue(_greaterEqualsThan);
          int _probability_1 = ((Optional)statement).getProbability();
          boolean _lessEqualsThan = (0 <= _probability_1);
          Assert.assertTrue(_lessEqualsThan);
          Sequence _sequence_3 = ((Optional)statement).getSequence();
          _sequence_3.setName(("OptionalSequence_" + Integer.valueOf(indice)));
        }
        if ((statement instanceof Alternatives)) {
          ((Alternatives)statement).setName(("Alternative_" + Integer.valueOf(indice)));
          EList<Optional> _options = ((Alternatives)statement).getOptions();
          int _size = _options.size();
          Assert.assertNotEquals(0, _size);
          int totalProb = 0;
          EList<Optional> _options_1 = ((Alternatives)statement).getOptions();
          for (final Optional optional : _options_1) {
            {
              int _probability_2 = optional.getProbability();
              boolean _greaterEqualsThan_1 = (100 >= _probability_2);
              Assert.assertTrue(_greaterEqualsThan_1);
              int _probability_3 = optional.getProbability();
              boolean _lessEqualsThan_1 = (0 <= _probability_3);
              Assert.assertTrue(_lessEqualsThan_1);
              int _talProb = totalProb;
              int _probability_4 = optional.getProbability();
              totalProb = (_talProb + _probability_4);
            }
          }
          int indiceAlt = 0;
          EList<Optional> _options_2 = ((Alternatives)statement).getOptions();
          final Function1<Optional, Sequence> _function = (Optional it) -> {
            return it.getSequence();
          };
          List<Sequence> _map = ListExtensions.<Optional, Sequence>map(_options_2, _function);
          for (final Sequence sequence : _map) {
            sequence.setName(((("Alternative_" + Integer.valueOf(indice)) + "_Sequence_") + Integer.valueOf(indiceAlt)));
          }
          indiceAlt++;
        }
      }
    }
    VideoGen _addMetadata = VideoGenTransform.addMetadata(videoGen);
    videoGen = _addMetadata;
    URI _createURI_2 = URI.createURI("full-restructured.vg");
    this.saveVideoGen(_createURI_2, videoGen);
  }
  
  public CharSequence toVideoGen(final List<Statement> statements) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�FOR s : statements�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF s instanceOf Mandatory�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>�v.name�</h1>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("url : �v.url�<br />");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF s instanceOf Optional�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>�v.name� (Optional)</h1>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("url : �v.url�<br />");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�IF s instanceOf Alternatives�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR v : s.sequences�");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<h1>�v.name�</h1>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("url : �v.url�<br />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</html>");
    return _builder;
  }
}
