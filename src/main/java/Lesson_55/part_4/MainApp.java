package Lesson_55.part_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

  public static void main1(String[] args) {
    String pythonFile = "src/main/java/Lesson_55/part_2/test.py";
    try {
      System.out.println("before process");
      Process p = Runtime.getRuntime().exec(new String[] {"python", pythonFile});
      p.waitFor();

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
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main2(String[] args) {
    String pythonFile = "src/main/java/Lesson_55/part_2/test.py";
    ProcessBuilder processBuilder = new ProcessBuilder("python", pythonFile);
    Process process = null;
    try {
      process = processBuilder.start();
      BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
      String s = br.readLine();
      while (s != null) {
        System.out.println(s);
        s = br.readLine();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    String pythonFile = "src/main/java/Lesson_55/part_2/test.py";
    ProcessBuilder processBuilder = new ProcessBuilder("python", pythonFile);
    Process process = null;
    try {
      process = processBuilder.start();
      BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
      int s = br.read();
      while (s != -1) {
        System.out.println(s);
        s = br.read();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
