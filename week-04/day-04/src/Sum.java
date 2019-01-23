import java.util.ArrayList;
import java.util.List;

public class Sum {

  private ArrayList<Integer> list1;

  public Sum() {
    this.list1 = new ArrayList<>();
  }

  public int sumListElements(List<Integer> list1) {
    int sum = 0;
    for (int i = 0; i < list1.size(); i++) {
      sum += list1.get(i);
    }
    return sum;
  }
}
