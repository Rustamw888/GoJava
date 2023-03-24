package Lesson_25.part_1;

public class Human<T> implements IteratorRustam {

  private Integer count = 0;
  private T[] data = null;

  public Human(T[] data) {
    this.data = data;
  }

  @Override
  public boolean hasNext() {
//    if (count < data.length) {
//      return true;
//    } else {
//      return false;
//    }
    return count < data.length;
  }

  @Override
  public T next() {
//    Object obj = data[count];
//    count++;
    return data[count++];
  }
}
