package Lesson_39;

public class Button {

  Command command;

  public Button(Command command) {
    this.command = command;
  }

  void click() {
    command.execute();
  }
}
