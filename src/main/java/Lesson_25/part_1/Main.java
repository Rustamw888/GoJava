package Lesson_25.part_1;

import java.util.Iterator;

public class Main {

  public static void main1(String[] args) {

    String[] str = {"Java", "Python", "JavaScript", "Go"};
    Integer[] x = {1, 2, 3, 4, 5, 6, 7, 8};

    Human<String> human1 = new Human(str);
//    Human human1 = new Human(x);

    while (human1.hasNext()) {
      System.out.println(human1.next());
    }
  }

  public static void main2(String[] args) {

    String[] str = {"Java", "Python", "JavaScript", "Go"};
    Integer[] x = {1, 2, 3, 4, 5, 6, 7, 8};

    Person<String> person = new Person(str);

    while (person.getIterator().hasNext()) {
      System.out.println(person.getIterator().next());
    }
  }

  public static void main(String[] args) {

    String[] str = {"Java", "Python", "JavaScript", "Go"};
    Integer[] x = {1, 2, 3, 4, 5, 6, 7, 8};

    Person<String> person = new Person(str);

    Object o = person.getIterator();

    while (((Iterator)o).hasNext()) {
      String s = (String) ((Iterator)o).next();
      System.out.println(s);
    }
  }
}
