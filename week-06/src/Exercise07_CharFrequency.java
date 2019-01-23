import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class Exercise07_CharFrequency {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!

    String text = "find the i-s in indian";

    //with method
    Map<Character, Integer> frequencies = new HashMap<>();
    for (char ch : text.toCharArray())
      frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
    System.out.println("Frequencies:\n" + frequencies);

    //with method2
    charFrequency(text);

    //with stream
    Map<Character, Integer> freq = text
            .chars()
            .boxed()
            .collect(toMap(
                    ch -> ((char) ch.intValue()),
                    i -> 0,
                    Integer::sum));
    System.out.println("Frequencies:\n" + frequencies);

    //with stream2
    System.out.println(text
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
  }

  public static void charFrequency(String text) {
    int count = 0;
    ArrayList<Character> c = new ArrayList<Character>();
    for (int i = 0; i < text.length(); i++) {
      count = 0;
      if (c.contains(text.charAt(i))) {
        continue;
      }
      c.add(text.charAt(i));
      for (int j = 0; j < text.length(); j++) {
        if (text.charAt(j) == text.charAt(i)) {
          count++;
        }
      }
      System.out.print(text.charAt(i) + " = " + count + ", ");
    }
    System.out.println();
  }
}
