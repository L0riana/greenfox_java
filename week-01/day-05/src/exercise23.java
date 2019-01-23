public class exercise23 {
  public static void main(String[] args) {
    // Create a program that writes this line 100 times:
    // "I won't cheat on the exam!"
    String noCheat = "I won't cheat on the exam!";
    int a = 0;

    while (a < 100) {
      System.out.println(noCheat);
      a++;
    }
    System.out.println("written 100 times");
  }
}
