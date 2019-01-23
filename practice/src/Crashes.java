import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {
  public static void main(String[] args) {
    // The crash-incidents.csv file contains data of road crash-incidents.
    // (id; location; surface type; surface condition; light condition; weather condition; crash date; year)
    // Your task will be to count how many crash-incidents happened at good/bad
    // weather conditions.
    // Good weather conditions are CLOUDY and CLEAR.
    // Bad weather conditions are RAIN, FREEZING RAIN, SNOW, FOG and SEVERE CROSSWINDS.
    // So create the necessary method(s) that returns with the amount of crash-incidents.
    // And print the return value to the console:
    // The amount of crashes at good weather conditions: {amount}
    // The amount of crashes at bad weather conditions: {amount}
    Path pathCrashIncidents = Paths.get("crash-incidents.txt");
    System.out.println(weatherCount(pathCrashIncidents));
  }
  
  public static String weatherCount(Path pathCrashIncidents) {
    int countGood = 0;
    int countBad = 0;
    List<String> lines = null;
    try {
      lines = Files.readAllLines(pathCrashIncidents);
      for (String line : lines) {
        if (line.contains("CLOUDY") ||
                (line.contains("CLEAR"))) {
          countGood++;
        } else {
          countBad++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(lines.size());
    return countGood + ", " + countBad;
  }
}