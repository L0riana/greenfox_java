import java.util.Scanner;

public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    int sum = 0;
    System.out.println(sumDigit(number, sum));
  }

  private static int sumDigit(int n, int sum) {
    if (n == 0) {
      return sum;
    } else {
      sum = sum + n % 10;
      n = n / 10;
      return sumDigit(n, sum);
    }
  }
}
