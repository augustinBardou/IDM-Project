package org.istic.idm.xtext.tests;

import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import static org.junit.Assert.*
import org.istic.idm.xtext.VideoGenStandaloneSetupGenerated
import org.istic.idm.xtext.videoGen.VideoGen
import org.istic.idm.xtext.videoGen.MandatoryVideoSeq
import org.istic.idm.xtext.videoGen.Statement
import org.istic.idm.xtext.videoGen.OptionalVideoSeq
import org.istic.idm.xtext.videoGen.Alternative
import org.istic.idm.xtext.videoGen.VideoSeq
import org.junit.Test

class VideoGenTest {

	
	def loadVideoGen(URI uri) {
		new VideoGenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}
	
	@Test
	def test1() {
		
		// loading
		var videoGen = loadVideoGen(URI.createURI("test.vg")) 
		assertNotNull(videoGen)
		for (Statement statement: videoGen.statements) {
			if (statement instanceof MandatoryVideoSeq) {
				assertNotNull(statement.videoseq)
				assertEquals(String, statement.videoseq.name.class)
				assertEquals(String, statement.videoseq.url.class)
				assertEquals(Integer, statement.videoseq.length.class)
				assertTrue(100 >= statement.videoseq.prob)
				assertTrue(0 <= statement.videoseq.prob)
				assertEquals(Integer, statement.videoseq.prob.class)
				assertEquals(String, statement.videoseq.desc.class)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				statement.videoseq.name = statement.videoseq.name + "_VideoGen"
			}
			if (statement instanceof OptionalVideoSeq) {
				assertNotNull(statement.videoseq)
				assertEquals(String, statement.videoseq.name.class)
				assertEquals(String, statement.videoseq.url.class)
				assertEquals(Integer, statement.videoseq.length.class)
				assertTrue(100 >= statement.videoseq.prob)
				assertTrue(0 <= statement.videoseq.prob)
				assertEquals(Integer, statement.videoseq.prob.class)
				assertEquals(String, statement.videoseq.desc.class)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				statement.videoseq.name = statement.videoseq.name + "_VideoGen"
			}
			if (statement instanceof Alternative) {
				assertNotEquals(0, statement.videoseqs.size)
				var totalProb = 0
				for (VideoSeq videoSeq: statement.videoseqs) {
					assertEquals(String, videoSeq.name.class)
					assertEquals(String, videoSeq.url.class)
					assertEquals(Integer, videoSeq.length.class)
					assertTrue(100 >= videoSeq.prob)
					assertTrue(0 <= videoSeq.prob)
					assertEquals(Integer, videoSeq.prob.class)
					assertEquals(String, videoSeq.desc.class)
					totalProb += videoSeq.prob
				}
				assertEquals(100, totalProb)
				// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
				statement.videoseqs.forEach[v | v.name = v.name + "_VideoGen"]
			}
		}
		saveVideoGen(URI.createURI("test.xmi"), videoGen)
		
		// serializing
		saveVideoGen(URI.createURI("test2.vg"), videoGen) 
	}
	
	
	//@Test
	//def test2() {
	//	
		// loading
	//	var videoGen = loadVideoGen(URI.createURI("test1.vq")) 
	//		
		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
	//	var html = toVideoGen(videoGen.statements)
	//	assertNotNull(html)
	//	
		// serializing (note: we could type check the HTML 
		// with Xtext by specifying the grammar for instance)
	//	val fw = new FileWriter("foo1.html")
	//	fw.write(html.toString)
	//	fw.close
		
		
	//}
	
	def toVideoGen(List<Statement> statements) {
		'''<html>
	<body>
		�FOR s : statements�
			�IF s instanceOf MandatoryVideoSeq�
				<h1>�v.name�</h1>
				<p>
					url : �v.url�<br />
				</p>
			�ENDIF�
			�IF s instanceOf OptionalVideoSeq�
				<h1>�v.name� (Optional)</h1>
				<p>
					url : �v.url�<br />
				</p>
			�ENDIF�
			�IF s instanceOf Alternative�
				�FOR v : s.videoseqs�
					<h1>�v.name�</h1>
					<p>
						url : �v.url�<br />
					</p>
				�ENDFOR�
			�ENDIF�
		�ENDFOR�
	</body>
	</html>'''
	}
	
	

}
