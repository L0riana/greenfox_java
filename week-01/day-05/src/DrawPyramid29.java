import java.util.Scanner;

public class DrawPyramid29 {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number here: ");
    int number = scanner.nextInt();
    /*for (int i = 0; i < number; i++) {
      for (int j = 0; j < number - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = number - i; k <= number; k++) {
        System.out.print("*");
      }
      for (int k = number - i ; k < number; k++) {
        System.out.print("*");
      }
      for (int j = 0; j < number - i; j++) {
        System.out.print(" ");
      }
      */
    System.out.print("\n");
    for (int i = 1; i <= number; i++) {
      for (int j = number - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = (i * 2) - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
