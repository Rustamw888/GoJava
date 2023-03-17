package Lesson_12.part_6;

public class SortClass {

  public static void main(String[] args) {
    int a[] = {9, 4, 6, 1, 0, 3};
    System.out.println("Не отсортированный массив");
    for (int i: a) {
      System.out.print(i + ", ");
    }
    selectInSort(a);
    System.out.println("Отсортированный массив");
    for (int i: a) {
      System.out.print(i + ", ");
    }

  }
  
  public static void selectInSort(int[] array) {
    int min, temp;
    for (int i = 0; i < array.length; i++) {
      min = i;
      for (int scan = i + 1; scan < array.length; scan++) {
        if (array[scan] < array[min]) {
          min = scan;
        }
      }
      temp = array[min];
      array[min] = array[i];
      array[i] = temp;
    }
  }

}
