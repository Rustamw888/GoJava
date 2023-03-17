package Lesson_12.part_7;

public class SearchClass {

  public static void main(String[] args) {
    int a = 1;
    int[] array = {1, 6, 3, 9, 5, 0, 1};
    searchMethod(array, a);
  }

  public static void searchMethod(int[] arr, int element) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == element) {
        System.out.println("Да, элемент находится в arr[" + i + "]");
        count++;
      }
    }
    if (count == 0) {
      System.out.println("Элемент отсутствует");
    }
  }

}
