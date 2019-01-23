import java.util.Scanner;

public class exercise19 {
  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, give me a positive whole number here, then press enter.");

    float myNumber = scanner.nextFloat();

    if (myNumber <= 0) {
      System.out.println("Not enough");
    } else if (myNumber == 1) {
      System.out.println("One");
    } else if (myNumber == 2) {
      System.out.println("Two");
    } else if (myNumber > 2) {
      System.out.println("A lot");
    }
  }
}
