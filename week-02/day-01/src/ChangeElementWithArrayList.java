import java.util.ArrayList;
import java.util.Arrays;

public class ChangeElementWithArrayList {
  public static void main(String[] args) {
    // - Create an array variable named `s`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the 8 to 4
    // - Print the fourth element
    ArrayList<Integer> s = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 8, 5, 6));
    s.set(3, 4);
    System.out.println(s.get(3));
  }
}
