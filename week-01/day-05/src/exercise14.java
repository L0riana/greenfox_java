import java.util.Scanner;

public class exercise14 {
  public static void main(String[] args) {

    System.out.println("Please, write your name here: ");
    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();

    // It prints the whole line that was given by the user
    System.out.println("Hello, " + name + "! Welcome on board! We wish you'll have a pleasant journey.");
  }
}
