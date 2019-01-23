package garden_redo;

public class Plant {

  protected String color;
  protected String type;
  protected double currentWaterAmount;
  protected boolean needsWater;

  public Plant(String color) {
    this.color = color;
    this.needsWater = true;
  }

  @Override
  public String toString() {
    if (needsWater) {
      return "The " + color + " " + type + " needs water. This plant's current waterlevel is: " + currentWaterAmount;
    } else {
      return "The " + color + " " + type + " doesn't need water. This plant's current waterlevel is: " + currentWaterAmount;
    }
  }
}
