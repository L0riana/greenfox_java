package fishtank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

  private List<Fish> fishes;

  public Aquarium() {
    fishes = new ArrayList<>();
  }

  public void add(Fish fish) {
    fishes.add(fish);
  }

  public void feed() {
    for (Fish fish : fishes) {
      fish.feed();
    }
  }

  public String showStatus() {
    String status = "";
    for (Fish fish : fishes) {
      status += fish.status() + "\n";
    }
    return status;
  }

//  public void removeOversizedFishes() {
//    for (Fish fish : fishes) {
//      if (fish.weight >= 11) {
//        fishes.remove(fish);
//      }
//    }
//  }

  public void removeOversizedFishes() {
    for (int i = 0; i < fishes.size(); i++) {
      if (fishes.get(i).getWeight() >= 11) {
        fishes.remove(i);
      }
    }
  }
}
