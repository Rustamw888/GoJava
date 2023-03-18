package Lesson_18.part_4;

public class Main {

  public static void main(String[] args) {
    RobotCreator creator = new RobotCreator();
    creator.setRobot(new CarRobot());
    creator.drive();
    creator.setRobot(new BusRobot());
    creator.drive();
  }
}
