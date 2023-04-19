package Lesson_53.part_2;

import java.util.List;

public interface UserDAO extends CrudDAO<Users> {

  List<Users> getAll();
}
