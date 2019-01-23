package aircraftCarrier;

import java.util.ArrayList;

public class Carrier {

  private ArrayList<Aircraft> aircrafts;
  private int ammoStorage;
  private int carrierHealth;

  public Carrier(int ammoStorage, int carrierHealth) {
    this.aircrafts = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    this.carrierHealth = carrierHealth;
  }

  public void add(Aircraft type) {
    aircrafts.add(type);
  }

  public void fill() {
    if (ammoStorage == 0) {
      throw new RuntimeException("There is no ammo.");
    } else if (ammoStorage > 0) {
      for (int i = 0; i < aircrafts.size(); i++) {
        if (aircrafts.get(i).isPriority()) {
          ammoStorage = aircrafts.get(i).refill(ammoStorage);
        }
      }
      for (int i = 0; i < aircrafts.size(); i++) {
        if (!aircrafts.get(i).isPriority()) {
          ammoStorage = aircrafts.get(i).refill(ammoStorage);
        }
      }
    }
  }


  public int totalDamage() {
    int totalDamage = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      totalDamage += aircrafts.get(i).fight();
    }
    return totalDamage;
  }

  public String getAllStatus() {
    String carrierStatus = "HP: " + carrierHealth + ", Aircraft count: " + aircrafts.size() +
            ", Ammo Storage: " + ammoStorage + ", Total damage: " + totalDamage() + "\n Aircrafts:\n";
    for (int i = 0; i < aircrafts.size(); i++) {
      carrierStatus += aircrafts.get(i).getStatus() + "\n";
    }
    return carrierStatus;
  }

  public void carrierFight(Carrier carrierToFightWith) {
    int carrierToFightWithHealth = carrierToFightWith.carrierHealth;
    if (carrierToFightWithHealth > totalDamage()) {
      carrierToFightWithHealth -= totalDamage();
    } else {
      carrierToFightWithHealth = 0;
    }
    if (carrierHealth > carrierToFightWith.totalDamage()) {
      carrierHealth -= carrierToFightWith.totalDamage();
    } else {
      carrierHealth = 0;
    }
    setCarrierHealth(carrierHealth);
    carrierToFightWith.setCarrierHealth(carrierToFightWithHealth);
    if (carrierHealth <= 0) {
      System.out.println("It's dead Jim :(");
    } else if (carrierToFightWithHealth <= 0) {
      System.out.println("We won.");
    }
  }

  public void setCarrierHealth(int carrierHealth) {
    this.carrierHealth = carrierHealth;
  }
}
