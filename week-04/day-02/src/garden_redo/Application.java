package garden_redo;

public class Application {

  public static void main(String[] args) {

    Garden garden = new Garden();

    Flower yellow = new Flower("yellow");
    garden.addPlant(yellow);
    Flower blue = new Flower("blue");
    garden.addPlant(blue);
    Tree purple = new Tree("purple");
    garden.addPlant(purple);
    Tree orange = new Tree("orange");
    garden.addPlant(orange);

    garden.getStatus();
    garden.waterThirstyPlants(40);;
    garden.getStatus();
    garden.waterThirstyPlants(70);
    garden.getStatus();
  }
}
