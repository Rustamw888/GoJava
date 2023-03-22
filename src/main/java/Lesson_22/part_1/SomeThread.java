package Lesson_22.part_1;

import lombok.SneakyThrows;

public class SomeThread {

  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    MyThread2 myThread2 = new MyThread2();
    myThread2.start();
    myThread1.start();
    System.out.println("STOP");
  }
}

class MyThread1 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
  }
}

class MyThread2 extends Thread {

  @SneakyThrows
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("B");
    }
    sleep(400);
  }
}