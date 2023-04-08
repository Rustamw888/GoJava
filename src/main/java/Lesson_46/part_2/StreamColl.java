package Lesson_46.part_2;

import java.util.*;
import java.util.stream.Collectors;

public class StreamColl {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> eventNumber = new ArrayList<>();
    for (Integer i : numbers) {
      if (i % 2 == 0) {
        eventNumber.add(i);
      }
    }
    System.out.println(eventNumber);

//    List<Integer> eventNumber2 = new ArrayList<>();
    List<Integer> eventNumber2 = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println(eventNumber2);

    List<String> names = Arrays.asList("Bob", "Bill", "John");
    Set<String> upperCaseNames = new HashSet<>();

    for (String name : names) {
      upperCaseNames.add(name.toUpperCase());
    }
    System.out.println(upperCaseNames);

    Set<String> upperCaseNames2 = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
    System.out.println(upperCaseNames2);
  }
}
