package Lesson_51.part_6;

import java.util.List;

public abstract class AbstractDAO <T> {
  public abstract void add(T t);
  public abstract List<T> getAll();
  public abstract T getById(int id);
  public abstract void remove(T t);
}
