package sharpie;

import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpieList;

  public int countUsable(List<Sharpie> sharpieList) {
    int counter = 0;
    for (Sharpie sharpies : sharpieList) {
      if (sharpies.getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }

  public List<Sharpie> removeTrash(List<Sharpie> sharpieList) {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).getInkAmount() <= 0) {
        sharpieList.remove(i);
      }
    }
    return sharpieList;
  }

  public String toString() {
    return sharpieList.toString();
  }
}
