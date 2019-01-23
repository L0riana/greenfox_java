import java.util.ArrayList;
import java.util.Arrays;

public class AppendAWithArrayList {
  public static void main(String[] args) {
    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end
    ArrayList<String> nimals = new ArrayList<String>(Arrays.asList("kuty", "macsk", "cic"));

    for (int i = 0; i < nimals.size(); i++) {
      System.out.println(nimals.get(i) + "a");
    }
  }
}
