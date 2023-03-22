package Lesson_23.part_2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyMain2 {

  public static void main(String[] args) {

    Predicate<Integer> p1 = value -> value == 4;
    System.out.println(p1.test(4));

    Consumer<String> p2 = str -> System.out.println(str);
    p2.accept("Hello");

    Function<Integer, Double> p3 = value -> Double.valueOf(value);
    System.out.println(p3.apply(100));

    UnaryOperator<Double> p4 = value -> Math.pow(value, 2);
    System.out.println(p4.apply(4.0));
  }

}
