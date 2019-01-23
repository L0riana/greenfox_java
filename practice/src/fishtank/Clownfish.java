package fishtank;

public class Clownfish extends Fish {

  private String stripeColor;

  public Clownfish(String name, int weight, String color, String stripeColor) {
    super(name, weight, color);
    this.stripeColor = stripeColor;
  }

  @Override
  public String status() {
    return super.status() + ", stripe color: " + stripeColor;
  }
}
