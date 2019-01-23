package aircraftCarrier;

public class Aircraft {

  private String type;
  private int currentAmmo;
  private int maxAmmo;
  private int baseDamage;
  private int ammoStorage;

  public Aircraft() {
    this.currentAmmo = 0;
    this.type = type;
  }

  public int fight() {
    return baseDamage * currentAmmo;
  }

  public int refill(int ammoStorage) {
    if (ammoStorage <= (maxAmmo - currentAmmo)) {
      currentAmmo += ammoStorage;
      ammoStorage = 0;
    } else {
      ammoStorage -= maxAmmo - currentAmmo;
      currentAmmo = maxAmmo;
    }
    return ammoStorage;
  }

  public String getStatus() {
    return "Type: " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + fight();
  }

  public boolean isPriority() {
    return type.equals("F35");
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }
}
