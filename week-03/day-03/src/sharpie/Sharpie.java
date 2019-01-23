package sharpie;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount;

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use() {
    if (inkAmount > 5) {
      inkAmount -= 5;
    } else {
      inkAmount = 0;
    }
  }

  public float getInkAmount() {
    return inkAmount;
  }

  @Override
  public String toString() {
    return "Sharpie{" +
            "color = '" + color + '\'' +
            ", width = '" + width + '\'' +
            ", inkAmount = '" + inkAmount + '\'' +
            '}';
  }
}
