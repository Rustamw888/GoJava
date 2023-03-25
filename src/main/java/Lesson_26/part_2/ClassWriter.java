package Lesson_26.part_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassWriter {

  public static void main(String[] args) {

    People David = new People("David", 123456);
    People Bob = new People("Bob", 234567);
    People Elena = new People("Elena", 3456789);
    People[] array = {David, Bob, Elena};

    try(ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("src/main/java/lesson_26/part_1/people2"))
    ) {
      oos.writeObject(array);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
