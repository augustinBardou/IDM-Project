package org.istic.idm.xtext.tests

import com.google.common.collect.Lists
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.istic.idm.xtext.VideoGenStandaloneSetup
import org.istic.idm.xtext.utils.VideoGenHelper
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import org.istic.idm.xtext.videoGen.VideoGen
import org.junit.Before
import org.junit.Test

import static java.nio.file.StandardCopyOption.*
import static org.junit.Assert.*

class VideoGenHelperTest {

	var VideoGen videoGen;
	val oracle_file_list = Lists.newArrayList(
		"/tmp/Mass.mp4",
		"/tmp/TimsSuicide.mp4",
		"/tmp/EddyWally-Wow.mp4",
		"/tmp/haha.mp4"
	)
	val oracle_name_list = Lists.newArrayList(
		"mass",
		"tim",
		"wow_maybe",
		"haha_for_sure"
	)
	val oracle_duration_list = Lists.newArrayList(
		30,
		30,
		7,
		2
	)
	val oracle_mimeType = Mimetypes_Enum.MP4
	
	def loadVideoGen(URI uri) {
		VideoGenStandaloneSetup.doSetup
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(pollS); 
		rs.save(new HashMap());
	}

	@Before
	def setUp() {
		// Copy all videos to temporary folder for absolute access
		Paths.get("resources/videos").toFile.listFiles.forEach[file |
			var abs = Paths.get(file.absolutePath)
			var newAbs = Paths.get("/tmp/" + abs.fileName)
			if (!newAbs.toFile.exists) {
				// Let the exception be thrown if atomic move is not possible
				Files.copy(abs, newAbs)
			}
		]
		val videoGenFile = Paths.get("resources/test.vg").toAbsolutePath.toString;
		// loading
		videoGen = loadVideoGen(URI.createURI(videoGenFile))
		assertNotNull(videoGen)
	}
	
	@Test
	def void createThumbnails() {
		for (video: oracle_file_list) {
			var root = Paths.get(video).parent.toAbsolutePath
			var fileName = Paths.get(video).fileName.toString
			var newFile = Paths.get(root + "/" + fileName.replace('.mp4', '.png'))
			VideoGenHelper.createThumbnails(
				Paths.get(video),
				newFile
			)
			assertTrue(newFile.toFile.exists)
			assertTrue(newFile.toFile.canRead)
			assertNotEquals(0, newFile.toFile.length)
		}
	}

	@Test
	def void convert() {
		for (video: oracle_file_list) {
			var root = Paths.get(video).parent.toAbsolutePath
			var fileName = Paths.get(video).fileName.toString
			var newFile = Paths.get(root + "/" + fileName.replace('.mp4', '.flv'))
			VideoGenHelper.convert(
				Paths.get(video),
				newFile,
				'flv'
			)
			assertTrue(newFile.toFile.exists)
			assertTrue(newFile.toFile.canRead)
			assertNotEquals(0, newFile.toFile.length)
		}
	}

	@Test
	def void getMimeType() {
		for (video: oracle_file_list) {
			assertEquals(oracle_mimeType, VideoGenHelper.getMimeType(Paths.get(video)))
		}
	}
	
	@Test
	def getDuration() {
		var i = 0;
		for (video: oracle_file_list) {
			val duration = VideoGenHelper.getDuration(Paths.get(video))
			assertEquals(
				oracle_duration_list.get(oracle_file_list.indexOf(video)),
				duration
			)
			i++
		}
	}
	
	@Test
	def mkDirs() {
		val path = Paths.get("resources/oracleDir/oracleDir")
		VideoGenHelper.mkDirs(path)
		// toAbsolutePath is mandatory, not absolute which is insufficient
		assertTrue(new File(path.toAbsolutePath.toString).exists)
		assertTrue(new File(path.toAbsolutePath.toString).isDirectory)
	}
    
	@Test
    def allSequences() {
		var allSequences = VideoGenHelper.allSequences(videoGen)
		assertEquals(
			oracle_file_list.size,
			allSequences.size
		)
		for (sequence: allSequences) {
			assertTrue(oracle_name_list.contains(sequence.name))
			assertTrue(oracle_file_list.contains(sequence.url))
		}
    }

}
