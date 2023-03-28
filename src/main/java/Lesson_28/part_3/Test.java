package Lesson_28.part_3;

public class Test {

  public static void main(String[] args) {

    Espresso espresso = new Espresso();
    Americano americano = new Americano();

    System.out.println(espresso.getDescription() + " /// " + espresso.cost());
    System.out.println(new Mocha(espresso).getDescription() + " /// " + new Mocha(espresso).cost());
    System.out.println(new Milk(espresso).getDescription() + " /// " + new Milk(espresso).cost());
  }
}
