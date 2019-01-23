import java.util.ArrayList;
import java.util.List;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indeces of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list

    //  Example:
    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61, 129}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61, 129}));
    //  should print: '[]'
  }

  public static List<Integer> subInt(int subInt, int[] numberList) {
    List<Integer> indices = new ArrayList<>();
    for (int i = 0; i < numberList.length; i++) {
      if (numberList[i] % 10 == subInt ||
              numberList[i] / 10 % 10 == subInt ||
                  numberList[i] / 100 % 100 == subInt) {
          indices.add(i);
      }
    }
    return indices;
  }
}
