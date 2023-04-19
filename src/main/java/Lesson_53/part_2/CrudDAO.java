package Lesson_53.part_2;

import java.util.List;

public interface CrudDAO<T> {

  void add(T t);
  List<T> getAll();
  T getById(int id);
  void removeById(int id);
}
