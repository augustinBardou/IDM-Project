package fr.nemomen.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.annotation.Generated;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtend.core.compiler.XtendGenerator", date = "2016-01-07T16:58+0100")
public class SystemTests {
  @Test
  public void mkDirsTest() {
    final Path path = Paths.get("resources/oracleDir/oracleDir");
    fr.nemomen.utils.System.mkDirs(path);
    Path _absolutePath = path.toAbsolutePath();
    String _string = _absolutePath.toString();
    File _file = new File(_string);
    boolean _exists = _file.exists();
    Assert.assertTrue(_exists);
    Path _absolutePath_1 = path.toAbsolutePath();
    String _string_1 = _absolutePath_1.toString();
    File _file_1 = new File(_string_1);
    boolean _isDirectory = _file_1.isDirectory();
    Assert.assertTrue(_isDirectory);
  }
}
