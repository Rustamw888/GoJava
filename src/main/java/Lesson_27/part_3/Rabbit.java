package Lesson_27.part_3;

public class Rabbit {

  private String firstName = "Bob";
  private String lastName = "Marley";
  public int age = 10;

  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public int getAge() {
    return this.age;
  }

//  public Rabbit() {}
  public Rabbit(int age, String lastName) {
    this.age = age;
    this.lastName = lastName;
  }

}
