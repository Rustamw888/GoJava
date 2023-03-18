package Lesson_18.part_6_7;

public class TestClass {

  public static void main1(String[] args) {
    System.out.println(args.length);
    System.out.println("Hello " + args[0]);
    System.out.println("Hello " + args[1]);
  }

  public static void main(String[] args) {
    int number = 0;
    for (int i = 0; i < args[0].length(); i++) {
      char symbol = args[0].charAt(i);
      number = (symbol - '0') + number * 10;
      System.out.println(number);
    }
  }
}
