package Lesson_26.part_3.part_3;

import java.math.BigInteger;

public class LunaAlgorithmString {

  public static void main(String[] args) {
    System.out.printf("sum = %s;\n", checkCard("123456"));
    System.out.println(isValid(String.valueOf(123456)));
    System.out.printf("sum = %s;\n", checkCard("4000001234567899"));
    System.out.println(isValid("4000001234567899"));
  }

  public static int checkCard(String str) {
    String[] charOfNumber = str.split("");
    int sum = 0;
    String string = "";

    for (int i = 0; i < charOfNumber.length; i++) {
      if (i % 2 == 0) {
        string += Integer.parseInt(charOfNumber[charOfNumber.length - 1 - i]);
      } else {
        string += 2 * Integer.parseInt(charOfNumber[charOfNumber.length - 1 - i]);
      }
    }
    for (String s : string.split("")) {
      sum += Integer.parseInt(s);
    }
    return (int) sum;
  }

  public static boolean isValid(String str) {
    return checkCard(String.valueOf(new BigInteger(str))) % 10 == 0 ? true:false;
  }

}
