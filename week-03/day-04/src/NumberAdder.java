import java.util.Scanner;

public class NumberAdder {
  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    System.out.println(numberAdder(number));
  }

  private static int numberAdder(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + numberAdder(n - 1);
    }
  }
}
