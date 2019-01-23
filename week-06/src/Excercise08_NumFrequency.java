import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Excercise08_NumFrequency {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of numbers in the following array:

    ArrayList<Integer> numbers =
            new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    //with method
    numberFrequency(numbers);

    //with stream
    System.out.println(numbers
            .stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
  }

  public static void numberFrequency(ArrayList<Integer> numbers) {
    Set<Integer> set = new HashSet<Integer>(numbers);
    for (Integer tmp : set) {
      System.out.print(tmp + " : " + Collections.frequency(numbers, tmp) + ", ");
    }
    System.out.println();
  }
}
