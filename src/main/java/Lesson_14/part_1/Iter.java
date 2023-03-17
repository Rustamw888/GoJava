package Lesson_14.part_1;

import java.util.Arrays;

public class Iter {

  public static void main(String[] args) {

    int[] array = {40, 10, 60, 20, 5, 180, 30, 70};
    System.out.println(Arrays.toString(array));
    iter2(array);
    System.out.println(Arrays.toString(array));
  }

  public static void iter1(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int temp = array[i];
      for (int j = (i - 1); j >= 0; j--) {
        if (temp < array[j]) {
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  public static void iter2(int[] array) {
    int temp, j;
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          temp = array[i + 1];
          array[i + 1] = array[i];
          j = i;
          while (j > 0 && temp < array[j - 1]) {
            array[j] = array[j - 1];
            j--;
        }
          array[j] = temp;
      }
    }
  }
}
