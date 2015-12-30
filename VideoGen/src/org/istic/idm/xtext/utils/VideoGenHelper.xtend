package org.istic.idm.xtext.utils

import java.io.IOException
import java.nio.file.Path
import java.time.LocalTime
import java.util.LinkedList
import java.util.List
import java.util.logging.Level
import java.util.logging.Logger
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.apache.commons.exec.ExecuteException
import org.apache.commons.exec.LogOutputStream
import org.apache.commons.exec.PumpStreamHandler
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import java.util.Collection
import org.istic.idm.xtext.videoGen.Sequence
import org.istic.idm.xtext.videoGen.VideoGen
import java.util.ArrayList
import org.istic.idm.xtext.videoGen.Alternatives
import org.istic.idm.xtext.videoGen.Mandatory
import org.istic.idm.xtext.videoGen.Optional

/** 
 * Execute helper using apache commons exed
 * add this dependency to your pom.xml:
 * <dependency>
 * 		<groupId>org.apache.commons</groupId>
 * 		<artifactId>commons-exec</artifactId>
 * 		<version>1.2</version>
 * </dependency>
 * @see http://stackoverflow.com/questions/7340452/process-output-from-apache-commons-exec
 * @author Wolfgang Fahl <info@bitplan.com>
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 * TODO: should be abstract from creating files inside the system path... Which could lead to mkDirs method removal
 */
public class VideoGenHelper {
	
	/**
	 * Local logger
	 */	
	protected static Logger LOGGER = Logger.getLogger("videoGen.cmd")
	
	/**
	 * Define logger level
	 * 
	 * TODO: maybe add a low level helper with an aspect
	 * @author <stephane.mangin@freesbee.fr>
	 */
	new() {
		LOGGER.setLevel(Level.ALL)
	}

	/** 
	 * LogOutputStream
	 * http://stackoverflow.com/questions/7340452/process-output-from
	 * -apache-commons-exec
	 * @author Wolfgang Fahl <info@bitplan.com>
	 */
	static class ExecResult extends LogOutputStream {
		int exitCode

		/** 
		 * @return the exitCode
		 * 
		 * @author Wolfgang Fahl <info@bitplan.com>
		 */
		def int getExitCode() {
			return exitCode
		}

		/** 
		 * @param exitCode the exitCode to set
		 * 
		 * @author Wolfgang Fahl <info@bitplan.com>
		 */
		def void setExitCode(int exitCode) {
			this.exitCode = exitCode
		}

		final List<String> lines = new LinkedList<String>()

		override protected void processLine(String line, int level) {
			lines.add(line)
		}

		def List<String> getLines() {
			return lines
		}
	}
	/** 
	 * execute the given command
	 * @param cmd - the command 
	 * @param exitValue - the expected exit Value
	 * @return the output as lines and exit Code
	 * @throws Exception
	 * 
	 * @author Wolfgang Fahl <info@bitplan.com>
	 */

	def static ExecResult execCmd(String cmd, int exitValue) {
		LOGGER.info('''Running «cmd»''')
		var CommandLine commandLine = CommandLine.parse(cmd)
		var DefaultExecutor executor = new DefaultExecutor()
		executor.setExitValue(exitValue)
		var ExecResult result = new ExecResult()
		executor.setStreamHandler(new PumpStreamHandler(result))
		try {
			result.setExitCode(executor.execute(commandLine))
		} catch (ExecuteException e) {
			e.printStackTrace()
		} catch (IOException e) {
			e.printStackTrace()
		}
		return result
	}
	
	/**
	 * Create a thumbnail from the given video to the given path
	 * 
	 * TODO: should return a file object to be processed by the caller
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void createThumbnails(Path fullPath, Path thumbFileName) {
		val cmd = '''avconv -i "«fullPath»" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "«thumbFileName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}

	/**
	 * Convert this video conform to the given mimeType
	 *
	 * TODO: add a mimeType instead of a string format parameter
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void convert(Path fullPath, Path newFullPathName, String format) {
		var cmd = '''avconv -i "«fullPath»" -strict -2 -vcodec h264 -acodec aac -f «format» "«newFullPathName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}

	/**
	 * Return the mimeType object for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static Mimetypes_Enum getMimeType(Path fullPath) {
		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "«fullPath»"| cut -d ' ' -f 3'''
		var cmd = '''avconv -i "«fullPath»" 2>&1'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
		val durationPattern = result.lines.filter[contains("'" + fullPath + "'")]
		var mimeType = Mimetypes_Enum.NONE
		if (durationPattern.size > 0) {
			var tmpResult = durationPattern.get(0).split(" ").get(2).split(",")
			for (mt: tmpResult) {
				if (Mimetypes_Enum.values.map[mte | mte.getName()].contains(mt)) {
					mimeType = Mimetypes_Enum.getByName(mt)
				}
			}
		}
		mimeType
	}
	
	/**
	 * Return the duration (in seconds) for the given video
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static int getDuration(Path fullPath) {
		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "Duration"| cut -d ' ' -f 4 | sed s/,// | sed 's@\..*@@g' | awk '{ split($1, A, ":"); split(A[3], B, "."); print 3600*A[1] + 60*A[2] + B[1] }' '''
		var cmd = '''avconv -i "«fullPath»" 2>&1'''
		var result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
		val durationPattern = result.lines.filter[contains("Duration")]
		var duration = 0
		if (durationPattern.size > 0) {
			var tmpResult = durationPattern.get(0).split(" ").get(3).replace(',', '')
			val repr = LocalTime.parse(tmpResult)
			duration = repr.minute * 60 + repr.second
		}
		duration	
	}
	
	/**
	 * Create dirs contained in the given url
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static void mkDirs(Path path) {
		var cmd = '''mkdir -p «path.toAbsolutePath()»'''
		var result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}
    
 	/**
 	 * Return all sequences contained in a VideoGen instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static Collection<Sequence> allSequences(VideoGen videoGen) {
		val Collection<Sequence> sequences = new ArrayList<Sequence>
			
        videoGen.statements.forEach[statement |
			if (statement instanceof Alternatives) {
				statement.options.forEach[option |
					sequences += option.sequence
				]
			} else if(statement instanceof Mandatory) {
				sequences += statement.sequence
			} else if(statement instanceof Optional) {
				sequences += statement.sequence
			}
		]
		sequences
    }

}
