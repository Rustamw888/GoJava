package Lesson_14.part_2;

public class Recursion {

  public static void main(String[] args) {
    recursion2(1);
  }

  public static void recursion1(int x) {
    System.out.print(x + ", ");
    if (x < 30) {
      recursion1(x * 3);
    }
  }

  public static void recursion2(int x) {
    if (x < 30) {
      recursion2(x * 3);
    }
    System.out.print(x + ", ");
  }

}
