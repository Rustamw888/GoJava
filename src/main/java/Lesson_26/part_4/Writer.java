package Lesson_26.part_4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Writer {

  public static void main(String[] args) {

    User Dima = new User("Дмитрий", "Zалуповец", 1234, 3231654.2);

//    Dima.setUserFirstName("Дмитрий");
//    Dima.setUserLastName("Zалуповец");
//    Dima.setUserId(1234);
//    Dima.setUserPhone(3231654.2);

    try (ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("src/main/java/Lesson_26/part_4/data"))) {
    oos.writeObject(Dima);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
