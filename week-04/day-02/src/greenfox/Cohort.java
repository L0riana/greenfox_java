package greenfox;

import java.util.ArrayList;

public class Cohort extends Student {
  private String name;
  ArrayList<String> students = new ArrayList<String>();
  ArrayList<String> mentors = new ArrayList<String>();

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public Cohort(String name) {
    this.name = name;
    students.isEmpty();
    mentors.isEmpty();
  }

  public void addStudent(Student student) {
    students.add(name);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(name);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
