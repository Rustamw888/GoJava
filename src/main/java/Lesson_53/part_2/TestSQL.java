package Lesson_53.part_2;

import java.util.List;

public class TestSQL {

  public static void main(String[] args) {
    Users user = new Users(7, "Martin", 100, "email@g.com");
//    new UserServiceMySQL().addUser(user);
//    new UserServiceMySQL().removeUserById(7);

    List<Users> usersList = new UserServiceMySQL().getAll();
    for (Users users : usersList) {
      System.out.println("users = " + users);
    }
  }
}
