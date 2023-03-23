package Lesson_24.part_2;

public class BaseClass implements Person, Human {

  public static void main(String[] args) {

    BaseClass baseClass = new BaseClass();
    System.out.println(baseClass.getId());
  }

  @Override
  public int getId() {
    return Human.super.getId();
  }
}
