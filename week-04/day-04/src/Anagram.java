import java.util.Arrays;

public class Anagram {

  public static boolean anagram(String input1, String input2) {
    char[] word1 = input1.replaceAll("[\\s]", "").toCharArray();
    char[] word2 = input2.replaceAll("[\\s]", "").toCharArray();
    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1, word2);
  }
}
