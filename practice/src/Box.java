public class Box {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume

  public static void main(String[] args) {

    Cuboid cuboid = new Cuboid(10, 10, 10);

    System.out.println(cuboid.getSurface());
    System.out.println(cuboid.getVolume());
  }
}
