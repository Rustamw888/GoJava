package Lesson_44.part_4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HelloCollection {

  public static void main(String[] args) {
    Set<String> hashSetString = new HashSet<>();
    hashSetString.add("Java");
    hashSetString.add("Ruby");
    hashSetString.add("Python");
    hashSetString.add("01");
    hashSetString.add("007");
    hashSetString.add("0");
    System.out.println(hashSetString);

    Set<String> treeSetString = new TreeSet<>();
    treeSetString.add("Java");
    treeSetString.add("Ruby");
    treeSetString.add("Python");
    treeSetString.add("01");
    treeSetString.add("007");
    treeSetString.add("0");
    System.out.println(treeSetString);

    System.out.println(((TreeSet<String>) treeSetString).tailSet("Java"));
    System.out.println(((TreeSet<String>) treeSetString).first());
  }
}
