package Lesson_13;

public class Program2 {

  public static void main(String[] args) {
    Gruz gruz1 = new Gruz(20, 100);
    Gruz gruz2 = new Gruz(200, 200);

    CalcCost calc = new CalcCost(1, 0.2);
    System.out.println(calc.calcCost(gruz1));
    System.out.println(calc.calcCost(gruz2));
  }
}
