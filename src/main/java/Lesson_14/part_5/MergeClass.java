package Lesson_14.part_5;

import java.util.Arrays;

public class MergeClass {

  public static void main(String[] args) {
    int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] array1 = {2, 16, 9, 10};
    System.out.println(Arrays.toString(merge2(array1, array2)));
  }

  public static int[] merge(int[] a, int[] b) {
    int result[] = new int[a.length + b.length];
    int n = a.length;
    int m = b.length;
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (a[i] <= b[j]) {
        result[k] = a[i];
        i++;
      } else {
        result[k] = b[j];
        j++;
      }
      k++;
    }
    while (i < n) {
      result[k] = a[i];
      i++;
      k++;
    }
    while (j < m) {
      result[k] = b[j];
      j++;
      k++;
    }
    return result;
  }

  public static int[] merge2(int[] a, int[] b) {
    int[] result = new int[a.length + b.length];
    int n = a.length;
    int m = b.length;
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (a[i] < b[j]) {
        result[k] = a[i];
        i++;
      } else {
        result[k] = b[j];
        j++;
      }
      k++;
    }
    while (n > i) {
      for (int l = 0; l < a.length - i - 1; l++) {
        int temp = a[i];
        a[i + 1] = result[k];
        result[k] = temp;
      }
      i++;
      k++;
    }
    while (m > j) {
      for (int l = 0; l < b.length - j - 1; l++) {
        int temp = b[j];
        b[j + 1] = result[k];
        result[k] = temp;
      }
      j++;
      k++;
    }
    return result;
  }
}
