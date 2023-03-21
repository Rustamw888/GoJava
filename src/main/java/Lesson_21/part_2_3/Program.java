package Lesson_21.part_2_3;

public class Program {

  public static void main(String[] args) {

    PizzaStore nYStore = new NYPizzaStore();
    PizzaStore cHStore = new CHPizzaStore();
    Pizza nyPizza = nYStore.orderPizza("cheese");
    Pizza chPizza = cHStore.orderPizza("pepperoni");

  }

}

abstract class Pizza {
  abstract void printInfo();
  void cut() {
    System.out.println("Pizza does not cut");
  }
}

abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    pizza.printInfo();
    pizza.cut();
    return pizza;
  }

  abstract Pizza createPizza(String type);
}

class NYPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYCheesePizza();
    } else if (type.equals("pepperoni")) {
      return new NYPepperoniPizza();
    } else {
      System.out.println("ERROR");
      return null;
    }
  }
}

class CHPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYCheesePizza();
    } else if (type.equals("pepperoni")) {
      return new NYPepperoniPizza();
    } else {
      System.out.println("ERROR");
      return null;
    }
  }
}

class NYCheesePizza extends Pizza {
  private String name = "NYCheesePizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }

  @Override
  void cut() {
    System.out.println("Pizza does cut");
  }
}

class NYPepperoniPizza extends Pizza {
  private String name = "NYPepperoniPizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }
}

class CHCheesePizza extends Pizza {
  private String name = "CHCheesePizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }

  @Override
  void cut() {
    System.out.println("Pizza does cut");
  }
}

class CHPepperoniPizza extends Pizza {
  private String name = "CHPepperoniPizza";
  @Override
  public void printInfo() {
    System.out.println(name);
  }
}
