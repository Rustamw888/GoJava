package Lesson_48.part_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// это класс java pojo или java bean
@XmlRootElement
public class Employee {
  private String name;
  private int number;
  private int age;
  private String mail;
  private String city;

  @XmlElement
  public void setName(String name) {
    this.name = name;
  }
  @XmlElement
  public void setNumber(int number) {
    this.number = number;
  }
  @XmlElement
  public void setAge(int age) {
    this.age = age;
  }
  @XmlElement
  public void setMail(String mail) {
    this.mail = mail;
  }
  @XmlElement
  public void setCity(String city) {
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public int getAge() {
    return age;
  }

  public String getMail() {
    return mail;
  }

  public String getCity() {
    return city;
  }
}
