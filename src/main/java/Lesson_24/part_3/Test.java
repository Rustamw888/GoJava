package Lesson_24.part_3;

public class Test {

  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();
    WriteData writeData = new WriteData("src/main/java/Lesson_24/part_3/data.txt");
    writeData.writer(person1.toString());
    writeData.writer(person2.toString());
  }

}
