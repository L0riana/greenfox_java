package Pirates;

public class Pirate {

  private String name;
  private int intoxicationLevel;
  private boolean isDead;
  private boolean ableToFight;

  public Pirate(String name) {
    this.name = name;
    this.intoxicationLevel = 0;
    this.isDead = false;
    this.ableToFight = true;
  }

  public void drinkSomeRum() {
    if (!isDead) {
      intoxicationLevel++;
    } else {
      System.out.println(name + " is dead.");
    }
  }

  public String howsItGoingMate() {
    if (!isDead) {
      if (intoxicationLevel < 4) {
        return "Pour me anudder!";
      } else {
        ableToFight = false;
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      }
    }
    return "He's dead.";
  }

  public void die() {
    isDead = true;
  }

  public String brawl(Pirate otherPirate) {
    double random = Math.random();
    if (random > 0.67) {
      this.die();
      return name + " died.";
    } else if (random < 0.33) {
      otherPirate.die();
      return otherPirate.name + " died.";
    } else {
      ableToFight = false;
      return "Both pirates passed out.";
    }
  }
}
