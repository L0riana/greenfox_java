import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintEachLine {
  public static void main(String[] args) throws IOException {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"
    openFile();
  }

  private static void openFile() throws IOException {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("dog", "cat", "mouse"));
    String pathString = "my-file.txt";
    Path path1 = Paths.get(pathString);
    File file1 = new File(pathString);
    try {
      if (!file1.exists()) {
        System.out.println("Unable to read file: my-file.txt. It will be created.");
        file1.createNewFile();
      }
      Files.write(path1, list);
      System.out.println("The file contains the following lines:");
      for (String line : Files.readAllLines(path1)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();

    } finally {

    }
  }
}
