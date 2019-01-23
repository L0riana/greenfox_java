import java.util.*;
import java.util.stream.Collectors;

public class Exercise02_OddAverage {
  public static void main(String[] args) {
    //Write a Stream Expression to get the average value of the odd numbers from the following array:

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    //with method
    System.out.println(printAverage(numbers));

    //with stream
    numbers
            .stream()
            .filter(n -> n % 2 == 1)
            .mapToInt(n -> n)
            .average()
            .ifPresent(System.out::println);

    double average = numbers
            .stream()
            .filter(n -> n % 2 == 1)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();

    System.out.println(average);
  }

  public static double printAverage(ArrayList<Integer> numbers) {
    int sum = 0;
    int counter = 0;

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        sum += numbers.get(i);
        counter++;
      }
    }
    return sum / counter;
  }
}
