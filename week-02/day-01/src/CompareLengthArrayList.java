import java.util.ArrayList;
import java.util.Arrays;

public class CompareLengthArrayList {
  public static void main(String[] args) {
    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`
    ArrayList<Integer> p1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> p2 = new ArrayList<Integer>(Arrays.asList(4, 5));
    compare(p1, p2);
  }

  private static void compare(ArrayList<Integer> p1, ArrayList<Integer> p2) {
    if (p1.size() < p2.size()){
      System.out.println("p1 arraylist has less elements than p2.");
    }else if (p1.size() > p2.size()){
      System.out.println("p1 arraylist has more elements than p2.");
    }else{
      System.out.println("The two arraylists have equal number of elements.");
    }
  }
}
