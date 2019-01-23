package sharpie;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Sharpie> sharpieList = new ArrayList<>();
    SharpieSet usableSharpies = new SharpieSet();
    Sharpie marker1 = new Sharpie("black", 2, 11);
    Sharpie marker2 = new Sharpie("blue", 1, 4);

    sharpieList.add(marker1);
    sharpieList.add(marker2);

    System.out.println(marker1.toString());

    marker1.use();
    marker1.use();
    marker2.use();

    System.out.println(sharpieList.size());
    System.out.println(usableSharpies.countUsable(sharpieList));
    usableSharpies.removeTrash(sharpieList);
    System.out.println(marker1.toString());
    System.out.println(marker2.toString());
    System.out.println(usableSharpies.countUsable(sharpieList));
  }
}
