package Lesson_45.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterTest {

  public static void main(String[] args) {
    String text = "Java the best";

    Long countA = text.chars().filter(n -> n == 'a').count();
    System.out.println(countA);
    System.out.println("-------------------------------");
    List<Integer> numbers = List.of(10, 8, 1, 0, 12, 100, 20);
    // Arrays.asList() может принимать в себя null, в отличии от List.of()
    List<String> names = Arrays.asList("Bob", "Mark", "", "Alina", null);
    List<String> names2 =  List.of("Bob", "Mark", "", "Alina", null);


    for (Integer number : numbers) {
      if (number % 2 != 0) {
        System.out.println(number);
      }
    }

    System.out.println("-------------------------------");
    numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    System.out.println("-------------------------------");
    System.out.println(names.stream().filter(Objects::nonNull).filter(n -> !n.isEmpty()).count());
  }
}