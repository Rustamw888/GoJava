package Lesson_15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

  public static void main(String[] args) {
    String s1 = "арапр Java the best";
    Pattern pattern = Pattern.compile(".*\\bJava\\b.*");
    Matcher matcher = pattern.matcher(s1);
    boolean b = matcher.matches();
    if (b) {
      System.out.println("Да");
    } else {
      System.out.println("Нет");
    }
  }
}
