public class SecondsInADay13 {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    int hoursTotal = 23;
    int minsPerHour = 60;
    int secsPerMin = 60;

    int remSec = (secsPerMin - currentSeconds) + 60 * ((minsPerHour - currentMinutes) + 60 * (hoursTotal - currentHours));

    System.out.println(remSec);
  }
}
