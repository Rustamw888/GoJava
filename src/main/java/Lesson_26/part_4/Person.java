package Lesson_26.part_4;

import java.io.Serializable;

public class Person {

  private String userFirstName;
  private String userLastName;

  public Person() {
  }

  public Person(String userFirstName, String userLastName) {
    this.userFirstName = userFirstName;
    this.userLastName = userLastName;
  }

  public String getUserFirstName() {
    return userFirstName;
  }

  public void setUserFirstName(String userFirstName) {
    this.userFirstName = userFirstName;
  }

  public String getUserLastName() {
    return userLastName;
  }

  public void setUserLastName(String userLastName) {
    this.userLastName = userLastName;
  }
}
