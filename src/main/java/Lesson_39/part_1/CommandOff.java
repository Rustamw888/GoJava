package Lesson_39.part_1;

public class CommandOff implements Command {

  Lamp lamp;
  TV tv;
  Robot robot;

  public CommandOff(Lamp lamp, TV tv) {
    this.lamp = lamp;
    this.tv = tv;
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
    lamp.offLamp();
    tv.offTV();
  }
}
