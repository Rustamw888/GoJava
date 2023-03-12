package Lesson_12;

public class Multiply {

  public static Matrix multiply(Matrix p, Matrix q) throws Exception {
    int v = p.getVerticalSize();
    int h = q.getHorizontalSize();
    int temp = p.getHorizontalSize();

    if (temp != q.getVerticalSize()) {
      System.out.println("Умножение невозможно");
    }
    Matrix result = new Matrix(v, h);

    for (int i = 0; i < v; i++) {
      for (int j = 0; j < h; j++) {
        int value = 0;
        for (int k = 0; k < temp; k++) {
          value += p.getElement(i, k) * q.getElement(k, j);
        }
        result.setElement(i, j, value);
      }
    }
    return result;
  }
}
