package Lesson_31_34.game.view;

import Lesson_31_34.game.control.ControllerGame;
import Lesson_31_34.game.models.Field;
import Lesson_31_34.game.models.Player;

public class Main {

  public static void main(String[] args) {
    Field field = new Field(3);
    Player player1 = new Player("Mark", "0");
    Player player2 = new Player("Rustam", "1");
    ControllerGame controllerGame = new ControllerGame(field, player1, player2);
    View view = new View(field);
    view.showField();
    int x, y;

    while (!controllerGame.endGame()) {
      x = controllerGame.inputCoordinat("x");
      y = controllerGame.inputCoordinat("y");
      controllerGame.movePlayer(x, y, player1);
      view.showField();
      if(controllerGame.getWinnerPlayer(player1) || controllerGame.endGame()) {
        break;
      }

      x = controllerGame.inputCoordinat("x");
      y = controllerGame.inputCoordinat("y");
      controllerGame.movePlayer(x, y, player2);
      view.showField();
      if(controllerGame.getWinnerPlayer(player2) || controllerGame.endGame()) {
        break;
      }
    }
    System.out.printf("Thw winner is: %s", controllerGame.getNameWinnerPlayer());
  }
}
