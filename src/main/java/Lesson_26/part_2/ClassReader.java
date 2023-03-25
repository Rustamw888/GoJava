package Lesson_26.part_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ClassReader {

  public static void main(String[] args) {

    try(ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("src/main/java/lesson_26/part_1/people2"))) {
      People[] p0 = (People[]) ois.readObject();
      People p1 = p0[0];
      People p2 = p0[1];
      People p3 = p0[2];
      System.out.printf("people name = %s; people number = %s\n", p1.getUserName(), p1.getPhoneUser());
      System.out.printf("people name = %s; people number = %s\n", p2.getUserName(), p2.getPhoneUser());
      System.out.printf("people name = %s; people number = %s\n", p3.getUserName(), p3.getPhoneUser());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
