package Lesson_48.part_4;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbReader {

  public static void main(String[] args) {
    String fileUrl = "src/main/java/Lesson_48/part_4/employee.xml";
    File file = new File(fileUrl);

    try {
      JAXBContext context = JAXBContext.newInstance(Employee.class);
      Unmarshaller unmarshaller = context.createUnmarshaller();

      Employee employee1 = (Employee) unmarshaller.unmarshal(file);

      System.out.println(employee1.getName());
      System.out.println(employee1.getNumber());
      System.out.println(employee1.getAge());
      System.out.println(employee1.getMail());
      System.out.println(employee1.getCity());
    } catch (JAXBException e) {
      throw new RuntimeException(e);
    }
  }

}
