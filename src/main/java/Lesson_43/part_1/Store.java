package Lesson_43.part_1;

public class Store implements Cloneable {

  int id = 1;
  String name = "SHOP_1";
  MyState state = new MyState();

  @Override
  protected Store clone() throws CloneNotSupportedException {
    return (Store)super.clone();
  }
}

class MyState implements Cloneable {
  int size = 100;

  @Override
  protected MyState clone() throws CloneNotSupportedException {
    return (MyState)super.clone();
  }
}
