package Lesson_19.part_2;

public class Lambda2 implements Sum {

  public static void main(String[] args) {

//    Sum func1 = new Sum() {
//      @Override
//      public int sum(int a, int b) {
//        return a + b;
//      }
//    };

//    int resul1 = func1.sum(2, 5);
    Sum resul2 = (a, b) -> {return a + b;};
    Sum resul3 = (a, b) -> a + b;
    System.out.println(resul2);
    System.out.println(resul3);
  }

  @Override
  public int sum1(int a, int b) {
    return a + b;
  }

}
