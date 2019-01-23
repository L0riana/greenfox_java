public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    String inputText = "xxxyoxlkx is xyellxxow";
    char remove = 'x';

    System.out.println(inputText);
    String newString = correctString(inputText);
    System.out.println(newString);
  }

  public static String correctString(String text) {
    if (text.length() == 1) {
      return text;
    } else if (text.charAt(0) == 'x') {
      return correctString(text.substring(1));
    } else {
      return text.charAt(0) + correctString(text.substring(1));
    }
  }
}
