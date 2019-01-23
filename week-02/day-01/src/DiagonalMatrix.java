public class DiagonalMatrix {
  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    int rows = 4;
    int columns = 4;
    int[][] twoDimMatrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (i == j) {
          System.out.print(twoDimMatrix[i][j] = 1);
          System.out.print(" ");
        } else {
          System.out.print(twoDimMatrix[i][j] = 0);
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
