package teachersandstudents;

public class Teacher {

  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public void answer() {
  }

  public void teach(Student student) {
    student.learn();
  }
}
