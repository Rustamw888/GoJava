package Lesson_20.part_1;

public enum Shape {

  RECTANGLE, TRIANGLE, CIRCLE, DISS;

  public double defineShape(double ...x) {
    switch (this) {
      case RECTANGLE -> {
        System.out.println("This is RECTANGLE");
        return x[0] * x[1];
      }
      case TRIANGLE -> {
        System.out.println("This is TRIANGLE");
        return x[0] * x[1] / 2;
      }
      case CIRCLE -> {
        System.out.println("This is CIRCLE");
        return Math.PI * Math.pow(x[0], 2) / 4;
      }
      default -> {
        System.out.println("This is NULL");
        return 0;
      }
    }
  }
}
