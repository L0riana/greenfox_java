import java.util.Scanner;

public class Exercise32_DrawDiagonal {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();

    for (int i = 0; i < number; i++) {
      System.out.print("%");
    }
    System.out.println();
    for (int j = 1; j < number - 1; j++) {
      for (int k = 0; k <= number; k++) {
        if ((k == 0) || (j == k) || (k == number - 1)) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 0; i < number; i++) {
      System.out.print("%");
    }
  }
}
