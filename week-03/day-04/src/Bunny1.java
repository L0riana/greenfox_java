import java.util.Scanner;

public class Bunny1 {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your bunny number here: ");
    int bunny = scanner.nextInt();
    System.out.println("The bunnies have " + sumEars(bunny) + " big floppy ears.");
  }

  private static int sumEars(int n) {
    if (n == 1) {
      return 2;
    } else {
      return 2 + sumEars(n-1);
    }
  }
}
