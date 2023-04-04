package Lesson_42.part_4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    /**
     * Печатает ключи
     */
    for (String s : hashMap.keySet()) {
      System.out.println(s);
    }

    /**
     * Печатает все ключи и потом все вэлью
     */
    for (String s : hashMap.values()) {
      System.out.println(s);
    }

    /**
     * Проверяет что ключ содержится
     */
    System.out.println(hashMap.containsKey("user"));

    /**
     * Проверяет что вэлью содержится
     */
    System.out.println(hashMap.containsValue("123"));

    /**
     * Пустой хэшмап изначально
     */
    HashMap<Integer, Integer> integerHashMap = new HashMap<>();
    System.out.println(integerHashMap);

    /**
     * Заполненный хэшмап
     */
    HashMap<Integer, Integer> integerHashMap1 = new HashMap<>();
    integerHashMap1.put(1, 10);
    integerHashMap1.put(2, 20);
    integerHashMap1.put(3, 30);

    for (Integer integer : integerHashMap1.keySet()) {
      System.out.println(integer);
    }

    for (Integer integer : integerHashMap1.values()) {
      System.out.println(integer);
    }

    /**
     * Получение ключей и значений
     */

    for (Map.Entry entry : integerHashMap1.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    /**
     * Имеется ли еще ключ и значение
     */

    Iterator iterator = integerHashMap1.entrySet().iterator();
    System.out.println(iterator.hasNext());
    iterator.next();
    System.out.println(iterator.hasNext());
    iterator.next();
    System.out.println(iterator.hasNext());
    iterator.next();
//    System.out.println(iterator.hasNext());
//    iterator.next();

    /**
     * Имеется ли еще ключ и значение через while
     */

    Iterator iterator1 = integerHashMap1.entrySet().iterator();
    while (iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }

    /**
     * Получение ключей и значений через while и Map.Entry
     */

    Iterator iterator2 = integerHashMap1.entrySet().iterator();
    while (iterator2.hasNext()) {
      Map.Entry count = (Map.Entry)iterator2.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("----------------------------");
    }

    /**
     * Удаление пары
     */

    integerHashMap1.remove(1);
    Iterator iterator3 = integerHashMap1.entrySet().iterator();
    while (iterator3.hasNext()) {
      Map.Entry count = (Map.Entry)iterator3.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("!!!!!!!!!!!!!!!!!!");
    }

    /**
     * Замена значения
     */

    integerHashMap1.replace(2, 20, 1000);
    Iterator iterator4 = integerHashMap1.entrySet().iterator();
    while (iterator4.hasNext()) {
      Map.Entry count = (Map.Entry)iterator4.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("----------------------------");
    }

    /**
     * Замена значения перезапись еще один способ
     */

    integerHashMap1.put(2, 20);
    Iterator iterator5 = integerHashMap1.entrySet().iterator();
    while (iterator5.hasNext()) {
      Map.Entry count = (Map.Entry)iterator5.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("----------------------------");
    }

    /**
     * Заменить все значения
     */

    integerHashMap1.replaceAll((k, v) -> 266);
    Iterator iterator6 = integerHashMap1.entrySet().iterator();
    while (iterator6.hasNext()) {
      Map.Entry count = (Map.Entry)iterator6.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("----------------------------");
    }

    /**
     * Заменить все ключи значения
     */

    integerHashMap1.replaceAll((k, v) -> k * 2 + v * 10);
    Iterator iterator7 = integerHashMap1.entrySet().iterator();
    while (iterator7.hasNext()) {
      Map.Entry count = (Map.Entry)iterator7.next();
      System.out.println(count.getKey());
      System.out.println(count.getValue());
      System.out.println("----------------------------");
    }

  }
}
