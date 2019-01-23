package fishtank;

public class Fish {
  private String name;
  private int weight;
  private String color;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public String status() {
    return name + ", weight: " + weight + ", color: " + color;
  }

  public void feed() {
    weight++;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
