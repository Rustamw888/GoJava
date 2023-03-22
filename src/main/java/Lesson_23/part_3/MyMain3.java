package Lesson_23.part_3;

import java.util.Scanner;

public class MyMain3 {

  public static void main(String[] args) {

    Func func = () -> {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a == 10) {
        return 0;
      } else {
        return a + b;
      }
    };

    System.out.println(func.getResult());
  }

}

interface Func {
  int getResult();
}