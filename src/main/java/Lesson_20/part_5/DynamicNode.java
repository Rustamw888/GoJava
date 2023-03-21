package Lesson_20.part_5;

public class DynamicNode {

  public static void main(String[] args) {

    LinkNode linkNode = new LinkNode(100);
    linkNode.add(200);
    linkNode.add(500);
    linkNode.add(5000);
    linkNode.print();
    System.out.println("/////////////////////");
    linkNode.add(700, 2);
    linkNode.print();
    System.out.println();
    linkNode.print(2);
  }

}
