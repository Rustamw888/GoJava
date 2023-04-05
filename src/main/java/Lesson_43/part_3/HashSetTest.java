package Lesson_43.part_3;

import java.util.HashSet;

public class HashSetTest {

  public static void main(String[] args) {
    HashSet<String> s1 = new HashSet<>();
    s1.add("Java");
    s1.add("Python");
    s1.add("Ruby");
    s1.add("Groovy");
    s1.add("Python");
    System.out.println(s1);
  }
}
