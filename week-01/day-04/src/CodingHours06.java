public class CodingHours06 {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    int averageCodingHoursDaily = 6;
    // The semester is 17 weeks long
    int semesterLength = 17;
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int hoursSpentWithCodingPerWeek = averageCodingHoursDaily * 5;
    int hoursSpentWithCodingPerSemester = hoursSpentWithCodingPerWeek * semesterLength;
    System.out.println("Hours expected to be spent with coding in a semester by an attendee:\n" + hoursSpentWithCodingPerSemester);
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int workHoursWeekly = 52;
    int CodingHoursPerSemesterPercent = 100 * hoursSpentWithCodingPerWeek / workHoursWeekly;
    System.out.println("\nPercentage of the coding hours if the average number of working hours is 52 weekly:\n" + CodingHoursPerSemesterPercent + "%");
  }
}
