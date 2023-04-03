package Lesson_42.part_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionTest {

  public static void main1(String[] args) {
    String urlAddress = "http://google.com";
    URLConnection urlConnection;
    URL url;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {
      url = new URL(urlAddress);
      urlConnection = url.openConnection();
      isr = new InputStreamReader(urlConnection.getInputStream());
      br = new BufferedReader(isr);
      String line;
      while ((line = br.readLine()) != null) {
//        System.out.println(br.readLine());
        System.out.println(line);
        System.out.println("------------------------");
      }
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        isr.close();
        br.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

  }

  public static void main(String[] args) {
    String urlAddress = "https://finance.yahoo.com/quote/%5EGSPC?p=%5EGSPC";
    URLConnection urlConnection;
    URL url;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {
      url = new URL(urlAddress);
      urlConnection = url.openConnection();
      isr = new InputStreamReader(urlConnection.getInputStream());
      br = new BufferedReader(isr);
      String line;
      while ((line = br.readLine()) != null) {
//        System.out.println(br.readLine());
        System.out.println(line);
        System.out.println("------------------------");
      }
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        isr.close();
        br.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

  }
}
