import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1, 5, 8, 11, 15));
    System.out.println(oddAverage((ArrayList<Integer>) listOfNumbers));
  }

  public static int oddAverage(ArrayList<Integer> listOfNumbers) {
    int sumOfOddNumbers = 0;
    int countOddNumbers = 0;
    for (int i = 0; i < listOfNumbers.size(); i++) {
      if (listOfNumbers.get(i) % 2 == 1) {
        sumOfOddNumbers += listOfNumbers.get(i);
        countOddNumbers++;
      }
    }
    return sumOfOddNumbers / countOddNumbers;
  }
}
