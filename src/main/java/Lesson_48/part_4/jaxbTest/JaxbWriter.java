package Lesson_48.part_4.jaxbTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JaxbWriter {

  public static void main(String[] args) {
    try {
      JAXBContext context = JAXBContext.newInstance(Persons.class);

      Marshaller marshaller = context.createMarshaller();

      Persons persons = new Persons() {
        {
          Person.Address address = new Person.Address(
              "The USA",
              "New York",
              "5th Manhattan"
          );
          Person person = new Person(
              "george",
              "Rassel",
              "MHM",
              2095306,
              address
          );
          this.add(person); // добавление первого человека
          address = new Person.Address(
              "Mexico",
              "Mexico city",
              "23th Simona st."
          );
          person = new Person(
              "cheko",
              "Peres",
              "OPO",
              2345386,
              address
          );
          this.add(person); // добавление второго человека
        }
      };

      marshaller.marshal(persons, new FileOutputStream("src/main/java/Lesson_48/part_4/jaxbTest/person111.xml"));

      System.out.println("XML-файл создан");
    } catch (JAXBException e) {
      System.out.println("JAXB-контекст ошибочен: " + e);
    } catch (FileNotFoundException e) {
      System.out.println("XML-файл не может быть создан: " + e);
    }

  }

}
