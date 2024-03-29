package Lesson_53.part_2;

import java.util.Objects;

public class Users {

  private int id;
  private String name;
  private int age;
  private String email;

  public Users() {
  }

  public Users(int id, String name, int age, String email) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Users users = (Users) o;
    return id == users.id && age == users.age && name.equals(users.name) && email.equals(users.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, email);
  }

  @Override
  public String toString() {
    return "Users{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", email='" + email + '\'' +
        '}';
  }
}
