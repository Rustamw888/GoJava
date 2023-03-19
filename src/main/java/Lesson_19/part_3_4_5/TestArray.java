package Lesson_19.part_3_4_5;

import java.util.Arrays;

public class TestArray {

  public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();
    System.out.println(Arrays.toString(dynamicArray.data));
    dynamicArray.add(90, 4);
    System.out.println(Arrays.toString(dynamicArray.data));
    dynamicArray.delete(8);
    System.out.println(Arrays.toString(dynamicArray.data));
    dynamicArray.add(85);
    System.out.println(Arrays.toString(dynamicArray.data));
    dynamicArray.delete();
    System.out.println(Arrays.toString(dynamicArray.data));
  }

}
