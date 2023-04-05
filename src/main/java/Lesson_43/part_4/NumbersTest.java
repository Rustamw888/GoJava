package Lesson_43.part_4;

import java.util.ArrayList;
import java.util.List;

public class NumbersTest {

  public static void main(String[] args) {

    Number a = 1;
    System.out.println(a.doubleValue() + 1);
    a = 1.1;
    System.out.println(a.intValue() + 1.2);

    List<Number> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(3.954);
    list1.add(1000000000);

    System.out.println(list1);
  }
}
