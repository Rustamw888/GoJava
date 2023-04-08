package Lesson_45.part_4;

public class Store {

  private int product = 0;
  public synchronized void get() {
    while (product < 1) {
      try {
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    product--;
    System.out.println("Покупатель купил 1 товар");
    System.out.println("Товаров на складе: " + product);
    notify();
  }

  public synchronized void put() {
    while (product >= 3) {
      try {
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    product++;
    System.out.println("Производитель добавил 1 товар");
    System.out.println("Товаров на складе: " + product);
    notify();
  }
}


class Producer implements Runnable {

  Store store;
  Producer(Store store) {
    this.store = store;
  }

  @Override
  public void run() {
    for (int i = 0; i < 6; i++) {
      store.put();
    }
  }
}

class Consumer implements Runnable {

  Store store;
  Consumer(Store store) {
    this.store = store;
  }

  @Override
  public void run() {
    for (int i = 0; i < 6; i++) {
      store.get();
    }
  }
}