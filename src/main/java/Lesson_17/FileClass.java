package Lesson_17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileClass {

  public static void main1(String[] args) {
    String path = "C:\\ProjectsJob\\GoJava\\src\\main\\java\\Lesson_17\\test.txt";

    File file = new File(path);
    System.out.println(file.isFile());
    System.out.println(file.length());
    System.out.println(file.getAbsoluteFile());
    System.out.println(file.canRead());
    System.out.println(file.canWrite());
    System.out.println(file.getName());
    System.out.println(file.getPath());
    System.out.println(file.getTotalSpace());
    System.out.println(file.delete());
    try {
      System.out.println(file.createNewFile());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    String path = "C:\\ProjectsJob\\GoJava\\src\\main\\java\\Lesson_17\\folder1\\folder1_1";

    File file = new File(path);
    if (!file.exists()) {
      file.mkdirs();
      System.out.println("Папка в папке создана");
    } else {
      System.out.println("Папка в папке уже есть");
    }
    System.out.println(Arrays.toString(file.list()));
  }
}
