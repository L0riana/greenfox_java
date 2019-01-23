import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  private Sum sumTest = new Sum();
  private ArrayList<Integer> list1 = new ArrayList<>();

  @Test
  public void sumTestEmptyList() {
    assertEquals(0, sumTest.sumListElements(list1));
  }

  @Test
  public void sumTestOneElement() {
    list1.add(1);
    assertEquals(1, sumTest.sumListElements(list1));
  }

  @Test
  public void sumTestMultipleElements() {
    list1.add(1);
    list1.add(2);
    assertEquals(3, sumTest.sumListElements(list1));
  }

  @Test(expected = NullPointerException.class)
  public void sumTestNull() {
    list1.add(null);
    assertEquals(6, sumTest.sumListElements(list1));
  }

  @Test
  public void sumTestList1() {
    for (int i = 1; i < 4; i++) {
      list1.add(i);
    }
    assertEquals(6, sumTest.sumListElements(list1));
  }
}
