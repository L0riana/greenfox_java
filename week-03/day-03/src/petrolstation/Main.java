package petrolstation;

public class Main {
  public static void main(String[] args) {

    Station lukoil = new Station(500);
    Car mercedes = new Car(0, 100);

    System.out.println(lukoil.toString());
    System.out.println(mercedes.toString());

    lukoil.refill(mercedes);

    System.out.println(lukoil.toString());
    System.out.println(mercedes.toString());
  }
}
