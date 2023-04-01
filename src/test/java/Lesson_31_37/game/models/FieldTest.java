package Lesson_31_37.game.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FieldTest {

  @Test
  void setStateField() {
    Field field = new Field(3);
    String[][] state = field.getStateField();
    String checkedValue = " ";
    String realValue = state[0][0];

    assertEquals(checkedValue, realValue);
  }

  @Test
  void getCellField() {
    Field field = new Field(3);
    String[][] state = field.getStateField();
    String checkedValue = " ";
    field.setCellField(0, 0, checkedValue);
    String realValue = state[0][0];

    assertEquals(checkedValue, realValue);
  }

  @Test
  void getStateField() {
  }

  @Test
  void getSIZE_FIELD() {
  }

  @Test
  void getDEFAULT_SYMBOL() {
  }

  @Test
  void getMIN_NUMBER() {
  }

  @Test
  void getMAX_NUMBER() {
  }
}