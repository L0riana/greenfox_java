package aircraftCarrier;

public class Application {
  public static void main(String[] args) {

    Carrier carrier1 = new Carrier(2000, 1300);
    Aircraft aircraft1 = new F16();
    Aircraft aircraft2 = new F35();
    carrier1.add(aircraft1);
    carrier1.add(aircraft2);

    carrier1.fill();

    Carrier carrier2 = new Carrier(25, 6);
    Aircraft aircraft3 = new F16();
    Aircraft aircraft4 = new F35();
    Aircraft aircraft5 = new F35();

    carrier2.add(aircraft3);
    carrier2.add(aircraft4);
    carrier2.add(aircraft5);

    carrier2.fill();

    System.out.println(carrier1.getAllStatus());
    System.out.println(carrier2.getAllStatus());

    System.out.println("//Fight//");

    carrier1.carrierFight(carrier2);
    System.out.println(carrier1.getAllStatus());
    System.out.println(carrier2.getAllStatus());
  }
}
