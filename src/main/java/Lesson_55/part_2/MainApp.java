package Lesson_55.part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

  public static void main1(String[] args) {
    try {
      Process p = Runtime.getRuntime().exec("calc.exe");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    String pythonFile = "src/main/java/Lesson_55/part_2/test.py";
    try {
      System.out.println("before process");
      Process p = Runtime.getRuntime().exec(new String[] {"python", pythonFile});
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
      String s = bufferedReader.readLine();
      System.out.println(s);
      while (s != null) {
        s = bufferedReader.readLine();
        System.out.println(s);
      }
      System.out.println("after process");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
