package charSequence;

public class Shifter implements CharSequence {
  String example;

  public Shifter(String example, int i) {
    this.example = example;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return example.substring(2, end);
  }
}
