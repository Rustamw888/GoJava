package Lesson_41.part_1;

import java.util.Arrays;

public class StringLess {

  public static void main(String[] args) {
    String text = "Hello. This is a Java course";
    String[] array = text.split(" ");
    System.out.println(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println(Arrays.toString(text.split(" ")));
  }
}
