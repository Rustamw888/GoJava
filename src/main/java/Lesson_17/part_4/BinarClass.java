package Lesson_17.part_4;

public class BinarClass {

  public static void main(String[] args) {
    int a = 50;
    int b = 1;

    System.out.println(fBin(a, b));
    System.out.println(Integer.toBinaryString(a));
    System.out.println(Integer.toBinaryString(fBin(a, b)));
  }

  public static int fBin(int value, int binIndex) {
    return value ^ 1 << (binIndex - 1);
  }





}
