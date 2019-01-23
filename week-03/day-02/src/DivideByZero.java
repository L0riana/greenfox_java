import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    number();
  } private static void number() {
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    try {
      int result = 10 / userInput;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
