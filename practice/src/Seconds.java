import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    // Create a function that takes a list as a parameter,
    // and returns a new list with every second element from the original list
    // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(printEverySecond(list));
  }

  public static List<Integer> printEverySecond(List<Integer> numberList) {
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer number : numberList) {
      if (numberList.indexOf(number) % 2 == 1) {
        result.add(number);
      }
    }
    return result;
  }
}
