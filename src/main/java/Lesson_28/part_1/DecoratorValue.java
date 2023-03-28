package Lesson_28.part_1;

public class DecoratorValue extends TextData {

  TextData textData;

  public DecoratorValue(TextData textData) {
    this.textData = textData;
  }

  @Override
  public void print() {
    System.out.print("{");
    textData.print();
    System.out.print("}");
  }
}

class DecoratorValue1 extends TextData {

  TextData textData;

  public DecoratorValue1(TextData textData) {
    this.textData = textData;
  }

  @Override
  public void print() {
    System.out.print("[");
    textData.print();
    System.out.print("]");
  }
}

class DecoratorValue2 extends TextData {

  TextData textData;

  public DecoratorValue2(TextData textData) {
    this.textData = textData;
  }

  @Override
  public void print() {
    System.out.print("<");
    textData.print();
    System.out.print(">");
  }
}
