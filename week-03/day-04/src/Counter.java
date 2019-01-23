import java.util.Scanner;

public class Counter {

  public static void main(String[] args) {
    // Write a recursive function that takes one parameter: n and counts down from n.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    System.out.println(counter(number));
  }

  private static int counter(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return counter(n - 1);
    }
  }
}
