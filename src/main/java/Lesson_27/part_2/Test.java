package Lesson_27.part_2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

  public static void main(String[] args) {

    Rabbit rabbit1 = new Rabbit();
    Rabbit rabbit2 = new Rabbit();

    Class cls = rabbit1.getClass();
    System.out.println(cls.getName());
    System.out.println("--------------------------------------");
    Field[] publicFields = cls.getFields();
    for (Field publicField : publicFields) {
      System.out.println(publicField);
    }
    System.out.println("--------------------------------------");
    Field[] decFields = cls.getDeclaredFields();
    for (Field decField : decFields) {
      System.out.println(decField);
    }
    System.out.println("--------------------------------------");
    Method[] methods = cls.getMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
    System.out.println("--------------------------------------");
    Method[] decMethods = cls.getDeclaredMethods();
    for (Method decMethod : decMethods) {
      System.out.println(decMethod);
    }
    System.out.println("--------------------------------------");
    try {
      Field field = cls.getDeclaredField("lastName");
      field.setAccessible(true);
      System.out.println(field.get(rabbit1));
    } catch (NoSuchFieldException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }

  }
}
