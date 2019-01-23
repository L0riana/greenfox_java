import java.util.Scanner;

public class DrawSquare31 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %   %
    // %   %
    // %   %
    // %   %
    // %%%%%
    //
    // The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      System.out.println();
      for (int j = 0; j < number; j++) {
        if (i == 0 || i == number - 1) {
          System.out.print("%");
        } else if (j == 0 || (j == number - 1)) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}
