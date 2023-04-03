package Lesson_41.part_2;

import java.util.Arrays;

public class StringLess {

  public static void main(String[] args) {
    String[] str = {"Mersedes", "Renault", "Ferrary", "Seat", "Skoda", "Ford"};
    System.out.println(Arrays.toString(str));
    System.out.println("--------------------------------");
    String sTest = new String();

    for (String s : str) {
      sTest = sTest + String.format("%s ", s);
    }

    System.out.println(sTest);
  }
}
