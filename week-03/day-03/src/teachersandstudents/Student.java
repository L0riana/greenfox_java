package teachersandstudents;

public class Student {

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public void learn() {
  }

  public void question(Teacher teacher) {
    teacher.answer();
  }
}
