package Lesson_31_37.game.models;

public class Field {

  private final int SIZE_FIELD;
  private String[][] stateField;
  private final String DEFAULT_SYMBOL = " ";
  private final int MIN_NUMBER;
  private final int MAX_NUMBER;

  public Field(int SIZE_FIELD) {
    this.SIZE_FIELD = SIZE_FIELD;
    this.MIN_NUMBER = 0;
    this.MAX_NUMBER = getSIZE_FIELD();
    stateField = new String[getSIZE_FIELD()][getSIZE_FIELD()];
    setStateField(DEFAULT_SYMBOL);
  }

  private boolean checkCoordinat(int coordinat) {
    if (coordinat >= getMIN_NUMBER() && coordinat <= getMAX_NUMBER()) {
      return true;
    } else {
      System.out.println("Проверьте координаты");
      return false;
    }
  }

  public void setStateField(String symbol) {
    for (int i = 0; i < getSIZE_FIELD(); i++) {
      for (int j = 0; j < getSIZE_FIELD(); j++) {
        setCellField(i, j, symbol);
      }
    }
  }

  public void setCellField(int i, int j, String symbol) {
    if (checkCoordinat(i) && checkCoordinat(j)) {
      this.stateField[i][j] = symbol;
    } else {
      System.out.println("Поле занято");
    }
  }

  public String getCellField(int i, int j) {
    if (checkCoordinat(i) && checkCoordinat(j)) {
      return stateField[i][j];
    }
    return null;
  }

  public String[][] getStateField() {
    return stateField;
  }

  public int getSIZE_FIELD() {
    return SIZE_FIELD;
  }

  public String getDEFAULT_SYMBOL() {
    return DEFAULT_SYMBOL;
  }

  public int getMIN_NUMBER() {
    return MIN_NUMBER;
  }

  public int getMAX_NUMBER() {
    return MAX_NUMBER;
  }
}
