public class Cuboid {
  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume

  private int height;
  private int length;
  private int width;

  public Cuboid(int height, int length, int width) {
    this.height = height;
    this.length = length;
    this.width = width;
  }

  public int getSurface() {
    return 2 * (height * length + height * width + length * width);
  }

  public int getVolume() {
    return height * length * width;
  }
}
