package Lesson_48.part_1;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParser {

  /**
   * Dom делает, в отличии от Sax, объектную модель документа с помощью DocumentBuilder,
   * затем создаем файл и указываем путь к нему, потом передаем парсеру, который и запишет
   * в переменную Document doc
   *
   * Модель на документ состоит из нод (это наш тэг)
   * Затем с каждой нодой в цикле можно что-то сделать.
   * @param args
   */
  public static void main(String[] args) {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

    try {
      DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
      File file = new File("src\\main\\java\\ru\\qamilord\\xml\\books.xml");
      Document doc = documentBuilder.parse(file);
      NodeList nodeList = doc.getElementsByTagName("book");

      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);
        System.out.println(nodeList.item(i));
        System.out.println(node.getNodeName());
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
 