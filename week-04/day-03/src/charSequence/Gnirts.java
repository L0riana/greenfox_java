package charSequence;

public class Gnirts implements CharSequence {
  String example;

  public Gnirts(String example) {
    this.example = example;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return example.charAt(example.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
