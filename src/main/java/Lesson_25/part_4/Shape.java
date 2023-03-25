package Lesson_25.part_4;

import java.util.ArrayList;

public class Shape {

  private ArrayList<Point> points;

  public Shape() {
    this.points = new ArrayList<>();
  }

  public void addPoint(Point p) {
    points.add(p);
  }

  public Point getLastPoint() {
    return points.get(points.size() - 1);
  }

  public ArrayList<Point> getPoints() {
    return points;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Point point : points) {
      stringBuilder.append(point.toString() + "\n");
    }
    return stringBuilder.toString();
  }
}
