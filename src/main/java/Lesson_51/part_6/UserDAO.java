package Lesson_51.part_6;

import java.util.List;

public interface UserDAO {

  void addUser(Users user);
  List<Users> getAllUsers();
  Users getUserById(int id);
  void removeUserById(int id);
}
