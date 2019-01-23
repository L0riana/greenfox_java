import java.util.Scanner;

public class SubStr {
  public static void main(String[] args) {
    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one

    //  Example:
    //System.out.println(subStr("this is what I'm searching in", "searching"));
    //  should print: `17`
    //System.out.println(subStr("this is what I'm searching in", "not"));
    //  should print: `-1`
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a short text in which you are searching.");
    String searchIn = scanner.nextLine();
    System.out.println("Write another text what you are searching for in the first text.");
    String searchFor = scanner.nextLine();

    int indexStart = subStr(searchIn, searchFor);

    System.out.println("The starting point of your text in your input text is: " + indexStart);

  }

  public static int subStr(String input, String q) {
    int iStart = input.indexOf(q);
    if (iStart != -1) {
    }
    return iStart;
  }
}
