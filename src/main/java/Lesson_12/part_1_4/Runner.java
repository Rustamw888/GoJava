package Lesson_12.part_1_4;

public class Runner {

  public static void main(String[] args) {
    Matrix p = new Matrix(3, 3);
    Matrix q = new Matrix(3, 3);

    p.setElement(0, 0, 1);
    p.setElement(0, 1, 1);
    p.setElement(0, 2, 1);

    p.setElement(1, 0, 1);
    p.setElement(1, 1, 1);
    p.setElement(1, 2, 1);

    p.setElement(2, 0, 1);
    p.setElement(2, 1, 1);
    p.setElement(2, 2, 1);

    q.setElement(0, 0, 1);
    q.setElement(0, 1, 1);
    q.setElement(0, 2, 1);

    q.setElement(1, 0, 1);
    q.setElement(1, 1, 1);
    q.setElement(1, 2, 1);

    q.setElement(2, 0, 1);
    q.setElement(2, 1, 1);
    q.setElement(2, 2, 1);

    try {
      Matrix result = Multiply.multiply(p, q);
      System.out.println("Result: " + result);
    } catch (Exception e) {
      System.err.println("ERROR");
    }

  }

}
