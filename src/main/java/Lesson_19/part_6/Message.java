package Lesson_19.part_6;

public class Message<T> {

  private T value;

  public Message() {}

  public Message(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
