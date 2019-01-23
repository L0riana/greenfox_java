import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.
    uniqueAddress();
    requestRatio();
  }

  private static void uniqueAddress() {
    String line;
    ArrayList<String> addressIPs = new ArrayList<>();
    try {
      FileReader fr = new FileReader("log.txt");
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        addressIPs.add(line.split("\\s+")[5]);
      }
      Set<String> uniqueIP = new HashSet<String>(addressIPs);
      for (String element : uniqueIP) {
        System.out.println(element);
      }
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }

  private static void requestRatio() {
    String line;
    ArrayList<String> requests = new ArrayList<>();
    int getNr = 0;
    int postNr = 0;
    try {
      FileReader fr = new FileReader("log.txt");
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        requests.add(line.split("\\s+")[6]);
        getNr = Collections.frequency(requests, "GET");
        postNr = Collections.frequency(requests, "POST");
      }
      System.out.println(requests.size());
      double requestRatio = (double)getNr / (double)postNr;
      System.out.println("Number of GETs: " + getNr);
      System.out.println("Number of POSs: " + postNr);
      System.out.println("GET/POST ratio: "+ requestRatio);
    } catch (IOException e) {
      System.out.println("File not found!");
    }
  }
}
