package Lesson_26.part_2;

import java.io.Serializable;

public class People implements Serializable {

  private transient String userName;
  private int phoneUser;

  public People() {
  }

  public People(String userName, int phoneUser) {
    this.userName = userName;
    this.phoneUser = phoneUser;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getPhoneUser() {
    return phoneUser;
  }

  public void setPhoneUser(int phoneUser) {
    this.phoneUser = phoneUser;
  }
}
