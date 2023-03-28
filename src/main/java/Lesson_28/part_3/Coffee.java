package Lesson_28.part_3;

public abstract class Coffee {

  String description = "Standard";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}

class Espresso extends Coffee {

  public Espresso() {
     this.description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}

class Americano extends Coffee {

  public Americano() {
    this.description = "Americano";
  }

  @Override
  public double cost() {
    return 2.10;
  }
}
