public class AppendA {

  public static void main(String[] args) {
    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end
    String[] nimals = {"kuty", "macsk", "cic"};
    for (int i = 0; i < nimals.length; i++) {
      System.out.println(nimals[i] + "a");
    }
  }
}
