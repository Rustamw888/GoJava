package Lesson_13;

public class CalcCost {

  private int KM;
  private double KG;

  public CalcCost(int KM, double KG) {
    this.KM = KM;
    this.KG = KG;
  }

  public CalcCost() {
  }

  public double calcCost(Box box) {
    return KG + box.getKG() + KM + box.getKM();
  }
}
