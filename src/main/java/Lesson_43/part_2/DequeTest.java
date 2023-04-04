package Lesson_43.part_2;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeTest {

  public static void main(String[] args) {
    ArrayDeque<String> nameLanguage = new ArrayDeque<>();

    nameLanguage.addFirst("1. Java");
    nameLanguage.addFirst("2. JavaScript");
    nameLanguage.addLast("3. Ruby");
    System.out.println(nameLanguage);

    System.out.println(nameLanguage.add("4. Go"));
    System.out.println(nameLanguage.add("4. Go"));
    System.out.println(nameLanguage);

    nameLanguage.push("5. Python");
    System.out.println(nameLanguage);
    System.out.println(nameLanguage.pop());
    System.out.println(nameLanguage);

    Iterator<String> it = nameLanguage.iterator();
    System.out.println(it.next());
    System.out.println("----------------------------------");
    System.out.println(nameLanguage.remove());
    System.out.println(nameLanguage);
    System.out.println("----------------------------------");
    System.out.println(nameLanguage.element());
    System.out.println(nameLanguage.spliterator());
    nameLanguage.clear();
    System.out.println(nameLanguage);
  }
}
