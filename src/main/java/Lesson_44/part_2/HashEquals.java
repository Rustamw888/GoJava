package Lesson_44.part_2;

import java.util.Objects;

public class HashEquals {

  public static void main(String[] args) {
    Student a = new Student(1, "Bob");
    Student b = new Student(1, "Bob");
    Employee e = new Employee(1, "Bob");
    System.out.println(a.equals(b));
    System.out.println(b.equals(a));
    System.out.println(a.equals(e));

    System.out.println("--------------");
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(e.hashCode());
  }
}

class Student {
  int id;
  String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return id == student.id && name.equals(student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}

class Employee {
  int id;
  String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return id == employee.id && name.equals(employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}


