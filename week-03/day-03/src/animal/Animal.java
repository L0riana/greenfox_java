package animal;

public class Animal {
  /*
  Create an Animal class
  Every animal has a hunger value, which is a whole number
                  Every animal has a thirst value, which is a whole number
                  when creating a new animal object these values are created with the default 50 value
  Every animal can eat() which decreases their hunger by one
  Every animal can drink() which decreases their thirst by one
  Every animal can play() which increases both by one
  */
  private int hunger;
  private int thirst;

  public Animal() {
    hunger = 5;
    thirst = 5;
  }

  public void eat() {
    hunger--;
  }

  public void drink() {
    thirst--;
  }

  public void play() {
    hunger++;
    thirst++;
  }

  @Override
  public String toString() {
    return "hunger = " + hunger +
            ", thirst = " + thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }
}
