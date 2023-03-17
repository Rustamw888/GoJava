package Lesson_17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

  public static void main2(String[] args) {
    String path = "C:\\ProjectsJob\\GoJava\\src\\main\\java\\Lesson_17\\folder1\\folder1_1";

    File file = new File(path);
    if (!file.exists()) {
      file.mkdirs();
      System.out.println("Папка в папке создана");
    } else {
      System.out.println("Папка в папке уже есть");
    }
    String[] files = file.list();
    System.out.println(Arrays.toString(files));

    for (String s : files) {
      File f = new File(path + "\\" + s);
      System.out.println(f.isDirectory() ? (s + " is directory"): (s + " is file"));
    }
  }

  public static void main(String[] args) throws IOException {

    String path = "C:\\ProjectsJob\\GoJava\\src\\main\\java\\Lesson_17\\folder1\\folder1_1\\text1.txt";
    InputStream inputStream = null;

    try {
      inputStream = new FileInputStream(path);
      while (true) {

        int iByte = inputStream.read();
        if (iByte != -1) {
          System.out.print((char)iByte);
        } else {
          System.out.println("\nEND");
          break;
        }

      }
    } catch (Exception e) {
      throw new IOException("ERROR" + e + path);
    } finally {
      if (inputStream != null) {
        try {
          inputStream.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
