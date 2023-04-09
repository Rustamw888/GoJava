package Lesson_49.part_1;

public class Main {

  public static void main(String[] args) {
    Radio radio = new Radio();
    Player player = new Player();

    RadioPlayer radioPlayer = new RadioPlayer(radio, player);

    radioPlayer.playRadio();
    radioPlayer.offRadioPlayer();
  }
}

class Radio {
  void onRadio() {
    System.out.println("ON RADIO");
  }
  void offRadio() {
    System.out.println("OFF RADIO");
  }
}

class Player {
  void onPlayer() {
    System.out.println("ON Player");
  }
  void offPlayer() {
    System.out.println("OFF Player");
  }
  void searchContent() {
    System.out.println("search......");
  }
  void playContent() {
    System.out.println("play");
  }
}

class RadioPlayer {
  private Radio radio;
  private Player player;

  public RadioPlayer(Radio radio, Player player) {
    this.radio = radio;
    this.player = player;
  }

  public void playRadio() {
    radio.onRadio();
    player.onPlayer();
    player.searchContent();
    player.playContent();
  }

  public void offRadioPlayer() {
    player.offPlayer();
    radio.offRadio();
  }

}