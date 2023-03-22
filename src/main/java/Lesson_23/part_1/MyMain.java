package Lesson_23.part_1;

public class MyMain {

  public static void main(String[] args) {
    Func1 func1 = new Func1() {
      public void print(String str) {
        System.out.println(str);
      }
    };
    func1.print("Hello1");

    Func1 func11 = str -> System.out.println(str);
    func11.print("Hello2");

    Func2 func2 = (x, y) -> {return x + y;};
    System.out.println(func2.getResult(2, 2));

    Func3<String> func3 = (x, y) -> {return x + y;};
    System.out.println(func3.getResult("2", "2"));
  }
}

interface Func1 {
  void print(String str);
}

interface Func2 {
  double getResult(double x, double y);
}

interface Func3<T> {
  T getResult(T x, T y);
}
