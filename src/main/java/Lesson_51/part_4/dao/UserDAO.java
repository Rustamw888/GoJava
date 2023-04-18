package Lesson_51.part_4.dao;

import Lesson_51.part_4.pojo.Users;

import java.util.List;

public interface UserDAO {

  void add(Users user);
  List<Users> getAll();
  Users getUserById(int id);
  void remove(Users user);
}
