package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    /*
    You have the list of Dominoes
    Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    eg: [2, 4], [4, 3], [3, 5] ...
    */
    System.out.println(dominoes);
    System.out.println(sortDominoes(dominoes));
  }

  public static List<Domino> sortDominoes(List<Domino> orderedList) {
    for (int i = 0; i < orderedList.size(); i++) {
      for (int j = 1; j < orderedList.size(); j++) {
        if (orderedList.get(i).getValues()[1] == orderedList.get(j).getValues()[0]) {
          orderedList.add(i + 1, orderedList.get(j));
          orderedList.remove(j + 1);
          System.out.println(orderedList);
        }
      }
    }
    return orderedList;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
