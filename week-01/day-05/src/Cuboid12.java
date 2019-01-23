public class Cuboid12 {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000

    double a = 20;
    double b = 30;
    double c = 40;

    double surfaceArea = 2 * (a * b + a * c + b * c);
    double volume = a * b * c;

    int i = (int) surfaceArea;
    int j = (int) volume;

    System.out.println("Surface area: " + i);
    System.out.println("Volume: " + j);
  }
}
