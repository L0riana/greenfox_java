package animal;

public class Main {

  public static void main(String[] args) {
    // write your code here
//    Animal tiger = new Animal();
//
//    tiger.eat();
//    System.out.println(tiger);
//
//    tiger.drink();
//    System.out.println(tiger);
//
//    tiger.play();
//    System.out.println(tiger);

    Farm newFarm = new Farm();
    for (int i = 0; i < 3; i++) {
      newFarm.breed();
    }

    System.out.println(newFarm);
    newFarm.animals.get(0).eat();
    System.out.println(newFarm);
    newFarm.slaughter();
    System.out.println(newFarm);
  }
}
