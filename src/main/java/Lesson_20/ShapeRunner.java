package Lesson_20;

import static Lesson_20.Shape.*;

public class ShapeRunner {

  public static void main(String[] args) {
    Shape shape1 = RECTANGLE;
    System.out.println(shape1.defineShape(2, 2));
    Shape shape2 = TRIANGLE;
    System.out.println(shape2.defineShape(2, 2));
    Shape shape3 = CIRCLE;
    System.out.println(shape3.defineShape(4));
    Shape shape4 = DISS;
    System.out.println(shape4.defineShape(2, 2));
  }

}
