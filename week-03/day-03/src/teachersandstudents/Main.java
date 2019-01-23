package teachersandstudents;

public class Main {
  public static void main(String[] args) {

    Student tom = new Student("Tom");
    Teacher missPeacock = new Teacher("Miss Peacock");

    missPeacock.teach(tom);
    tom.learn();
    tom.question(missPeacock);
    missPeacock.answer();
  }
}
