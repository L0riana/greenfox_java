import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DoubleItems {

  public static void main(String[] args) {
    // - Create an array variable named `ag`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Double all the values in the array
    int[] ag = {3, 4, 5, 6, 7};
    for (int i = 0; i < ag.length; i++) {
      ag[i] *= 2;
      System.out.print(ag[i] + " ");
    }

    System.out.println();
    ArrayList<Integer> ag2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
    for (int i = 0; i < ag2.size(); i++) {
      System.out.print(ag2.get(i) * 2 + " ");
    }
  }
}
