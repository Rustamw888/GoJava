package Lesson_20.part_2;

import java.util.Scanner;

public class ChristmasTree {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = a - 3;
    for (int k = b; k > 0; k--) {
      for (int f = 0; f < 6; f++) {
        System.out.print(" ");
      }
      for (int j = 0; j < k; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < 2 * (b - k) + 1; h++) {
        System.out.print("V");
      }
      System.out.println();
    }

    int c = a - 2;
    for (int k = c; k > 0; k--) {
      for (int f = 0; f < 2; f++) {
        System.out.print("  ");
      }
      for (int j = 0; j < k; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < (2 * (c - k) + 1) + 2; h++) {
        System.out.print("V");
      }
      System.out.println();
    }

    int d = a - 1;
    for (int k = d; k > 0; k--) {
      for (int f = 0; f < 1; f++) {
        System.out.print("  ");
      }
      for (int j = 0; j < k; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < (2 * (d - k) + 1) + 3; h++) {
        System.out.print("V");
      }
      System.out.println();
    }

    int e = a;
    for (int k = e; k > 0; k--) {
      for (int j = 0; j < k; j++) {
        System.out.print(" ");
      }
      for (int h = 0; h < (2 * (e - k) + 1) + 4; h++) {
        System.out.print("V");
      }
      System.out.println();
    }
  }

}
