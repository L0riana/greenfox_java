import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public void stringToHashmap(String inputString) {
    char[] charsOfword = inputString.replaceAll("[\\s]", "").toCharArray();
    int count = 0;
    char ch = charsOfword[count];
    Map<Character, Integer> charCounter = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      if (charCounter.containsKey(charsOfword[i])) {
        charCounter.put(ch, charCounter.get(ch) + 1);
      } else {
        charCounter.put(ch, 1);
      }
    }
    for (Character key : charCounter.keySet()) {
      System.out.println(key + "" + charCounter.get(key));
    }
  }
}
