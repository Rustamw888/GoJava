package Lesson_27.part_3;

import java.lang.reflect.InvocationTargetException;

public class Test {

  public static void main(String[] args) {

    Rabbit rabbit1;
    Rabbit rabbit2;

    try {
      Class cls = Class.forName(Rabbit.class.getName());
      rabbit1 = (Rabbit) cls.newInstance();

      System.out.println(rabbit1.getLastName());

      Class[] param = {int.class, String.class};
      rabbit2 = (Rabbit) cls.getConstructor(param).newInstance(1000, "Mark");
//      rabbit2 = (Rabbit) cls.getConstructor().newInstance();

      System.out.println(rabbit2.getLastName());
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
             InvocationTargetException | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }

  }
}
