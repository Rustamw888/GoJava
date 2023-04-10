package Lesson_49.part_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

  public static void main(String[] args) {
    Properties properties = new Properties();
    properties.setProperty("Dima1", "Zalupovec");
    properties.setProperty("Dima2", "Nitakusik");

    FileOutputStream fos = null;

    try {
      fos = new FileOutputStream("src/main/java/Lesson_49/part_2/file.property");
      properties.store(fos, "MyComment");
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fos.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    FileInputStream fis = null;

    try {
      fis = new FileInputStream("src/main/java/Lesson_49/part_2/file.property");
      properties.load(fis);
      System.out.println(properties.getProperty("Dima1"));
      System.out.println(properties.getProperty("Dima2"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fis.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
