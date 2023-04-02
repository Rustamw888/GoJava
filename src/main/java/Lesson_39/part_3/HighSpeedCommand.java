package Lesson_39.part_3;

public class HighSpeedCommand implements CommandFan {

  SimplyFan simplyFan;
  private int prewSpeed;

  public HighSpeedCommand(SimplyFan simplyFan) {
    this.simplyFan = simplyFan;
  }


  @Override
  public void execute() {
    prewSpeed = simplyFan.getSpeed();
    simplyFan.high();
  }

  @Override
  public void undo() {
    if (prewSpeed == simplyFan.HIGH) {
      simplyFan.high();
    } else if (prewSpeed == simplyFan.MEDIUM) {
      simplyFan.medium();
    } else if (prewSpeed == simplyFan.LOW) {
      simplyFan.low();
    } else if (prewSpeed == simplyFan.OFF) {
      simplyFan.off();
    }
  }
}
