import java.util.Scanner;

public class Refactorio {
  public static void main(String[] args) {
    // Create a recursive function called `refactorio`
    // that returns it's input's factorial
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(refactorio(number));
  }

  private static int refactorio(int n) {
    if (n <= 1)
      return 1;
    else
      return n * refactorio(n - 1);
  }
}
