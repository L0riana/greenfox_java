import java.util.Scanner;

public class exercise16 {
  public static void main(String[] args) {

    int chickenLegNr = 2;
    int pigLegNr = 4;

    Scanner scanner = new Scanner(System.in);
    // Write a program that asks for two integers

    System.out.println("Please, write a positive whole number. This represents the number of chickens a farmer has.");
    int chickenNumber = scanner.nextInt();

    // The first represents the number of chickens the farmer has
    System.out.println("Please, write a positive whole number. This represents the number of pigs owned by the farmer.");
    int pigNumber = scanner.nextInt();

    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    int legTotal = (chickenLegNr * chickenNumber) + (pigLegNr * pigNumber);

    System.out.println("The animals have " + legTotal + " legs in total.");
  }
}
