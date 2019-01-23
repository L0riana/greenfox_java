import java.util.Scanner;

public class DrawDiamond30 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    for (int i = 1; i <= number; i++) {
      for (int j = number - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = (i * 2) - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = number - 1; i > 0; i--) {
      for (int j = i; j < number; j++) {
        System.out.print(" ");
      } for (int k = (i * 2) - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
