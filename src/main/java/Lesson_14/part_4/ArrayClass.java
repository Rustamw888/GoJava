package Lesson_14.part_4;

import java.util.Arrays;

public class ArrayClass {

  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] array2 = new int[array1.length + 3];
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
//    copy(array1, array2);
    copy(array1, array2);
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
  }

  /**
   * Метод принимает два массива.
   * Первый массив, тот ИЗ которого мы будем копировать.
   * Второй массив, тот В который мы будем копировать.
   *
   * **/
  public static void copy(int[] array1, int[] array2) {
    for (int i = 0; i < array2.length; i++) {
      array2[i] = array1[i];
    }
  }

//  /**
//   * Метод принимает два массива.
//   * Первый массив, тот ИЗ которого мы будем копировать.
//   * Второй массив, тот В который мы будем копировать.
//   * Если длина второго массива больше, чем длина первого массива, то увеличиваем
//   * длину первого массива в два раза.
//   * **/
//  public static int[] mutableArray(int[] array1, int[] array2) {
//    int[] resultArray1;
//    int[] resultArray2;
//    if (array1.length < array2.length) {
//      resultArray1 = new int[array1.length * 2];
//      for (int i = 0; i < resultArray1.length; i++) {
//        resultArray1[i] = array2[i];
//      }
//      return resultArray;
//    } else {
//      for (int i = 0; i < array2.length; i++) {
//        array1[i] = array2[i];
//      }
//      return array2;
//    }
//  }
}
