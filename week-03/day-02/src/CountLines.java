import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.
    countLines("my-file.txt");
  }

  private static int countLines(String file) {

    Path path1 = Paths.get(file);
    int lineNumber = 0;

    try {
      for (String line : Files.readAllLines(path1)) {
        lineNumber++;
      }
      System.out.println("The file contains " + lineNumber + " line(s).");
      return lineNumber;
    } catch (IOException e) {
      System.out.println("The file does not exist.");
      return 0;
    }
  }
}
