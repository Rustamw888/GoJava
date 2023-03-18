package Lesson_18.part_1;

public class Obertka {

  public static void main(String[] args) {
//    int x = 1;
//    int y = 2;
    Obj o = new Obj();
    System.out.println(o.x);
    System.out.println(o.y);
    swap(o);
    System.out.println(o.x);
    System.out.println(o.y);
  }

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void swap(Obj o) {
    int temp = o.x;
    o.x = o.y;
    o.y = temp;
  }

}

class Obj {
  int x = 1;
  int y = 2;
}

