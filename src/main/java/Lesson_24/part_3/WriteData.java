package Lesson_24.part_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {

  public static void main1(String[] args) {

    try {
      FileWriter writer = new FileWriter("src/main/java/Lesson_24/part_3/data.txt");
      writer.write("Hello");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main2(String[] args) {

    try {
      FileWriter writer = new FileWriter("src/main/java/Lesson_24/part_3/data.txt", true);
      writer.write("Hello");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main3(String[] args) {

    try {
      PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/main/java/Lesson_24/part_3/data.txt", true)));
      writer.println("Hello");
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private PrintWriter writer;
  private File file;

  public WriteData(String filePath) {
    file = new File(filePath);
  }

  public void writer(String data) {
    try {
      writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
      writer.println(data);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      writer.close();
    }
  }

}
