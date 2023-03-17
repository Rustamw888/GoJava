package Lesson_16;

public class ByteSdvig {

  public static void main1(String[] args) {
    int x = 0b11001010;
    int y = x >>> 2;
    int z = x << 3;

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(y));
    System.out.println(Integer.toBinaryString(z));
  }

  public static void main(String[] args) {
    int x = 62;

    boolean answer = Integer.bitCount(x) == 1 ? true: false;
    System.out.println(answer);
  }
}
