package petrolstation;

public class Station {

  private int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    gasAmount -= car.getCapacity() - car.getGasAmount();
    car.setGasAmount(car.getCapacity());
  }

  @Override
  public String toString() {
    return "Station {" +
            "gasAmount = " + gasAmount +
            '}';
  }
}
