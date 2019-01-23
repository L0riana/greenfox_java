import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllArrayList {
  public static void main(String[] args) {
    // - Create an array variable named `af`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print all the elements of `af`
    ArrayList<Integer> af = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
    printAll(af);
  }

  private static void printAll(ArrayList<Integer> numbers) {
    //(numbers).forEach(System.out::println);
    System.out.println(numbers);
  }
}
