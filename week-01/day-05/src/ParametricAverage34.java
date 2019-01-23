import java.util.Scanner;

public class ParametricAverage34 {
  public static void main(String[] args) {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    double average = 0;
    int myNumber;
    int numbersTo;

    System.out.println("Enter a number between 1-10, then press enter.");
    numbersTo = scanner.nextInt();

    for (int i = 1; i <= numbersTo; i++) {
      System.out.println("Enter number" + " " + i + " then press enter.");
      myNumber = scanner.nextInt();
      sum = sum + myNumber;
      average = (double)sum / numbersTo;
    }
    System.out.println("The sum of your " + numbersTo + " numbers is: " + sum);
    System.out.println("The average of your " + numbersTo + " numbers is: " + average);
  }
}
