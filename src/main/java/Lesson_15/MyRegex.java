package Lesson_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

  public static void main1(String[] args) {
    String s1 = "арапр dJavaSE the bestJavaScript Java!";
    Pattern pattern = Pattern.compile(".*\\wJava\\w.*");
    Matcher matcher = pattern.matcher(s1);
    boolean b = matcher.matches();
    if (b) {
      System.out.println("Да");
    } else {
      System.out.println("Нет");
    }
  }

    public static void main2(String[] args) {
    String s1 = "арапр dJavaSE the bestJavaScript Java!";
    Pattern pattern = Pattern.compile("Java\\w.");
    Matcher matcher = pattern.matcher(s1);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }

    public static void main3(String[] args) {
    String text = "java-SE_2023@mail.com";
    Pattern pattern = Pattern.compile("[A-Za-z0-9]{1,}[\\-]{1}[_]{0,1}[A-Za-z0-9]{1,}+@([A-Za-z]{1,}+[\\.]{1}[a-z]{2,})");
    Pattern pattern2 = Pattern.compile("[A-z0-9]{1,}[\\-]{1}[_]{0,1}[A-z0-9]{1,}+@([A-z]{1,}+[\\.]{1}[a-z]{2,})");
    Pattern pattern3 = Pattern.compile("(\\w+[\\-]{0,1}[_]{0,1}\\w+)+@(\\w+[\\.]{1}\\w{2,})");

    Matcher matcher = pattern.matcher(text);
    boolean result = matcher.matches();
    if (result) {
      System.out.println(text);
    } else {
      System.out.println("Не найдено");
    }
  }

  public static void main4(String[] args) {
    String text1 = "\u00A7Hello world! Hi world Bye world!!";

    Pattern pattern = Pattern.compile("world");
    Matcher matcher = pattern.matcher(text1);
    String text2 = matcher.replaceAll("Java");
    System.out.println(text1);
    System.out.println(text2);
  }

  public static void main5(String[] args) {
    String password = "123dgds";

    System.out.println(password.matches("[0-9A-z]{6,}"));

  }

  public static void main6(String[] args) {
    String password = "123dgds";

    Pattern pattern = Pattern.compile("[0-9A-z]{6,}");
    Matcher matcher = pattern.matcher(password);
    System.out.println(matcher.matches());

  }

  public static void main(String[] args) {

    System.out.println(passwordValid("123"));
    System.out.println(passwordValid("dggf0250"));
    System.out.println(passwordValid("%&*^fhfgh6516"));

  }

  public static boolean passwordValid(String password) {
//    return password.matches("[0-9A-z]{6,}");
    return password.matches(".*");
  }
}
