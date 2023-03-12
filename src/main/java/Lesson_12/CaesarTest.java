package Lesson_12;

public class CaesarTest {

  public static void main(String[] args) {
    Caesar caesar = new Caesar();
    String result = caesar.encrypt("Axeeh Phkew!/.,", 1);
    System.out.println(result);
    String result2;

    for (int i = 1; i < 26; i++) {
      result2 = caesar.encrypt(result, i);
      System.out.println(result2);
    }
  }
}
