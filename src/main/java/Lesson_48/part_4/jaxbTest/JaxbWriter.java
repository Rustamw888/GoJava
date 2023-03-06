package Lesson_48.part_4.jaxbTest;

import javax.xml.bind.JAXBContext;

public class JaxbWriter {

  public static void main(String[] args) {
    JAXBContext context = JAXBContext.newInstance(Persons.class);
  }

}
