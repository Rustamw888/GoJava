package Lesson_44.part_5;

public class Polimorfism {

  public static void printName(Student student) {
    System.out.println(student.getName());
  }

  public static void printName(Employee employee) {
    System.out.println(employee.getName());
  }

  public static void main(String[] args) {
    printName(new Student("Bill"));
    printName(new Student("Mary"));
    printName(new Employee("Bob"));
  }
}

class Student extends Human {
  public Student(String name) {
    super.setName(name);
  }

}

class Employee extends Human {
  public Employee(String name) {
    super.setName(name);
  }

}

abstract class Human {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}