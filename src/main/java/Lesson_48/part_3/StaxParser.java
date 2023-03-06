package Lesson_48.part_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxParser {

  /**
   * StaxParser не создает структуру документа, а читает по элементам.
   * В отличии от Sax парсера, он основан на основе стрима.
   * Документ формируется в виде потока.
   * Может читать StaxParser
   * Самой функции парс при этом нет
   * @param args
   */
  public static void main(String[] args) {

    final String fileName = "src/main/java/Lesson_48/part_3/shop.xml";

    try {
      XMLStreamReader xmlReader = XMLInputFactory.newInstance()
          .createXMLStreamReader(fileName, new FileInputStream(fileName));

      while (xmlReader.hasNext()) {
        xmlReader.next();
        if (xmlReader.isStartElement()) {
          System.out.println(xmlReader.getLocalName());
        } else if (xmlReader.isEndElement()) {
          System.out.println("/" + xmlReader.getLocalName());
        } else if (xmlReader.hasText() && xmlReader.getText().trim().length() > 0) {
          System.out.println("    " + xmlReader.getText());
        }
      }
    } catch (FileNotFoundException | XMLStreamException ex) {
      ex.printStackTrace();
    }

  }

}
