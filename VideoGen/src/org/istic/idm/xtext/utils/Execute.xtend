package org.istic.idm.xtext.utils

import java.io.IOException
import java.nio.file.Path
import java.util.LinkedList
import java.util.List
import java.util.logging.Level
import org.apache.commons.exec.CommandLine
import org.apache.commons.exec.DefaultExecutor
import org.apache.commons.exec.ExecuteException
import org.apache.commons.exec.LogOutputStream
import org.apache.commons.exec.PumpStreamHandler

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
public class Execute {
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
		var String cmd = '''avconv -i "«fullPath»" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "«thumbFileName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}

	}

	def static void convert(Path fullPath, Path newFullPathName, String format) {
		var String cmd = '''avconv -i "«fullPath»" -strict -2 -f «format» "«newFullPathName»"'''
		var ExecResult result = execCmd(cmd, 1)
		for (String line : result.getLines()) {
			LOGGER.finest(line)
		}

	}

	def static void mkDirs(Path path) {
		try {
			var CommandLine mkdir = CommandLine.parse('''mkdir -p «path.toAbsolutePath()»''')
			LOGGER.info(mkdir.toString())
			var DefaultExecutor executor = new DefaultExecutor()
			executor.setExitValue(0)
			executor.execute(mkdir)
		} catch (Exception e) {
			LOGGER.severe(e.getMessage())
		}

	}

}
