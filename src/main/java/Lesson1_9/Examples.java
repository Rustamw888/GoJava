package Lesson1_9;

public class Examples {

//  public static void main(String[] args) {
//    String s1 = "Hello";
//    s1 = s1 + "!!!";
//
//    System.out.println(s1);
//
//    StringBuilder s2 = new StringBuilder();
//    s2.append("Hello2");
//    s2.append("!!!2");
//
//    System.out.println(s2);
//  }

//  public static void main(String[] args) {
//
//    String s1 = "Hello World";
//
//    String[] arr = s1.split(" ");
//
//    System.out.println("arr = " + Arrays.stream(arr).toList());
//  }

//  public static void main(String[] args) {
//
//    for (int i = 0; i < 10; i++) {
//      loop1: {
//        loop2: {
//          loop3:
//          for (int j = 0; j < 10; j++) {
//            if (j == 5) {
//              break loop2;
//            }
//            System.out.println("Hi " + j);
//          }
//        }
//        System.out.println("Hello " + i);
//      }
//    }
//  }

//  public static void main(String[] args) {
//
//    int a = 1;
//    int b = 2;
//    System.out.printf("a = %s, b = %s", a, b + "\n");
//    a = swap(b, b = a);
//    System.out.printf("a = %s, b = %s", a, b + "\n");
//  }
//
//  static int swap(int x, int y) {
//    return x;
//  }

//  public static void main(String[] args) {
//    int array[] = {1, 3, 5, 3, 2, 9, -2};
//
//    for (int i = 0; i < array.length; i++) {
//      for (int j = i; j < array.length; j++) {
//        if (array[i] > array[j]) {
//          int temp = array[j];
//          array[j] = array[i];
//          array[i] = temp;
//        }
//
//      }
////      System.out.println(array[i]);
//    }
//    for (int i : array) {
//      System.out.print(i + " ");
//    }
//  }

//  public static void main(String[] args) {
//    int array[] = {1, 3, 5, 3, 2, 9, -2};
//
//    for (int i : array) {
//      System.out.print(i + " ");
//    }
//    int count;
//    do {
//      count = 0;
//      for (int i = 0; i < array.length - 1; i++) {
//        if (array[i] > array[i + 1]) {
//          int temp = array[i];
//          array[i] = array[i + 1];
//          array[i + 1] = temp;
//          count++;
//        }
//
//      }
//    }
//
//    while (count > 0);
//    System.out.println();
//    for (int i : array) {
//      System.out.print(i + " ");
//
//    }
//
//  }

//  public static void main(String[] args) {
//    System.out.println(fuctorial(10));
//    System.out.println(fib(50));
//  }
//
//  public static long fuctorial(int x) {
//    if (x <= 1) {
//      return 1;
//    }
//    return x * fuctorial(x - 1);
//  }
//
//  public static long fib(int y) {
//    if (y <= 2) {
//      return 1;
//    }
//    return fib(y - 1) + fib(y - 2);
//  }

//  public static void main(String[] args) {
//    Test playMusic = new Test() {
//      @Override
//      public int methodTest() {
//        System.out.println("E class");
//        return 1;
//      }
//    };
//    playMusic.methodTest();
//  }

  public static class TestClass {

    void testMethod() {
      System.out.println("testMethod");
      class NewClassTest {
        void met() {
          System.out.println("123");
        }
      }
    }


  }


}