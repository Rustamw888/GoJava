package Lesson_48.part_0;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Main {
  public static void main(String[] args) {
    String text = "Привет";
    try {
      byte[] utfData = text.getBytes("UTF-8");
      String str = new String(utfData, "cp1251");
      System.out.println(str);
      byte[] cpData = text.getBytes("cp1251");
      String str2 = new String(cpData, "UTF-8");
      System.out.println(str2);
      byte[] cpData3 = str.getBytes("cp1251");
      String str3 = new String(cpData3, "UTF-8");
      System.out.println(str3);

      System.out.println("------------------------------------");

      SortedMap<String, Charset> map = Charset.availableCharsets();
      int count = 0;
      for (String s : map.keySet()) {
        System.out.println(s);
        count++;
      }
      System.out.println("------------------------------------");
      System.out.println(count);

    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }
}
