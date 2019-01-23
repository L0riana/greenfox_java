import java.util.ArrayList;
import java.util.Arrays;

public class Exercise04_SquaredValueOver20 {
  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    //with method
    printSquaredOverTwenty(numbers);

    //with stream
    numbers
            .stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .forEach(System.out::println);
  }

  public static void printSquaredOverTwenty(ArrayList<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (Math.pow(numbers.get(i), 2) > 20) {
        System.out.print((int) Math.pow(numbers.get(i), 2) + " ");
      }
    }
    System.out.println();
  }
}
