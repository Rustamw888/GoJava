package Lesson_25.part_4;

public class Main {

  public static void main(String[] args) {
    PerimeterRunner perimeterRunner = new PerimeterRunner();
    Shape shape = new Shape();
    Point point1 = new Point(0, 0);
    Point point2 = new Point(4, 0);
    Point point3 = new Point(4, 3);
    Point point4 = new Point(0, 3);
    shape.addPoint(point1);
    shape.addPoint(point2);
    shape.addPoint(point3);
    shape.addPoint(point4);
    System.out.println(perimeterRunner.distancePoint(point2, point1));
    System.out.println(perimeterRunner.distancePoint(point3, point2));
    System.out.println(perimeterRunner.distancePoint(point4, point3));
    System.out.println(perimeterRunner.distancePoint(point4, point1));
    System.out.println(perimeterRunner.getPerimeter(shape));
  }


}
