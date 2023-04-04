package Lesson_43.part_1;

public class Main {

  public static void main(String[] args) {

    Store store1 = new Store();
    Store store2;

    try {
      store2 = store1.clone();
      store2.state = store1.state.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }

    store2.id = 1000;
    store2.name = "SHOP_2";
    store2.state.size = 0;
    System.out.printf("store1 id = %s\n", store1.id);
    System.out.printf("store2 id = %s\n", store2.id);
    System.out.printf("store1 name = %s\n", store1.name);
    System.out.printf("store2 name = %s\n", store2.name);
    System.out.printf("store1 state = %s\n", store1.state.size);
    System.out.printf("store2 state = %s\n", store2.state.size);

  }

}
