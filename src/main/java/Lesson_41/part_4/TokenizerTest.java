package Lesson_41.part_4;

import java.util.StringTokenizer;

public class TokenizerTest {

  public static void main(String[] args) {

    StringTokenizer tokenizer = new StringTokenizer("Hello,Java,Kotlin,Python", ",");
    System.out.println(tokenizer.countTokens());
    while (tokenizer.hasMoreTokens()) {
      System.out.println(tokenizer.nextToken());
    }
  }
}
