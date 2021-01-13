import java.util.*;

public class ArrayListOps2 {
  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<Student>();
    studentList.add(new Student("Sujit", 1));
    studentList.add(new Student("Siddharth", 2));
    studentList.add(new Student("Karanpreet", 3));
    studentList.add(new Student("Hari", 5));
    studentList.add(new Student("Tricha", 4));


    printStudentList(studentList);

    studentList.remove(3);
    printStudentList(studentList);
    
  }

  public static void printStudentList(ArrayList<Student> students) {
    for(Student s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student {
  private final String name;
  private final int rollNumber;

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}
