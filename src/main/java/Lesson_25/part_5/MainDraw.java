package Lesson_25.part_5;

import Lesson_25.part_4.Point;
import Lesson_25.part_4.Shape;

public class MainDraw {

  public static void main(String[] args) {
    Shape shape = new Shape();
    Point point1 = new Point(100, 100);
    Point point2 = new Point(400, 100);
    Point point3 = new Point(400, 400);
    Point point4 = new Point(100, 400);
    shape.addPoint(point1);
    shape.addPoint(point2);
    shape.addPoint(point3);
    shape.addPoint(point4);
    Drawing drawing = new Drawing("Rustam");
    drawing.drawShape(shape);
  }
}
