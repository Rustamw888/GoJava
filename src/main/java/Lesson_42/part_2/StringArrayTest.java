package Lesson_42.part_2;

import java.util.Arrays;
import java.util.HashMap;

public class StringArrayTest {

  public static void main1(String[] args) {

    String[] dataString = {
        "user:Mark",
        "password:123",
        "email:Mark@Mail.com"
    };

    for (String s : dataString) {
      String key = s.split(":")[0];
      String value = s.split(":")[1];
      System.out.printf("Key: %s Value: %s\n", key, value);
    }
  }

  public static void main2(String[] args) {

    String[] dataString = {
        "user:Mark",
        "password:123",
        "email:Mark@Mail.com"
    };

    HashMap<String, String> hashMap = new HashMap<>();

    hashMap.put("key", "value");

    System.out.println(Arrays.toString(dataString));
    System.out.println(hashMap);
  }

  public static void main3(String[] args) {

    String[] dataString = {
        "user:Mark",
        "password:123",
        "email:Mark@Mail.com"
    };

    HashMap<String, String> hashMap = new HashMap<>();

    hashMap.put("key", "value");
    hashMap.put("java", "oracle");
    hashMap.put("w", "oracle");

    System.out.println(Arrays.toString(dataString));
    System.out.println(hashMap.get("java"));
  }

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

    System.out.println(Arrays.toString(dataString));
    System.out.println(hashMap.get("email"));
  }
}
