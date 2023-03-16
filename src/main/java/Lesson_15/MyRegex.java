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

    public static void main(String[] args) {
    String s1 = "арапр dJavaSE the bestJavaScript Java!";
    Pattern pattern = Pattern.compile("Java\\w.");
    Matcher matcher = pattern.matcher(s1);
    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
