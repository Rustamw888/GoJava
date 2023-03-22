package Lesson_22.part_1;

public class SomeThread {

  public static void main(String[] args) {
    MyThread1 myThread1 = new MyThread1();
    myThread1.start();
    MyThread2 myThread2 = new MyThread2();
    myThread2.start();
    System.out.println("STOP");
  }
}

class MyThread1 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("A");
    }
  }
}

class MyThread2 extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("B");
    }
  }
}