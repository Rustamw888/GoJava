package Lesson_59.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ReferencesMethod {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("Java", "Angular", "React", "HTML", "CSS", "Word", "JS");

//    words.forEach(System.out::println);
//    words.forEach((String s) -> new ReferencesMethod().printed(s));
//    words.forEach((s) -> new ReferencesMethod().printed(s));
//    words.forEach(new ReferencesMethod()::printed);
//    words.forEach(ReferencesMethod::printed);
//    words.forEach(new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        System.out.println("He he");
//      }
////    });
//    words.forEach(new Consumer<String>() {
//      @Override
//      public void accept(String s) {
//        new ReferencesMethod().printed(s);
//      }
//    });
    words.forEach(new ReferencesMethod()::printed);
  }

//  public static void printed(String s) {
//    String str1 = "Hello";
//    String str2 = "!!!";
//    System.out.printf("%s mister %s %s\n", str1, s, str2);
//  }

  public void printed(String s) {
    String str1 = "Hello";
    String str2 = "!!!";
    System.out.printf("%s mister %s %s\n", str1, s, str2);
  }
}
