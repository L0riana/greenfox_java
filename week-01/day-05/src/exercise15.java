import java.util.Scanner;

public class exercise15 {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, write a whole number here: ");

    int distance = scanner.nextInt();
    double mile;

    mile = distance * 0.62137;

    System.out.println(distance + " kilometer(s) equals to: " + mile + " mile(s).");
  }
}
