package Lesson_20.part_3;

public class DynamicNode {

  public static void main(String[] args) {
    Node1 node0 = new Node1(1, null);
    System.out.println(node0.getValue());

    Node1 node1 = new Node1(2, new Node1(1, null));
    System.out.println(node1.getValue());

    Node1 node2 = new Node1(11, node1.getNext());
    System.out.println(node2.getValue());
  }

}
