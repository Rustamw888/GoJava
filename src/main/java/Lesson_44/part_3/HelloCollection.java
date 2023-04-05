package Lesson_44.part_3;

import java.util.*;

public class HelloCollection {

  public static void main1(String[] args) {
    Collection<String> c1 = new ArrayList<>();
    List<String> c2 = new ArrayList<>();
    List<String> c3 = new LinkedList<>();

    c1.add("Java");
    c1.add("JS");
    c1.add("Python");

    c2.add("Java");
    c2.add("JS");
    c2.add("Python");

    c3.add("Java");
    c3.add("JS");
    c3.add("Python");

    System.out.println(c1);
    c1.clear();
    System.out.println(c1);

    System.out.println(c2);
    c2.clear();
    System.out.println(c2);

    System.out.println(c3);
    c3.clear();
    System.out.println(c3);

  }

  public static void main(String[] args) {

    List<String> c2 = new ArrayList<>();

    c2.add("2");
    c2.add("3");
    c2.add("1");

    System.out.println(c2);
//    c2.sort(null);
//    System.out.println(c2);
    Collections.sort(c2);
    System.out.println(c2);
  }
}
