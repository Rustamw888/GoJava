package Lesson_41.part_5;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {

  public static void main1(String[] args) {

    File file;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {
      file = new File("src/main/java/Lesson_41/part_5/test.csv");
      isr = new InputStreamReader(new FileInputStream(file));
      br = new BufferedReader(isr);

      StringTokenizer tokenizer = new StringTokenizer(br.readLine(), ",");
      System.out.println(tokenizer.countTokens());

      while (tokenizer.hasMoreTokens()) {
        System.out.println(tokenizer.nextToken());
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        isr.close();
        br.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public static void main2(String[] args) {

    File file = new File("src/main/java/Lesson_41/part_5/test.csv");

    try {
      Scanner scanner = new Scanner(file);
      StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), ",");
      System.out.println(tokenizer.countTokens());

      while (tokenizer.hasMoreTokens()) {
        System.out.println(tokenizer.nextToken());
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {

    File file = new File("src/main/java/Lesson_41/part_5/test.csv");

    try {
      Scanner scanner = new Scanner(file);
      String string = scanner.nextLine();
      String[] strings = string.split(",");

      for (String string1 : strings) {
        System.out.println(string1);
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
