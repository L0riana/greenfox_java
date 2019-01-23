public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    String text = "xolk is xellow";
    char from = 'x';
    char to = 'y';

    System.out.println(text);
    String newString = correctString(text, from, to);
    System.out.println(newString);
  }

  public static String correctString(String text, char from, char to) {
    if (text.length() == 1) {
      return text;
    } else if (text.charAt(0) == from) {
      text = to + text.substring(1);
    }
    return text.charAt(0) + correctString(text.substring(1, text.length()), from, to);
  }
}
