package Lesson_25.part_4;

public class PerimeterRunner {

  public double getPerimeter(Shape shape) {
    double total = 0;
    Point prevPoint = shape.getLastPoint();
    for (Point point : shape.getPoints()) {
      double distance = distancePoint(point, prevPoint);
      total += distance;
      prevPoint = point;
    }
    return total;
  }

  public double distancePoint(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2)
        + Math.pow((p2.getY() - p1.getY()), 2));
  }

}
