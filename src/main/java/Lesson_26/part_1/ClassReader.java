package Lesson_26.part_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassReader {

  public static void main(String[] args) {

    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {
      fis = new FileInputStream("src/main/java/lesson_26/part_1/people2");
      ois = new ObjectInputStream(fis);
      People p1 =(People) ois.readObject();
      People p2 =(People) ois.readObject();
      People p3 =(People) ois.readObject();
      System.out.printf("people name = %s; people number = %s\n", p1.getUserName(), p1.getPhoneUser());
      System.out.printf("people name = %s; people number = %s\n", p2.getUserName(), p2.getPhoneUser());
      System.out.printf("people name = %s; people number = %s\n", p3.getUserName(), p3.getPhoneUser());
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fis.close();
        ois.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
