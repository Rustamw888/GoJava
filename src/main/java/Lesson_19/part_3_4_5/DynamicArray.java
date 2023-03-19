package Lesson_19.part_3_4_5;

public class DynamicArray {
  int[] data = {0, 1, 2, 3, 4, 5, 6, 7};

  public void add(int element, int index) {
    int[] temp = new int[data.length + 1];
    System.arraycopy(data, 0, temp, 0, index);
    System.arraycopy(data, index, temp, index + 1, data.length - index);
    temp[index] = element;
    this.data = temp;
  }

  public void delete(int index) {
    int[] temp = new int[data.length - 1];
    System.arraycopy(data, 0, temp, 0, index);
    System.arraycopy(data, index + 1, temp, index, data.length - index - 1);
    this.data = temp;
  }

  public void add(int element) {
    add(element, data.length);
  }

  public void delete() {
    delete(data.length - 1);
  }
}
