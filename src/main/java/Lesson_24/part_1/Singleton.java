package Lesson_24.part_1;

public class Singleton {

  public static void main(String[] args) {

    DataBase dataBase1 = DataBase.getInstance();
    DataBase dataBase2 = DataBase.getInstance();
    System.out.println("//////////***********///////////");
    System.out.println(dataBase1.equals(dataBase2));
    System.out.println(dataBase1.getName());
    System.out.println(dataBase2.getName());
    dataBase1.setName("Java");
    System.out.println(dataBase1.getName());
    System.out.println(dataBase2.getName());
    System.out.println(dataBase1.equals(dataBase2));
    System.out.println("//////////***********///////////");
  }

}


class DataBase {

  private static String name = "Oracle";
  private static DataBase base;

  private DataBase() {}

  public static DataBase getInstance() {
    if (base == null) {
      base = new DataBase();
      return base;
//      return new DataBase();
    } else {
      return base;
    }
  }

  public String getName() {
    return name;
  }

  public DataBase getBase() {
    return base;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBase(DataBase base) {
    this.base = base;
  }
}