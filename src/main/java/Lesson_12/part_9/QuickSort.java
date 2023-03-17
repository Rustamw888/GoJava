package Lesson_12.part_9;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {
    Random random = new Random();
//    int[] array = random.ints(10).toArray();
    int[] array = {10, 90, 80, 60, 70, 50, 10, 40, 20, 30, 534};
    System.out.println("Мой неотсортированный массив: " + Arrays.toString(array));
    qSort3(array, 0, array.length - 1);
    System.out.println("Мой отсортированный массив: " + Arrays.toString(array));
  }

  public static void qSort(int[] array, int first, int last) {
    if (array.length == 0) {
      return;
    }
    if (first >= last) {
      return;
    }
    int i, j;
    i = first;
    j = last;
    int mid = array[(i + j) / 2];

    do {
      while (array[i] < mid) {
        i++;
      }
      while (array[j] > mid) {
        j--;
      }
      if (i <= j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    } while (i <= j);

    if (first < j) {
      qSort(array, first, j);
    }
    if (i < last) {
      qSort(array, i, last);
    }
  }

  public static void qSort2(int[] array, int first, int last) {
    if (array.length == 0) {
      return;
    }
    if (first >= last) {
      return;
    }
    int i, j;
    i = first;
    j = last;
    int mid = array[(i + j) / 2];
    do {
      while (array[i] < mid) {
        i++;
      }
      while (array[j] > mid) {
        j--;
      }
      if (array[i] >= array[j]) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    } while (i <= j);

    if (first < j) {
      qSort2(array, first, j);
    }
    if (i < last) {
      qSort2(array, i, last);
    }
  }

  public static void qSort3(int[] array, int first, int last) {
    if (array.length == 0) {
      return;
    }
    if (first >= last) {
      return;
    }
    int i, j;
    i = first;
    j = last;
    int mid = array[(i + j) / 2];
    do {
      while (array[i] < mid) {
        i++;
      }
      while (array[j] > mid) {
        j--;
      }
      if (array[i] >= array[j]) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    } while (i <= j);

    if (first < j) {
      qSort3(array, first, j);
    }

    if (i > last) {
      qSort3(array, i, last);
    }
  }

}
