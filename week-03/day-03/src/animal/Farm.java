package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animals = new ArrayList<>();

  int slots = 3;

  public void add(Animal animal) {
    this.animals.add(animal);
  }

  public void breed() {
    if (slots > 0) {
      this.animals.add(new Animal());
      slots--;
    } else {
      System.out.println("No more room for animals.");
    }
  }

  public void slaughter() {
    int leastHungerLevel = animals.get(0).getHunger();
    int leastHungerLevelIndex = 0;
    for (int i = 0; i < animals.size() - 1; i++) {
      if (animals.get(i).getHunger() < leastHungerLevel) {
        leastHungerLevelIndex = i;
      }
    }
    System.out.println("The least hungry animal's hungerLevel is: " + animals.get(leastHungerLevelIndex).getHunger());
    animals.remove(leastHungerLevelIndex);
  }

  @Override
  public String toString() {
    return "Farm{" +
            "animals=" + animals +
            '}';
  }
}
