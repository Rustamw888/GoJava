package Lesson_16;

public class BinaryClass {

  public static void main(String[] args) {
    int x1 = 4;
    int y1 = 2;
    System.out.println(x1);
    System.out.println(y1);
    System.out.println(Integer.toBinaryString(x1));
    System.out.println(Integer.toBinaryString(y1));

    System.out.println("//////////////");

    int x2 = 0b100;
    int y2 = 0b10;
    System.out.println(x2);
    System.out.println(y2);
    System.out.println(Integer.toBinaryString(x2));
    System.out.println(Integer.toBinaryString(y2));

    System.out.println("//////////////");

    int x3 = 0b100;
    int y3 = 0b10;
    // 011
    // 01
    System.out.println(~x3);
    System.out.println(~y3);
    System.out.println(Integer.toBinaryString(~x2));
    System.out.println(Integer.toBinaryString(~y2));

    System.out.println("//////////////");

    int x4 = 0b11000;
    int y4 = 0b10010;
    // 01010
    // 01010
    System.out.println(x3^y3);
    System.out.println(Integer.toBinaryString(x3^y3));
  }
}
