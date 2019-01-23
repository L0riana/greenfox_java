public class Exercise05_FindUppercase {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!

    String text = "Find The UpperCase Characters";

    //with method
    findTheUpperCase(text);

    //with stream
    String uppercaseChars = text
            .chars()
            .filter((c) -> Character.isUpperCase(c))
            .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
            .toString();
    System.out.println(uppercaseChars);

    text
            .chars()
            .mapToObj(c -> (char) c)
            .filter(c -> Character.isUpperCase(c))
            .map(c -> c + " ")
            .forEach(System.out::print);
  }

  public static void findTheUpperCase(String text) {
    for (int i = 0; i < text.length(); i++) {
      if (Character.isUpperCase(text.charAt(i))) {
        System.out.print(text.charAt(i) + " ");
      }
    }
    System.out.println();
  }
}
