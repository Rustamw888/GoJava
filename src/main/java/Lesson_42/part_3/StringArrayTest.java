package Lesson_42.part_3;

import java.util.Arrays;
import java.util.HashMap;

public class StringArrayTest {

  public static void main(String[] args) {

    String[] dataString = {
        "user:Mark",
        "password:123",
        "email:Mark@mail.com"
    };

    HashMap<String, String> hashMap = new HashMap<>();

    for (String s : dataString) {
      String key = s.split(":")[0];
      String value = s.split(":")[1];
      hashMap.put(key, value);
    }

    for (int i = 0; i < dataString.length; i++) {
      System.out.println(dataString[i]);
    }

    System.out.println("---------------------------");

    hashMap.forEach((k, v) -> System.out.printf("%s:%s\n", k, v));
  }
}
