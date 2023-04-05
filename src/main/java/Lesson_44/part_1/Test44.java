package Lesson_44.part_1;

public class Test44 {

  public static void main(String[] args) {
    T44 t1 = new T44();
    T44 t2 = new T44();
  }

}

class T44 {

  static {
    System.out.println("Hello");
  }

  public T44() {
    System.out.println("Constructor started");
  }
}
