package Lesson_50.part_3;

import static Lesson_50.part_3.StaticImport.*;

public class TestStatic {

//  public static void main(String[] args) {
//    StaticImport staticImport = new StaticImport();
//    String id = "0";
//
//    System.out.println(staticImport.id);
//    System.out.println(id);
//    System.out.println(StaticImport.getName());
//  }

  public static void main(String[] args) {
    StaticImport staticImport = new StaticImport();
    String id = "0";

    System.out.println(staticImport.id);
    System.out.println(id);
    System.out.println(getName());
    print();
  }

  public static void print() {
    System.out.println(id);
  }
}
