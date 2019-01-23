import java.util.Scanner;

public class Bunny2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
    // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
    // have 3 ears, because they each have a raised foot. Recursively return the
    // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your bunny number here: ");
    int bunny = scanner.nextInt();
    System.out.println("The bunnies have " + sumEars(bunny) + " big floppy ears.");
  }

  private static int sumEars(int n) {
    if (n == 0) {
      return 0;
    } else {
      if (n % 2 == 0) {
        return 3 + sumEars(n - 1);
      } else {
        return 2 + sumEars(n - 1);
      }
    }
  }
}
