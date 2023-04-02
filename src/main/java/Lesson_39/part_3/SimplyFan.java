package Lesson_39.part_3;

public class SimplyFan {

  public final int HIGH = 3;
  public final int MEDIUM = 2;
  public final int LOW = 1;
  public final int OFF = 0;
  private int speed;

  public SimplyFan() {
    this.speed = OFF;
  }

  public void high() {
    speed = HIGH;
  }

  public void medium() {
    speed = MEDIUM;
  }

  public void low() {
    speed = LOW;
  }

  public void off() {
    speed = OFF;
  }

  public int getSpeed() {
    return speed;
  }
}
