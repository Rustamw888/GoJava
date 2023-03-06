package Lesson_48.part_4.jaxbTest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) // доступ к полям, не нужны геттеры
@XmlType(name = "person", propOrder = {
    "name",
    "telephone",
    "address"
}) // задание последовательности элементов XML
public class Person {
  @XmlAttribute(required = true)
//  @XmlJavaTypeAdapter(CollapsedStringAdapter.class) // отвечает за обработку данных
//  (н-р, будет удалять лишние пробелы, настройки и т.д.)
//  @XmlID //уникальность поля
  private String login;

  @XmlElement(required = true)
  private String name;

  @XmlAttribute(required = true) // обязательность поля
  private String faculty;

  @XmlElement(required = true)
  private int telephone;

  @XmlElement(required = true)
  private Address address = new Address();

  public Person() {} // необходим для маршализации / демаршализации XML

  public Person(String login, String name, String faculty, int telephone, Address address) {
    this.login = login;
    this.name = name;
    this.faculty = faculty;
    this.telephone = telephone;
    this.address = address;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public void setTelephone(int telephone) {
    this.telephone = telephone;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getLogin() {
    return login;
  }

  public String getName() {
    return name;
  }

  public String getFaculty() {
    return faculty;
  }

  public int getTelephone() {
    return telephone;
  }

  public Address getAddress() {
    return address;
  }

  public String toString() {
    return "\nLogin: " + login + "\nName: " + name + "\nTelephone: " + telephone
        + "\nFaculty: " + faculty + address.toString();
  }

  @XmlRootElement
  @XmlType(name = "address", propOrder = {
      "country",
      "city",
      "street"
  })
  public static class Address { // внутренний класс

    private String country;
    private String city;
    private String street;

    public Address() {} // необходим для маршализации / демаршализации XML

    public Address(String country, String city, String street) {
      this.country = country;
      this.city = city;
      this.street = street;
    }

    public void setCountry(String country) {
      this.country = country;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public void setStreet(String street) {
      this.street = street;
    }

    public String getCountry() {
      return country;
    }

    public String getCity() {
      return city;
    }

    public String getStreet() {
      return street;
    }

    public String toString() {
      return "\nAddress:" + "\n\tCountry: " + country
          + "\n\tCity: " + city + "\n\tStreet: " + street + "\n";
    }

  }
}
