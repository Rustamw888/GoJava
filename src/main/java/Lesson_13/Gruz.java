package Lesson_13;

public class Gruz implements Box {

  private double KM;
  private double KG;

  @Override
  public double getKM() {
    return KM;
  }

  @Override
  public double getKG() {
    return KG;
  }

  public Gruz(double KM, double KG) {
    this.KM = KM;
    this.KG = KG;
  }

  public Gruz() {
  }
}
