package Lesson_20.part_3_4;

public class DynamicNode {

  public static void main(String[] args) {
    Node1 node0 = new Node1(1, null);
    System.out.println("This is node0");
    System.out.println(node0.getValue());
    System.out.println(node0.getNext());
    System.out.println();

    Node1 node1 = new Node1(2, new Node1(1, null));
    System.out.println("This is node1");
    System.out.println(node1.getValue());
    System.out.println(node1.getNext());
    System.out.println(node1.getNext().getValue());
    System.out.println(node1.getNext().getNext());
    System.out.println();

    Node1 node2 = new Node1(11, node1.getNext());
    System.out.println("This is node2");
    System.out.println(node2.getValue());
    System.out.println(node2.getNext());
    System.out.println(node2.getNext().getValue());
    System.out.println(node2.getNext().getNext());
    System.out.println();
  }

}
