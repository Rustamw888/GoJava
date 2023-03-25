package Lesson_25.part_4;

public class Main {

  public static void main(String[] args) {

    Shape shape = new Shape();
    Point point1 = new Point(0, 3);
    Point point2 = new Point(3, 0);
    Point point3 = new Point(3, 4);
    shape.addPoint(point1);
    shape.addPoint(point2);
    shape.addPoint(point3);
//    System.out.println(shape.getLastPoint());
    System.out.println("/////");
    System.out.println(shape.toString());
    System.out.println(perimeter(point2, point1));
    System.out.println(perimeter(point3, point2));
    System.out.println(perimeter(point1, point3));

  }

  public static double perimeter(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2)
        + Math.pow((p2.getY() - p1.getY()), 2));
  }
}
