package Lesson_39;

public class MainTest {

  public static void main(String[] args) {

    Lamp lamp1 = new Lamp("lamp1");
    TV tv = new TV();
    Robot robot = new Robot();

    Button button = new Button(new CommandOn(lamp1, tv, robot));
    button.click();
    System.out.println("---------------------------------------");
    button = new Button(new CommandOff(lamp1, tv));
    button.click();
  }
}

class Lamp {
  private String title;

  public Lamp(String title) {
    this.title = title;
  }

  void onLamp() {
    System.out.printf("%s ON\n", title);
  }

  void offLamp() {
    System.out.println("Lamp OFF");
  }
}

class TV {
  void onTV() {
    System.out.println("TV ON");
  }

  void onYouTube() {
    System.out.println("YouTube ON");
  }

  void offTV() {
    System.out.println("TV OFF");
  }
}

class Robot {
  void onRobot() {
    System.out.println("Robot ON");
  }

  void prepareCoffee() {
    System.out.println("Preparing Coffee");
  }
}
