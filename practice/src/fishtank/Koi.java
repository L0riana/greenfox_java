package fishtank;

public class Koi extends Fish {

  public Koi(String name, int weight, String color) {
    super(name, weight, color);
  }

  @Override
  public void feed() {
    setWeight(getWeight() + 2);
  }
}
