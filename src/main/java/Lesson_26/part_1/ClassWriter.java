package Lesson_26.part_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassWriter {

  public static void main(String[] args) {

    People David = new People("David", 123456);
    People Bob = new People("Bob", 234567);
    People Elena = new People("Elena", 3456789);

    File file;
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    try {
      file = new File("src/main/java/lesson_26/part_1/people2");
      if (!file.exists()) {
        file.createNewFile();
      }
      fos = new FileOutputStream(file);
      oos = new ObjectOutputStream(fos);
      oos.writeObject(David);
      oos.writeObject(Bob);
      oos.writeObject(Elena);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        oos.close();
        fos.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

}
