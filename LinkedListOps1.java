import java.util.*;

public class LinkedListOps1 {
  public static void main(String[] args) {
    LinkedList<Student> studentList = new LinkedList<Student>();
    Student s1 = new Student("Sujit",1);
    Student s2 = new Student("Siddharth",2);
    Student s3 = new Student("Karanpreet",3);
    Student s4 = new Student("Hari",5);
    Student s5 = new Student("Tricha",4);

    studentList.add(s1);
    studentList.add(s2);
    studentList.add(s3);
    studentList.add(s4);

    studentList.remove(3);
    System.out.println("s1 contained?"+ studentList.contains(s1));
    System.out.println("s5 contained?"+ studentList.contains(s5));
    printStudentList(studentList);

  }

  public static void printStudentList(LinkedList<Student> students) {
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