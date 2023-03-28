package Lesson_28.part_2;

public class DecoratorValue implements IPrint {

  IPrint textData;

  public DecoratorValue(IPrint textData) {
    this.textData = textData;
  }

  @Override
  public void print() {
    System.out.print("{");
    textData.print();
    System.out.print("}");
  }
}

class DecoratorValue1 implements IPrint {

  IPrint textData;

  public DecoratorValue1(IPrint textData) {
    this.textData = textData;
  }

  public void print() {
    System.out.print("[");
    textData.print();
    System.out.print("]");
  }
}

class DecoratorValue2 implements IPrint {

  IPrint textData;

  public DecoratorValue2(IPrint textData) {
    this.textData = textData;
  }

  public void print() {
    System.out.print("<");
    textData.print();
    System.out.print(">");
  }
}
