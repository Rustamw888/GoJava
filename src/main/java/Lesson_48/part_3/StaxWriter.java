package Lesson_48.part_3;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class StaxWriter {

  /**
   * Может записывать StaxWriter
   * В конце не забыть закрыть документ
   * @param args
   */
  public static void main(String[] args) {

    try {

      XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
      XMLStreamWriter writer = outputFactory.createXMLStreamWriter(
          new FileWriter("src/main/java/Lesson_48/part_3/result.xml"));

      // Открываем XML-документ и пишем корневой элемент BookCatalogue
      writer.writeStartDocument("1.0");
      writer.writeStartElement("BookCatalogue");

      // пишем комментарий
      writer.writeComment("This is comment");

      // Делаем цикл для книг
      for (int i = 0; i < 5; i++) {

        // Записываем Book
        writer.writeStartElement("Book");


        // Заполняем тэги для книги

        // Title
        writer.writeStartElement("Title");
        writer.writeCharacters("Book #" + i);
        writer.writeEndElement();


        // Author
        writer.writeStartElement("Author");
        writer.writeCharacters("Author #" + i);
        writer.writeEndElement();


        // Date
        writer.writeStartElement("Date");
        writer.writeCharacters(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        writer.writeEndElement();


        // ISBN
        writer.writeStartElement("ISBN");
        writer.writeCharacters("ISBN #" + i);
        writer.writeEndElement();


        // Publisher
        writer.writeStartElement("Publisher");
        writer.writeCharacters("Publisher #" + i);
        writer.writeEndElement();


        // Cost
        writer.writeStartElement("Cost");
        writer.writeAttribute("currency", "USD");
        writer.writeCharacters("" + (i + 10));
        writer.writeEndElement();


        // Закрываем тэг Book
        writer.writeEndElement();

      }

      // Закрываем корневой элемент
      writer.writeEndElement();

      // Закрываем XML-документ
      writer.writeEndDocument();
      writer.flush();
      writer.close();

    } catch (XMLStreamException | IOException ex) {
      ex.printStackTrace();
    }
  }

}
