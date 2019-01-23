import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Expected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girlsToMatch, ArrayList<String> boysToMatch) {
    ArrayList<String> newList = new ArrayList<>();
    for (int i = 0; i < girlsToMatch.size(); i++) {
      newList.add("\"" + girlsToMatch.get(i) + "\", " + "\"" + boysToMatch.get(i) + "\"");
    }
    return newList;
  }
}
