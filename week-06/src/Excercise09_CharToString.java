import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excercise09_CharToString {
  public static void main(String[] args) {
    //Write a Stream Expression to convert a char array to a string!

    char[] charArray = {'a', 'r', 'r', 'a', 'y'};

    //with method
    charToString(charArray);

    //with stream
    String streamOfChars = new String(charArray)
            .chars()
            .mapToObj(i -> (char) i)
            .map(Object::toString)
            .collect(Collectors.joining(""));
    System.out.println(streamOfChars);

    //with stream2
    System.out.println(Stream.of(charArray)
            .map(String::valueOf)
            .collect(Collectors.joining()));
  }

  public static void charToString(char[] charArray) {
    System.out.println(charArray);
  }
}
