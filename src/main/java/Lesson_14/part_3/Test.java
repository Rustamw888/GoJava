package Lesson_14.part_3;

public class Test {

  public static void main1(String[] args) {
    f(5, "head");
  }

  public static void f(int x, String str) {
    if (x < 2) {
      System.out.println(x);
    } else {
      a(str);
      f(x - 1, str);
      b(str);
    }
  }

  public static void a(String str) {
    System.out.println("<" + str + ">");
  }

  public static void b(String str) {
    System.out.println("</" + str + ">");
  }

  public static void main(String[] args) {
    f(5);
  }

  public static void f(int x) {
    if (x < 2) {
      System.out.println(x);
    } else {
      a(x);
      f(x - 1);
      b(x);
    }
  }

  public static int a(int x) {
    System.out.println("<" + x + ">");
    return 0;
  }

  public static int b(int x) {
    System.out.println("</" + x + ">");
    return 0;
  }

}
