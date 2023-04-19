package Lesson_53.part_2;

import java.util.List;

public abstract class AbstractDAO <T> {
  public abstract void add(T t);
  public abstract List<T> getAll();
  public abstract T getById(int id);
  public abstract void remove(T t);
}
