package Lesson_48.part_4.jaxbTest;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persons {

  @XmlElement(name="person")
  private ArrayList<Person> personArrayList = new ArrayList<>();

  public Persons() {}

  public Persons(ArrayList<Person> personArrayList) {
    this.personArrayList = personArrayList;
  }

  public void setPersonList(ArrayList<Person> personArrayList) {
    this.personArrayList = personArrayList;
  }

  public ArrayList<Person> getPersonList() {
    return personArrayList;
  }

  public boolean add(Person person) {
    return personArrayList.add(person);
  }

  @Override
  public String toString() {
    return "Persons [personArrayList= " + personArrayList + "]";
  }

}
