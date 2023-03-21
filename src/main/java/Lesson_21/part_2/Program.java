package Lesson_21.part_2;

public class Program {

  public static void main(String[] args) {

    PizzaStore store = new PizzaStore();
    Pizza pizza1 = store.createPizza("NY", "NYcheese");
    pizza1.cut();
    Pizza pizza2 = store.createPizza("CH", "CHpepperoni");
    pizza2.cut();
    Pizza pizza3 = store.createPizza("VG", "vegan");
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
  public Pizza createPizza(String style, String type) {
    if(style.equals("NY")) {
      if (type.equals("NYcheese")) {
        return new NYCheesePizza();
      } else if (type.equals("NYpepperoni")) {
        return new NYPepperoniPizza();
      } else {
        System.out.println("ERROR");
        return null;
      }
    } else if (style.equals("CH")) {
      if (type.equals("CHcheese")) {
        return new CHCheesePizza();
      } else if (type.equals("CHpepperoni")) {
        return new CHPepperoniPizza();
      } else {
        System.out.println("ERROR");
        return null;
      }
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
