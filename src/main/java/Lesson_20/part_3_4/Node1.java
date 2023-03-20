package Lesson_20.part_3_4;

public class Node1 {

  private int value;
  private Node1 next;

  public Node1() {}

  public Node1(int value, Node1 next) {
    this.value = value;
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public Node1 getNext() {
    return next;
  }
}
