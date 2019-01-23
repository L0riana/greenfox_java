import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  private Apple apple = new Apple("apple");

  @Test
  public void getAppleTest() {
    assertEquals("apple", apple.getApple());
  }
}
