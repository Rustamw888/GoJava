package Lesson_20.part_5;

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

  public void setValue(int value) {
    this.value = value;
  }

  public void setNext(Node1 next) {
    this.next = next;
  }
}

class LinkNode {
  private Node1 head;
  private Node1 tail;

  public LinkNode(int data) {
    this.head = new Node1(data, null);
    this.tail = head;
  }

  public void add(int data) {
    Node1 temp = new Node1(data, null);
    tail.setNext(temp);
    tail = tail.getNext();
  }

  public void print() {
    Node1 ref = head;
    while (ref != null) {
      System.out.printf("%d ", ref.getValue());
      ref = ref.getNext();
    }
  }
}
