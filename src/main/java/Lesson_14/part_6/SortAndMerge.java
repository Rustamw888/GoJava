package Lesson_14.part_6;

import static Lesson_14.part_5.MergeClass.merge;

import java.util.Arrays;

public class SortAndMerge {

  public static void main(String[] args) {
    int[] array1 = {4, 2, 1, 8, 10, 9};
    int[] array2 = sortMerge(array1);
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
  }

  public static int[] sortMerge(int[] array) {
    if (array == null) {
      System.out.println("Пустой");
      return null;
    }
    if (array.length == 1) {
      System.out.println("Длина равна 1");
      return array;
    }
    int[] left = new int[array.length / 2];
    int[] right = new int[array.length - left.length];
    System.arraycopy(array, 0, left, 0, left.length);
    System.arraycopy(array, left.length, right, 0, right.length);
    return merge(sortMerge(left), sortMerge(right));
  }

}
