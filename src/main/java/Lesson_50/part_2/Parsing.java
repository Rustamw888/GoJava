package Lesson_50.part_2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parsing {

  public static void main(String[] args) throws IOException {
    Document document = Jsoup.connect("https://seas.harvard.edu/electrical-engineering/people").get();
    Elements elements = document.select("img");
    List<String> str = new ArrayList<>();
    for (Element element : elements) {
      String[] s = element.attr("data-srcset").split(" ");
      System.out.printf("https://seas.harvard.edu/%s\n", s[0]);
      String url = String.format("https://seas.harvard.edu/%s\n", s[0]);
    }
  }

}
