package Lesson_48.part_4.jaxbTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.sql.rowset.spi.XmlReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbReader {

  public static void main(String[] args) {

    try {
      JAXBContext context = JAXBContext.newInstance(Persons.class);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      FileReader reader = new FileReader("src/main/java/Lesson_48/part_4/jaxbTest/person1.xml");

      Persons persons = (Persons) unmarshaller.unmarshal(reader); // сопоставь содержимое файла с классом Persons
      System.out.println("persons = " + persons); // переопределенный метод

    } catch (JAXBException e) {
      throw new RuntimeException(e);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

}
