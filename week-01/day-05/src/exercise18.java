import java.util.Scanner;

public class exercise18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, give me a whole number here, then press enter.");
    System.out.println("I will decide whether it is an even or an odd number.");

    int myNumber = scanner.nextInt();

    if (myNumber % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
