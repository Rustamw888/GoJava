package Lesson_21.part_4;

public class MyTime {

  public static void main(String[] args) {
    long l1 = (60 * 60 * 24 * 365);
    long l2 = (60 * 60 * 24);
    long nano = System.nanoTime();
    long unix = System.currentTimeMillis() / 1000;
    System.out.println(unix / l1);
    System.out.println(nano);
  }

}
