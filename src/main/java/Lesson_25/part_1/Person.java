package Lesson_25.part_1;

import java.util.Iterator;

public class Person<T> implements Collections {

  @Override
  public Iterator getIterator() {
    return new PersonIterator();
  }

  private class PersonIterator implements Iterator {

    private int count = 0;

    @Override
    public boolean hasNext() {
      return count < data.length;
    }

    @Override
    public Object next() {
      return data[count++];
    }
  }

  private T[] data;

  public Person(T[] data) {
    this.data = data;
  }

}
