package Lesson_39;

public class CommandOn implements Command {

  Lamp lamp;
  TV tv;
  Robot robot;

  public CommandOn(Lamp lamp, TV tv, Robot robot) {
    this.lamp = lamp;
    this.tv = tv;
    this.robot = robot;
  }

  public void setLamp(Lamp lamp) {
    this.lamp = lamp;
  }

  public void setTv(TV tv) {
    this.tv = tv;
  }

  public void setRobot(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void execute() {
    lamp.onLamp();
    robot.onRobot();
    robot.prepareCoffee();
    tv.onTV();
  }
}
