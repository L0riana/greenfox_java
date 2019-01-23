import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    System.out.println("The result is: " + calculate());
  }

  private static int calculate() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("This is a calculator.\n" + "Please type in your operand add (+) or distract (-):");
    String operation = scanner.next();
    System.out.println("Please, type in your two numbers:");
    int operand1 = scanner.nextInt();
    int operand2 = scanner.nextInt();
    int result = 0;
    if (operation.contains("+")) {
      result = operand1 + operand2;
    } else if (operation.contains("-")) {
      result = operand1 - operand2;
    }
    return result;
  }
}
