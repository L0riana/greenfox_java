import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardOpenOption.APPEND;

public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String path1 = "my-file.txt";
    String path2 = "my-file2.txt";
    copyFile(path1, path2);
  }

  private static boolean copyFile(String path1, String path2) {
    try {
      Path pathFrom = Paths.get(path1);
      Path pathTo = Paths.get(path2);
      Files.copy(pathFrom, pathTo, REPLACE_EXISTING);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
