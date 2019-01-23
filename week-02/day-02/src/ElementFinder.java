import java.util.*;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsSevenOther(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!
  }

  private static String containsSeven(ArrayList<Integer> arrayListNew) {
    String answer;
    if (arrayListNew.contains(7)) {
      answer = "Hoorray";
    } else {
      answer = "Noooooo";
    }
    return answer;
  }

  private static String containsSevenOther(ArrayList<Integer> arrayListNew) {
    String answer = null;
    for (int i = 0; i < arrayListNew.size(); i++) {
      if (arrayListNew.get(i) == 7) {
        answer = "Hoorray";
      } else {
        answer = "Noooooo";
      }
    }return answer;
  }
}
