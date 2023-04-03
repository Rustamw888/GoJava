package Lesson_41.part_3;

public class StringLess {

  public static void main1(String[] args) {

    String t = "https://api.telegram.org/bot<token>/METHOD_NAME";
    String token = "12364549849";

    System.out.println(t.replaceAll("<token>", token));
    t = t.replaceAll("<token>", token);
    System.out.println(t);
  }

  public static void main2(String[] args) {

    String t = "https://api.telegram.org/bot<token>/METHOD_NAME";
    String token = "12364549849";

    char[] t1 = t.toCharArray();
    System.out.println(t1);
  }

  public static void main(String[] args) {

    String t = "https://api.telegram.org/bot<token>/METHOD_NAME";
    String token = "12364549849";

    System.out.println(t);
    t = t.replace('o', 'g');
    System.out.println(t);
  }
}
