package Lesson_45.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SinchronizedTest {

  public static void main(String[] args) {

    Integer[] numbers = {0, 10, 20, 100, 50, 1000};
    ArrayList<Integer> answer = new ArrayList<>();

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        synchronized (answer) {
          answer.add(Collections.max(Arrays.asList(numbers)));
        }
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        synchronized (answer) {
          answer.add(Collections.min(Arrays.asList(numbers)));
        }
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    try {
      thread2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println(answer);
    System.out.println("Main finished");
    System.exit(0);
  }
}
