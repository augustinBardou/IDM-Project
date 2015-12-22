package org.istic.idm.xtext.utils

import java.io.IOException
import java.nio.file.Path
import java.util.LinkedList
import java.util.List
import java.util.logging.Level
import org.apache.commons.exec.LogOutputStream
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.apache.commons.exec.PumpStreamHandler
import org.apache.commons.exec.ExecuteException
import org.istic.idm.xtext.videoGen.Mimetypes_Enum
import java.util.ArrayList
import com.google.common.collect.Lists
import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDateTime
import java.sql.Time
import java.awt.SecondaryLoop
import java.time.LocalTime

/** 
 * Execute helper using apache commons exed
 * add this dependency to your pom.xml:
 * <dependency>
 * <groupId>org.apache.commons</groupId>
 * <artifactId>commons-exec</artifactId>
 * <version>1.2</version>
 * </dependency>
 * @author wf
 */
public class VideoGenHelper {
	protected static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger("videoGen.cmd")

	new() {
		LOGGER.setLevel(Level.ALL)
	}

	/** 
	 * LogOutputStream
	 * http://stackoverflow.com/questions/7340452/process-output-from
	 * -apache-commons-exec
	 * @author wf
	 */
	static class ExecResult extends LogOutputStream {
		int exitCode

		/** 
		 * @return the exitCode
		 */
		def int getExitCode() {
			return exitCode
		}

		/** 
		 * @param exitCode the exitCode to set
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
	// TODO Auto-generated catch block
	// TODO Auto-generated catch block
	// Helper methods
	}
	/** 
	 * execute the given command
	 * @param cmd - the command 
	 * @param exitValue - the expected exit Value
	 * @return the output as lines and exit Code
	 * @throws Exception
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

	def static void createThumbnails(Path fullPath, Path thumbFileName) {
		val cmd = '''avconv -i "«fullPath»" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "«thumbFileName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}

	}

	def static void convert(Path fullPath, Path newFullPathName, String format) {
		var cmd = '''avconv -i "«fullPath»" -strict -2 -f «format» "«newFullPathName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}

	}

	def static Mimetypes_Enum getMimeType(Path fullPath) {
		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "«fullPath»"| cut -d ' ' -f 3'''
		var cmd = '''avconv -i "«fullPath»" 2>&1'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
		var tmpResult = result.lines.filter[contains("'" + fullPath + "'")].get(0).split(" ").get(2).split(",")
		var mimeType = Mimetypes_Enum.NONE
		for (mt: tmpResult) {
			if (Mimetypes_Enum.values.map[mte | mte.getName()].contains(mt)) {
				mimeType = Mimetypes_Enum.getByName(mt)
			}
		}
		mimeType
	}
	
	def static int getDuration(Path fullPath) {
		//var cmd = '''avconv -i "«fullPath»" 2>&1 | grep "Duration"| cut -d ' ' -f 4 | sed s/,// | sed 's@\..*@@g' | awk '{ split($1, A, ":"); split(A[3], B, "."); print 3600*A[1] + 60*A[2] + B[1] }' '''
		var cmd = '''avconv -i "«fullPath»" 2>&1'''
		var result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
		var tmpResult = result.lines.filter[contains("Duration")].get(0).split(" ").get(3).replace(',', '')
		val repr = LocalTime.parse(tmpResult)
		repr.minute * 60 + repr.second
	}
	
	def static void mkDirs(Path path) {
		var cmd = '''mkdir -p «path.toAbsolutePath()»'''
		var result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}
	}

}
