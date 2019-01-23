import java.util.Scanner;

public class exercise21 {
  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is exellent!
    // If the the number of girls and boys are equal and there are more people coming than 20
    //
    // It should print: Quite cool party!
    // It there are more than 20 people coming but the girl - boy ratio is not 1-1
    //
    // It should print: Average party...
    // If there are less people coming than 20
    //
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, give me the number of the girls and the boys separately, who are coming to the part. Press enter after each number.");
    int girls = scanner.nextInt();
    int boys = scanner.nextInt();
    int total = girls + boys;

    if (girls == boys && total > 20) {
      System.out.println("The party is excellent");
    } else if (girls > 0 && girls != boys && total > 20) {
      System.out.println("Quite cool party!");
    } else if (total < 20 && girls > 0) {
      System.out.println("Average party...");
    } else if (girls == 0) {
      System.out.println("Sausage party");
    } else {
      System.out.println("Anything can happen :).");
      System.out.println("WARNING: No specification for exactly 20 people if at least one girl is coming to the party.");
    }
  }
}
