import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    String myName = "Julianna Serly";
    try {
      Path path1 = Paths.get("my-file.txt");
      Files.write(path1, myName.getBytes(), StandardOpenOption.APPEND);
      for (String line : Files.readAllLines(path1)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    } finally {
    }
  }
}
