package Lesson_57.part_4;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

  @Id @GeneratedValue() @Column
  private int id;
  @Column
  private String name;
  @Column
  private int age;

  public Student() {
  }

  public Student(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
