package Lesson_49.part_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

  public static void main(String[] args) {


    HumanInterface student = new Student();
    HumanInterface employee = new Employee();
    System.out.println(student.getClass().getName());
    HumanInterface h = null;

    Properties properties = new Properties();
    properties.setProperty("Key1", student.getClass().getName());
    properties.setProperty("Key2", employee.getClass().getName());

    FileOutputStream fos = null;

    try {
      fos = new FileOutputStream("src/main/java/Lesson_49/part_3/file.property");
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
      fis = new FileInputStream("src/main/java/Lesson_49/part_3/file.property");
      properties.load(fis);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fis.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    try {
      h = (HumanInterface) Class.forName(properties.getProperty("Key2")).newInstance();
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }

    h.printName();
//    employee.printName();
  }
}

class Employee extends Human {
  public Employee() {
    super("Bob");
  }
}

class Student extends Human {
  public Student() {
    super("Anna");
  }
}