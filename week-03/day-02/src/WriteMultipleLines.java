import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;

public class WriteMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
    // than it should write to a file.
    // The path parameter should be a string, that describes the location of the file.
    // The word parameter should be a string, that will be written to the file as lines
    // The number parameter should describe how many lines the file should have.
    // So if the word is "apple" and the number is 5, than it should write 5 lines
    // to the file and each line should be "apple"
    // The function should not raise any error if it could not write the file.
    String path = "my-file.txt";
    String word = "Yesss";
    int number = 5;
    getParameters(path, word, number);
  }

  private static void getParameters(String path1, String word, int number) {
    try {
      for (int i = 0; i < number; i++) {
        Files.write(Paths.get(path1), word.getBytes(), APPEND);
      }
    } catch (IOException e) {
    } finally {
    }
  }
}
