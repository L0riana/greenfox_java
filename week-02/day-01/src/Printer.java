import java.lang.reflect.Array;
import java.util.Arrays;

public class Printer {

  public static void main(String[] args) {
    // - Create a function called `printer`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printer("first")
    // printer("first", "second")
    // printer("first", "second", "third", "fourh")
    // ...
    printer("apple", "monkey", "dog", "rabbit");
  }

  public static void printer(String... words) {

    System.out.println(Arrays.toString(words));
  }
}
