import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void anagramTest() {
    assertTrue(anagram.anagram("dog", "god"));
  }

  @Test
  public void anagramTestFalse() {
    assertFalse(anagram.anagram("dog", "gods"));
  }

  @Test
  public void anagramTestNoWord() {
    assertTrue(anagram.anagram("", ""));
  }
}
