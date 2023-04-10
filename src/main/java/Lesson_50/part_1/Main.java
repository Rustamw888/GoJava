package Lesson_50.part_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

  public static void main1(String[] args) {
    Consumer<Integer> consumer = data -> System.out.println(data);

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    for (Integer integer : list) {
      System.out.println("Hello");
    }

    list.forEach(data -> System.out.println(data));
  }

  public static void main2(String[] args) {
    Consumer<Integer> consumer = data -> {
      System.out.printf("%s ", data);
      System.out.println("Hello");
    };

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//    for (Integer integer : list) {
//      System.out.println("Hello");
//    }

    list.forEach(consumer);
  }

  public static void main3(String[] args) {
    Consumer<Integer> consumer = data -> {
      System.out.printf("%s ", data);
      System.out.println("Hello");
    };

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    for (Integer integer : list) {
      consumer.accept(integer);
    }

  }

  public static void main(String[] args) {

    Consumer<Integer> consumer1 = data -> {
      System.out.printf("%s ", data);
    };
    Consumer<Integer> consumer2 = data -> {
      System.out.println("Hello");
    };

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//    for (Integer integer : list) {
//      consumer1.andThen(consumer2).accept(integer);
//    }

//    for (Integer integer : list) {
//      consumer1.andThen(consumer2);
//    }

    list.forEach(consumer1.andThen(consumer2));

  }
}
