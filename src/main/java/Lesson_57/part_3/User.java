package Lesson_57.part_3;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("USER_TYPE")
public class User extends Human {

  private String nickName;

  public User() {
  }

  public User(String name, int age, String nickName) {
    super(name, age);
    this.nickName = nickName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "User{" +
        "nickName='" + nickName + '\'' +
        '}';
  }
}
