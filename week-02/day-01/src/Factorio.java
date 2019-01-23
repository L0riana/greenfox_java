import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
// - Create a function called `factorio`
//   that returns it's input's factorial
    Scanner scanner = new Scanner(System.in);
    System.out.println("Numbers will be multiplied from 1 to your number to get the product: this is factorial. \nEnter your number here (0-16): ");
    int number = scanner.nextInt();
    System.out.println("The factorial of your number is: ");
    System.out.println(factorio(number));
  }

  public static int factorio(int inputNumber) {
    int fact = 1;
    for (int i = 0; i < inputNumber; i++) {
      fact += fact * i;
    }
    return fact;
  }
}
