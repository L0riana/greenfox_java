import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06_FindLetter {
  public static void main(String[] args) {
    //Write a Stream Expression to find the strings which starts with A and ends with I in the following array:

    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", 
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    //with method
    findLetters(cities);

    //with stream
    cities
            .stream()
            .filter(s -> s.startsWith("A") && s.endsWith("I"))
            .map(s -> s +" ")
            .forEach(System.out::print);
  }

  public static void findLetters(ArrayList<String> cities) {
    for (int i = 0; i < cities.size(); i++) {
      if(cities.get(i).startsWith("A") && cities.get(i).endsWith("I")){
        System.out.println(cities.get(i));
      }
    }
  }
}
