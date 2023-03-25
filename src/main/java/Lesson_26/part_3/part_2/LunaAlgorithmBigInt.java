package Lesson_26.part_3.part_2;

import java.math.BigInteger;

public class LunaAlgorithmBigInt {

  public static void main(String[] args) {
    System.out.printf("sum = %s;\n", checkCard(new BigInteger("123456")));
    System.out.println(isValid(String.valueOf(123456)));
    System.out.printf("sum = %s;\n", checkCard(new BigInteger("4000001234567899")));
    System.out.println(isValid("378282246310005"));
  }

  public static int checkCard(BigInteger number) {
    boolean flag = false;
    long a, sum = 0;
    while (true) {
      a = number.longValue() % 10;
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
      if (number.longValue() / 10 == 0) {
        break;
      }
      number = BigInteger.valueOf(number.longValue() / 10);
    }
    return (int) sum;
  }

  public static boolean isValid(String str) {
    return checkCard(new BigInteger(str)) % 10 == 0 ? true:false;
  }

}
