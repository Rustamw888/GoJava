package Lesson_26.part_4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Reader {

  public static void main(String[] args) {

    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/Lesson_26/part_4/data"))) {

      User user1 = (User) ois.readObject();
      System.out.println(user1.getUserId());
      System.out.println(user1.getUserFirstName());
      System.out.println(user1.getUserLastName());
      System.out.println(user1.getUserPhone());
//      System.out.printf(user1.toString());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }


}
