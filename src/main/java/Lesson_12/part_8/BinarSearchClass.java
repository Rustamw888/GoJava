package Lesson_12.part_8;

public class BinarSearchClass {

  public static void main(String[] args) {
    int a = 19;
    int[] array = {1, 5, 7, 9, 13, 19};
    recursBinarySearchMethod(array, a, 0, array.length);
  }

  public static void recursBinarySearchMethod(int[] arr, int element, int firstElem, int secondElem) {
    int middleElem = firstElem + (secondElem - firstElem)/2;

    if (arr[middleElem] == element) {
      System.out.println("Да, элемент находится в arr[" + middleElem + "]");
    } else if (arr[middleElem] > element) {
      recursBinarySearchMethod(arr, element, firstElem, middleElem);
    } else if (arr[middleElem] < element){
      recursBinarySearchMethod(arr, element, middleElem, secondElem);
    } else {
      System.out.println("Элемент не найден");
    }
  }

}
