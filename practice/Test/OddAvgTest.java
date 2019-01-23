import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class OddAvgTest {

  private OddAvg oddAvgTest = new OddAvg();
  private ArrayList<Integer> list1 = new ArrayList<>();

  @Test
  public void oddAvgTestMultipleElements() {
    list1.add(1);
    list1.add(2);
    list1.add(3);
    assertEquals(2, oddAvgTest.oddAverage(list1));
  }

  @Test(expected = NullPointerException.class)
  public void setOddAvgTestNull() {
    list1.add(null);
    assertEquals(6, oddAvgTest.oddAverage(list1));
  }

  @Test
  public void oddAvgTestOneElementOdd() {
    list1.add(1);
    assertEquals(1, oddAvgTest.oddAverage(list1));
  }
}
