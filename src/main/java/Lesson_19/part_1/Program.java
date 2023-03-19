package Lesson_19.part_1;

import java.util.Arrays;
import java.util.List;

public class Program {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

//    list.forEach((Integer number) -> System.out.println(number));
//    list.forEach((number) -> System.out.println(number));
    list.forEach(number -> System.out.println(number));

  }

}
