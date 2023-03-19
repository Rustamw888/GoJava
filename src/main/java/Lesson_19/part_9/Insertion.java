package Lesson_19.part_9;

import java.util.Arrays;

public class Insertion {

  public static void main(String[] args) {
    int[]array = {2, 1, 4, 6, 3, 12, 5, 9};

    System.out.println(Arrays.toString(array));
    insertSort(array);
    System.out.println(Arrays.toString(array));
  }

  public static int[] insertSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int key = a[i];
      int j = i - 1;
      while (j >= 0 && a[j] > key) {
        a[j + 1] = a[j];
        j--;
      }
      a[j + 1] = key;
    }
    return a;
  }
}
