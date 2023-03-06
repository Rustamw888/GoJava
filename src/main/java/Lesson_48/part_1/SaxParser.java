package Lesson_48.part_1;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParser {

  /**
   * 1. Указываем файл, который хотим распарсить
   * 2. Создаем экземпляр фабрики парсера, через статический метод (пока ничего не умеет делать,
   * поэтому создаем у фабрики парсер)
   * 3. Оборачиваем в try catch (горячие клавиши, выделить текст ctrl + alt +T
   * 4. Создаем SAXParser и в него кладем фабрику, у которой вызван метод newSAXParser(); и получаем
   * парсер, который умеет читать xml документ
   * 5. Перебор тэгов, ненужное выбрасываем, DefaultHandler это слушатель, который с нужными
   * тэгами будет делать, то что мы пропишем в него, т.е. метод parse принимает путь к файлу и
   * слушателя и передает в него тэги по итерации.
   * 6. Метод startElement (могут быть переопределены хоть все из DefaultHandler,
   * принимает параметры, которые передает ему парсер (каждую строчку)
   *
   * @param args
   */
  public static void main(String[] args) {
    final String fileName = "src/main/java/ru/qamilord/xml/students.xml";

    SAXParserFactory factory = SAXParserFactory.newInstance();

    try {
      SAXParser saxParser = factory.newSAXParser();
      DefaultHandler handler = new DefaultHandler() {
        boolean name = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
          if (qName.equalsIgnoreCase("phone_number")) {
            name = true;
          }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
          if (name) {
            System.out.printf("phone_number: %s\n", new String(ch, start, length));
            name = false;
          }
        }
      };
      saxParser.parse(fileName, handler);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
