import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise01_EvenNumbers {
  public static void main(String[] args) {
    //Write a Stream Expression to get the even numbers from the following array:
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    //with method
    evenNumbers(numbers);

    // with stream
    List<Integer> evenNumbers = numbers
            .stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

    System.out.println(evenNumbers);
  }

  public static void evenNumbers(ArrayList<Integer> numbers) {
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0){
        System.out.println(numbers.get(i));
      }
    }
  }
}
