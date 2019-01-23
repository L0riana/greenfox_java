import java.util.Scanner;

public class Power {

  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
    // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your base number here: ");
    int base = scanner.nextInt();
    System.out.println("Enter your power number here: ");
    int power = scanner.nextInt();
    System.out.println(resultPower(base, power));
  }

  private static int resultPower(int b, int p) {
    int r = 1;
    if (p == 0) {
      return r;
    } else if (p > 0) {
      r = b * resultPower(b, p - 1);
    }
    return r;
  }
}
