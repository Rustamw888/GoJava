package Lesson_49.part_4;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Download {

  public static void main(String[] args) {
    String url = "https://cdnn1.inosmi.ru/img/24985/10/249851004_0:196:2030:1211_1280x0_80_0_0_87d6869bd94c383de3e0573302893762.jpg.webp";
    String fileName = "src/main/java/Lesson_49/part_4/dog.webp";

//    saveUrl(url, fileName);
    downloadFileFromUrl(url, fileName);

  }

  public static void saveUrl(String url, String fileName) {
    FileOutputStream fos = null;
    BufferedInputStream bis = null;

    try {
      bis = new BufferedInputStream(new URL(url).openStream());
      fos = new FileOutputStream(fileName);
      byte[] data = new byte[1024];
      int count;
      while ((count = bis.read(data, 0, 1024)) != -1) {
        fos.write(data, 0, count);
        fos.flush();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        bis.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      } finally {
        try {
          fos.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

  public static boolean downloadFileFromUrl(String url, String fileName) {
    try(InputStream in = URI.create(url).toURL().openStream()) {
      Files.copy(in, Paths.get(fileName));
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }

}
