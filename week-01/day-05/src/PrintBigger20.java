import java.util.Scanner;

public class PrintBigger20 {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, give me two numbers here, then press enter.");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    if (number1 > number2) {
      System.out.println("The first number is bigger: " + number1);
    } else if (number1 < number2) {
      System.out.println("The second number is bigger: " + number2);
    } else {
      System.out.println("Your numbers are equal.");
    }
  }
}
