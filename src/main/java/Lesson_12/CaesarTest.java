package Lesson_12;

public class CaesarTest {

  public static void main(String[] args) {
    Caesar caesar = new Caesar();
    String result = caesar.encrypt("ABba ABba", 2);
    System.out.println(result);
  }
}
