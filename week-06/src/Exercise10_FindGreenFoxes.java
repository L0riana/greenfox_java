import java.util.ArrayList;
import java.util.List;

public class Exercise10_FindGreenFoxes {
  public static void main(String[] args) {
    //Create a Fox class with 3 properties(name, type, color)
    // Fill a list with at least 5 foxes, it's up to you how you name/create them!
    // Write a Stream Expression to find the foxes with green color!
    // Write a Stream Expression to find the foxes with green color and pallida type!

    List<Fox> foxList = new ArrayList<>();

    foxList.add(new Fox("fox1", "pallida", "green"));
    foxList.add(new Fox("fox2", "corsac", "green"));
    foxList.add(new Fox("fox3", "becool", "green"));
    foxList.add(new Fox("fox4", "pallida", "yellow"));
    foxList.add(new Fox("fox5", "pallida", "red"));

    foxList
            .stream()
            .filter(fox -> fox.getColor().equals("green"))
            .forEach(fox -> System.out.print(fox.getName() + " "));
    System.out.println();
    foxList
            .stream()
            .filter(fox -> fox.getType().equals("pallida") && fox.getColor().equals("green"))
            .map(fox -> fox.getName())
            .forEach(System.out::print);
  }
}
