package Lesson_28.part_3;

public abstract class DecorCoffee extends Coffee {

//  public abstract String getDescription();
}

class Milk extends DecorCoffee {

  Coffee coffee;

  public Milk(Coffee coffee) {
    this.coffee = coffee;
  }

  public String getDescription() {
    return coffee.getDescription() + " Milk";
  }

  @Override
  public double cost() {
    return coffee.cost() + 0.2;
  }
}

class Mocha extends DecorCoffee {

  Coffee coffee;

  public Mocha(Coffee coffee) {
    this.coffee = coffee;
  }

  public String getDescription() {
    return coffee.getDescription() + " Mocha";
  }

  @Override
  public double cost() {
    return coffee.cost() + 0.3;
  }
}
