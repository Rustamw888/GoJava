package Lesson_26.part_3.part_1;

public class LunaAlgorithmInt {

  public static void main(String[] args) {
    System.out.printf("sum = %s;\n", checkCard(123456));
    System.out.println(isValid(123456));
  }

  public static int checkCard(int number) {
    boolean flag = false;
    int a, sum = 0;
    while (true) {
      a = number % 10;
      if(flag) {
        a *= 2;
        if (a > 9) {
          a -= 9;
          flag = false;
        }
      } else {
        flag = true;
      }
      sum += a;
      if (number / 10 == 0) {
        break;
      }
      number /= 10;
    }
    return sum;
  }

  public static boolean isValid(int number) {
    return checkCard(number) % 10 == 0 ? true:false;
  }

}
