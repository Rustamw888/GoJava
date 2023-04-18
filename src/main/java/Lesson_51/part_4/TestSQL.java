package Lesson_51.part_4;

import Lesson_51.part_4.pojo.Users;

public class TestSQL {

  public static void main(String[] args) {
    Users user = new UserServiceMySQL().getUserById(2);
    System.out.println("/////////////////////");
    System.out.println(user.toString());
  }
}
