package org.istic.idm.xtext.tests;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.istic.idm.xtext.VideoGenStandaloneSetupGenerated;
import org.istic.idm.xtext.videoGen.Alternative;
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq;
import org.istic.idm.xtext.videoGen.OptionalVideoSeq;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;
import org.istic.idm.xtext.videoGen.VideoSeq;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class VideoGenTest {
  public VideoGen loadVideoGen(final URI uri) {
    VideoGen _xblockexpression = null;
    {
      VideoGenStandaloneSetupGenerated _videoGenStandaloneSetupGenerated = new VideoGenStandaloneSetupGenerated();
      _videoGenStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
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
    URI _createURI = URI.createURI("test.vg");
    VideoGen videoGen = this.loadVideoGen(_createURI);
    Assert.assertNotNull(videoGen);
    EList<Statement> _statements = videoGen.getStatements();
    for (final Statement statement : _statements) {
      {
        if ((statement instanceof MandatoryVideoSeq)) {
          VideoSeq _videoseq = ((MandatoryVideoSeq)statement).getVideoseq();
          Assert.assertNotNull(_videoseq);
          VideoSeq _videoseq_1 = ((MandatoryVideoSeq)statement).getVideoseq();
          String _name = _videoseq_1.getName();
          Class<? extends String> _class = _name.getClass();
          Assert.assertEquals(String.class, _class);
          VideoSeq _videoseq_2 = ((MandatoryVideoSeq)statement).getVideoseq();
          String _url = _videoseq_2.getUrl();
          Class<? extends String> _class_1 = _url.getClass();
          Assert.assertEquals(String.class, _class_1);
          VideoSeq _videoseq_3 = ((MandatoryVideoSeq)statement).getVideoseq();
          int _length = _videoseq_3.getLength();
          Class<? extends Integer> _class_2 = Integer.valueOf(_length).getClass();
          Assert.assertEquals(Integer.class, _class_2);
          VideoSeq _videoseq_4 = ((MandatoryVideoSeq)statement).getVideoseq();
          int _prob = _videoseq_4.getProb();
          boolean _greaterEqualsThan = (100 >= _prob);
          Assert.assertTrue(_greaterEqualsThan);
          VideoSeq _videoseq_5 = ((MandatoryVideoSeq)statement).getVideoseq();
          int _prob_1 = _videoseq_5.getProb();
          boolean _lessEqualsThan = (0 <= _prob_1);
          Assert.assertTrue(_lessEqualsThan);
          VideoSeq _videoseq_6 = ((MandatoryVideoSeq)statement).getVideoseq();
          int _prob_2 = _videoseq_6.getProb();
          Class<? extends Integer> _class_3 = Integer.valueOf(_prob_2).getClass();
          Assert.assertEquals(Integer.class, _class_3);
          VideoSeq _videoseq_7 = ((MandatoryVideoSeq)statement).getVideoseq();
          String _desc = _videoseq_7.getDesc();
          Class<? extends String> _class_4 = _desc.getClass();
          Assert.assertEquals(String.class, _class_4);
          VideoSeq _videoseq_8 = ((MandatoryVideoSeq)statement).getVideoseq();
          VideoSeq _videoseq_9 = ((MandatoryVideoSeq)statement).getVideoseq();
          String _name_1 = _videoseq_9.getName();
          String _plus = (_name_1 + "_VideoGen");
          _videoseq_8.setName(_plus);
        }
        if ((statement instanceof OptionalVideoSeq)) {
          VideoSeq _videoseq_10 = ((OptionalVideoSeq)statement).getVideoseq();
          Assert.assertNotNull(_videoseq_10);
          VideoSeq _videoseq_11 = ((OptionalVideoSeq)statement).getVideoseq();
          String _name_2 = _videoseq_11.getName();
          Class<? extends String> _class_5 = _name_2.getClass();
          Assert.assertEquals(String.class, _class_5);
          VideoSeq _videoseq_12 = ((OptionalVideoSeq)statement).getVideoseq();
          String _url_1 = _videoseq_12.getUrl();
          Class<? extends String> _class_6 = _url_1.getClass();
          Assert.assertEquals(String.class, _class_6);
          VideoSeq _videoseq_13 = ((OptionalVideoSeq)statement).getVideoseq();
          int _length_1 = _videoseq_13.getLength();
          Class<? extends Integer> _class_7 = Integer.valueOf(_length_1).getClass();
          Assert.assertEquals(Integer.class, _class_7);
          VideoSeq _videoseq_14 = ((OptionalVideoSeq)statement).getVideoseq();
          int _prob_3 = _videoseq_14.getProb();
          boolean _greaterEqualsThan_1 = (100 >= _prob_3);
          Assert.assertTrue(_greaterEqualsThan_1);
          VideoSeq _videoseq_15 = ((OptionalVideoSeq)statement).getVideoseq();
          int _prob_4 = _videoseq_15.getProb();
          boolean _lessEqualsThan_1 = (0 <= _prob_4);
          Assert.assertTrue(_lessEqualsThan_1);
          VideoSeq _videoseq_16 = ((OptionalVideoSeq)statement).getVideoseq();
          int _prob_5 = _videoseq_16.getProb();
          Class<? extends Integer> _class_8 = Integer.valueOf(_prob_5).getClass();
          Assert.assertEquals(Integer.class, _class_8);
          VideoSeq _videoseq_17 = ((OptionalVideoSeq)statement).getVideoseq();
          String _desc_1 = _videoseq_17.getDesc();
          Class<? extends String> _class_9 = _desc_1.getClass();
          Assert.assertEquals(String.class, _class_9);
          VideoSeq _videoseq_18 = ((OptionalVideoSeq)statement).getVideoseq();
          VideoSeq _videoseq_19 = ((OptionalVideoSeq)statement).getVideoseq();
          String _name_3 = _videoseq_19.getName();
          String _plus_1 = (_name_3 + "_VideoGen");
          _videoseq_18.setName(_plus_1);
        }
        if ((statement instanceof Alternative)) {
          EList<VideoSeq> _videoseqs = ((Alternative)statement).getVideoseqs();
          int _size = _videoseqs.size();
          Assert.assertNotEquals(0, _size);
          int totalProb = 0;
          EList<VideoSeq> _videoseqs_1 = ((Alternative)statement).getVideoseqs();
          for (final VideoSeq videoSeq : _videoseqs_1) {
            {
              String _name_4 = videoSeq.getName();
              Class<? extends String> _class_10 = _name_4.getClass();
              Assert.assertEquals(String.class, _class_10);
              String _url_2 = videoSeq.getUrl();
              Class<? extends String> _class_11 = _url_2.getClass();
              Assert.assertEquals(String.class, _class_11);
              int _length_2 = videoSeq.getLength();
              Class<? extends Integer> _class_12 = Integer.valueOf(_length_2).getClass();
              Assert.assertEquals(Integer.class, _class_12);
              int _prob_6 = videoSeq.getProb();
              boolean _greaterEqualsThan_2 = (100 >= _prob_6);
              Assert.assertTrue(_greaterEqualsThan_2);
              int _prob_7 = videoSeq.getProb();
              boolean _lessEqualsThan_2 = (0 <= _prob_7);
              Assert.assertTrue(_lessEqualsThan_2);
              int _prob_8 = videoSeq.getProb();
              Class<? extends Integer> _class_13 = Integer.valueOf(_prob_8).getClass();
              Assert.assertEquals(Integer.class, _class_13);
              String _desc_2 = videoSeq.getDesc();
              Class<? extends String> _class_14 = _desc_2.getClass();
              Assert.assertEquals(String.class, _class_14);
              int _talProb = totalProb;
              int _prob_9 = videoSeq.getProb();
              totalProb = (_talProb + _prob_9);
            }
          }
          Assert.assertEquals(100, totalProb);
          EList<VideoSeq> _videoseqs_2 = ((Alternative)statement).getVideoseqs();
          final Consumer<VideoSeq> _function = (VideoSeq v) -> {
            String _name_4 = v.getName();
            String _plus_2 = (_name_4 + "_VideoGen");
            v.setName(_plus_2);
          };
          _videoseqs_2.forEach(_function);
        }
      }
    }
    URI _createURI_1 = URI.createURI("test.xmi");
    this.saveVideoGen(_createURI_1, videoGen);
    URI _createURI_2 = URI.createURI("test2.vg");
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
    _builder.append("�IF s instanceOf MandatoryVideoSeq�");
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
    _builder.append("�IF s instanceOf OptionalVideoSeq�");
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
    _builder.append("�IF s instanceOf Alternative�");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("�FOR v : s.videoseqs�");
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
