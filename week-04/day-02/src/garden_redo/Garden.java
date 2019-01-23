package garden_redo;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void needsWater() {
    for (Plant plant : plants) {
      if (plant.type.equals("Flower") && plant.currentWaterAmount > 5) {
        plant.needsWater = false;
      } else if (plant.type.equals("Tree") && plant.currentWaterAmount > 10) {
        plant.needsWater = false;
      }
    }
  }

  public int countPlantThatNeedsWater() {
    int counter = 0;
    for (Plant plant : plants) {
      if (plant.needsWater) {
        counter++;
      }
    }
    return counter;
  }

  public void waterThirstyPlants(int wateringAmount) {
    System.out.println("Watering with " + wateringAmount);
    for (Plant plant : plants) {
      if (plant.needsWater) {
        if (plant.type.equals("Flower")) {
          plant.currentWaterAmount += 0.75 * wateringAmount / countPlantThatNeedsWater();
        }
        if (plant.type.equals("Tree")) {
          plant.currentWaterAmount += 0.4 * wateringAmount / countPlantThatNeedsWater();
        }
      }
    }
    needsWater();
  }

  public void getStatus() {
    for (Plant plant : plants) {
      System.out.println(plant.toString());
    }
  }
}
