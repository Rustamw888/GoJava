package Lesson_27.part_1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SuppressWarnings("all")
@MySetting(name = "Dima", id = 1, flag = true)
public class AnnotationTest {

  @Deprecated
  @InitSetting()
  public String base() {
    return "A";
  }
}

class Test {

  AnnotationTest annotationTest = new AnnotationTest();
  String str = annotationTest.base();

  public static void main(String[] args) {
    inspector(AnnotationTest.class);
    inspector(String.class);
  }

  public static void inspector(Class<?> a) {
    if (a.isAnnotationPresent(MySetting.class)) {
      System.out.println(a.getAnnotation(MySetting.class));
    } else {
      System.out.println("No annotation");
    }
  }

}

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MySetting {
  String name();
  int id();
  boolean flag() default false;
}

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface InitSetting {
  String value() default "INIT";
}