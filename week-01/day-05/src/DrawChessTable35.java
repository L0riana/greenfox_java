public class DrawChessTable35 {
  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    //
    int lines = 8;
    int columns = 4;
    for (int i = 0; i < lines; i++) {
      for (int j = 0; j < columns; j++) {
        if (i % 2 == 0) {
          System.out.print("% ");
        } else {
          System.out.print(" %");
        }
      }
      System.out.println();
    }
  }
}
