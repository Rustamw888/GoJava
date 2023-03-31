package Lesson_31_34.game.view;

import Lesson_31_34.game.models.Field;

public class View {

  private Field field;

  public View(Field field) {
    this.field = field;
    System.out.println("Hello. This is a new game!!!");
    System.out.println("----------------------------");
  }

  public void showField() {
    for (int i = 0; i < field.getSIZE_FIELD(); i++) {
      for (int j = 0; j < field.getSIZE_FIELD(); j++) {
        if (j != 0) {
          System.out.print("|");
        }
        System.out.printf(" %s ", field.getCellField(i, j));
      }
      if (i != field.getSIZE_FIELD() - 1) {
        System.out.print("\n------------");
      }
      System.out.println();
    }
  }
}
