package Lesson_28.part_1;

public class Client {

  public static void main(String[] args) {
    new TextData().print();
    System.out.println("\n------------------------");
    new DecoratorValue(new DecoratorValue1(new DecoratorValue2(new TextData()))).print();
  }
}
