package Lesson_18.part_4;

public class Main {

  public static void main(String[] args) {
    CarRobot carRobot = new CarRobot();
    carRobot.go();

    BusRobot busRobot = new BusRobot();
    busRobot.go();
    busRobot.walk();
  }
}
