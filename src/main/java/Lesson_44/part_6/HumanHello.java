package Lesson_44.part_6;

import java.util.ArrayList;

public class HumanHello {

  public static void main(String[] args) {
    Student student = new Student();
    Human human = student;
    Object obj = human;

    ArrayList<Student> students = new ArrayList<>();
    ArrayList<? super Student> employees = new ArrayList<>();

    students.add(new Student());
    students.add(new Employee());

    employees.add(new Student());
    employees.add(new Employee());

//    ArrayList<Human> humans = students;
//    humans.add(new Human());

    print(students);
    print(employees);
  }

  /**
   * Означает, что все что в листе будет отправлено в метод println
   * (можно подавать в качестве аргумента класс Student и выше по
   * цепочке наследования)
   * @param list
   */
  public static void print(ArrayList<? super Student> list) {
    list.forEach(System.out::println);
  }

  /**
   * Означает, что все что в листе будет отправлено в метод println
   * (можно подавать в качестве аргумента класс Student и ниже по
   * цепочке наследования)
   * @param list
   */
  public static void print2(ArrayList<? extends Student> list) {
    list.forEach(System.out::println);
  }
}

class Human {
  String name = "Bob";
}

class Student extends Human {
  String name = "Bill";
  int id = 100;
}

class Employee extends Student {

}
