package Lesson_21.part_1;

public class Program {

  public static void main(String[] args) {

    PizzaStore store = new PizzaStore();
    Pizza pizza1 = store.createPizza("cheese");
    Pizza pizza2 = store.createPizza("pepperoni");
    Pizza pizza3 = store.createPizza("vegan");
    pizza1.printInfo();
    pizza2.printInfo();
  }

}

interface Pizza {
  void printInfo();
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

class CheesePizza implements Pizza {
  private String name = "CheesePizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }
}

class PepperoniPizza implements Pizza {
  private String name = "PepperoniPizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }
}
