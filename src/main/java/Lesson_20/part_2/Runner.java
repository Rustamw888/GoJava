package Lesson_20.part_2;

public class Runner {

  public static void main(String[] args) {

    Mutable mutable = new Mutable("Hannah");
    System.out.println(mutable.getName());
    mutable.setName("New name");
    System.out.println(mutable.getName());
  }

}

class Mutable {

  private String name;

  public Mutable() {
  }

  public Mutable(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
