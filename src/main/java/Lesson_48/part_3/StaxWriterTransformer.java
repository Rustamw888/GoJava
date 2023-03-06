package Lesson_48.part_3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class StaxWriterTransformer {

  /**
   * Запись с переносом строки
   * @param args
   */

  public static void main(String[] args) {

    try {

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      // write XML to ByteArrayOutputStream
      writeXml(out);

      // Java 10
      //String xml = out.toString(StandardCharsets.UTF_8);

      // standard way to convert byte array to String
      String xml = new String(out.toByteArray(), StandardCharsets.UTF_8);

      // System.out.println(formatXML(xml));

      String prettyPrintXML = formatXML(xml);

      // print to console
      // System.out.println(prettyPrintXML);

      // Java 11 - write to file
      Files.writeString(Paths.get("src/main/java/Lesson_48/part_3/result.xml"),
          prettyPrintXML, StandardCharsets.UTF_8);

      // Java 7 - write to file
      //Files.write(Paths.get("/home/mkyong/test.xml"),
      //    prettyPrintXML.getBytes(StandardCharsets.UTF_8));

      // BufferedWriter - write to file
            /*try (FileWriter writer = new FileWriter("/home/mkyong/test.xml");
                 BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(xml);
            } catch (IOException e) {
                e.printStackTrace();
            }*/

    } catch (TransformerException | XMLStreamException | IOException e) {
      e.printStackTrace();
    }

  }

  // StAX Cursor API
  private static void writeXml(OutputStream out) throws XMLStreamException {

    XMLOutputFactory output = XMLOutputFactory.newInstance();

    XMLStreamWriter writer = output.createXMLStreamWriter(out);

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

  }

  private static String formatXML(String xml) throws TransformerException {

    // write data to xml file
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();

    // pretty print by indention
    transformer.setOutputProperty(OutputKeys.INDENT, "yes");

    // add standalone="yes", add line break before the root element
    transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

    StreamSource source = new StreamSource(new StringReader(xml));
    StringWriter output = new StringWriter();
    transformer.transform(source, new StreamResult(output));

    return output.toString();

  }

}
