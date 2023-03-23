package Lesson_24.part_3;

public class Person {

  private int id;
  private String name;
  private String address;
  private int phone;
  private static int number = 1;

  public Person() {
    setId(number);
    number++;
  }

  public Person(int id, String name, String address, int phone) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public int getPhone() {
    return phone;
  }

  private void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", phone=" + phone +
        '}';
  }
}
