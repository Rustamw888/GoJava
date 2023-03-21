package Lesson_21.part_2;

public class Program {

  public static void main(String[] args) {

    PizzaStore store = new PizzaStore();
    Pizza pizza1 = store.createPizza("cheese");
    pizza1.cut();
    Pizza pizza2 = store.createPizza("pepperoni");
    pizza2.cut();
    Pizza pizza3 = store.createPizza("vegan");
    pizza1.printInfo();
    pizza2.printInfo();
  }

}

abstract class Pizza {
  abstract void printInfo();
  void cut() {
    System.out.println("Pizza does not cut");
  }
}

class PizzaStore {
  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new CheesePizza();
    } else if (type.equals("pepperoni")) {
      return new PepperoniPizza();
    } else {
      System.out.println("ERROR");
      return null;
    }
  }
}

class CheesePizza extends Pizza {
  private String name = "CheesePizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }

  @Override
  void cut() {
    System.out.println("Pizza does cut");
  }
}

class PepperoniPizza extends Pizza {
  private String name = "PepperoniPizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }
}
