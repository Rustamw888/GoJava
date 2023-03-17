package Lesson_15;

public class Split {

  public static void main1(String[] args) {
    String s1 = "I love java";
    String[] s2 = s1.split(" ");
    for (String s : s2) {
      System.out.println(s);
    }
    System.out.println("//////////");
    for (String s : s2) {
      System.out.print(s);
    }
    System.out.println("\n//////////");
    for (String s : s2) {
      System.out.printf("%s", s);
    }
    System.out.println("\n//////////");
    for (String s : s2) {
      System.out.printf("%s\n", s);
    }
    System.out.println("//////////");
    for (String s : s2) {
      System.out.printf("%s\t", s);
    }
  }

  public static void main2(String[] args) {
    String number = "+123456789";
    boolean result = number.matches("(\\+*)\\d{9}");
    if (result) {
      System.out.println("Совпадает");
    } else {
      System.out.println("Не совпадает");
    }
  }

  public static void main(String[] args) {
    String s1 = "Java*the!number   one";
    String[] s2 = s1.split("\\s*(\\s|\\*|!| |\\.)\\s*");
    for (String s : s2) {
      System.out.println(s);
    }
  }

}
