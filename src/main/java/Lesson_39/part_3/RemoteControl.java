package Lesson_39.part_3;

public class RemoteControl {

  private CommandFan[] commandFan;

  private class NoCommand implements CommandFan {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
  }

  public RemoteControl(int countSlot) {
    CommandFan noCommand = new NoCommand();
    this.commandFan = new CommandFan[countSlot];
    for (int i = 0; i < countSlot; i++) {
      this.commandFan[i] = noCommand;
    }
  }

  public void setCommandFan(int slot, CommandFan command) {
    this.commandFan[slot] = command;
  }

  public void buttonOnPush(int slot) {
    commandFan[slot].execute();
  }

  public void buttonOffPush(int slot) {
    commandFan[slot].undo();
  }

  public static void main(String[] args) {

    SimplyFan fan1 = new SimplyFan();
    HighSpeedCommand highSpeedCommand = new HighSpeedCommand(fan1);
    OffSpeedCommand offSpeedCommand = new OffSpeedCommand(fan1);
    RemoteControl remoteControl = new RemoteControl(2);
    remoteControl.setCommandFan(0, highSpeedCommand);
    remoteControl.setCommandFan(1, offSpeedCommand);

    System.out.println(fan1.getSpeed());

    remoteControl.buttonOnPush(0);
    System.out.println(fan1.getSpeed());
    remoteControl.buttonOnPush(1);
    remoteControl.buttonOnPush(1);
    System.out.println(fan1.getSpeed());

    remoteControl.buttonOffPush(0);
    System.out.println(fan1.getSpeed());
    remoteControl.buttonOffPush(1);
    System.out.println(fan1.getSpeed());
  }
}
