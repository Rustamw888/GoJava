package Lesson_42.part_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpRequestTest {

  public static void main1(String[] args) {
    String urlAddress = "http://google.com";
    HttpURLConnection connection = null;
    URL url = null;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {
      url = new URL(urlAddress);
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setConnectTimeout(200);
      connection.setReadTimeout(200);
      connection.connect();
      isr = new InputStreamReader(connection.getInputStream());
      br = new BufferedReader(isr);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
        System.out.println("---------------");
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
    String urlAddress = "http://google.com";
    HttpURLConnection connection;
    URL url;
    InputStreamReader isr = null;
    BufferedReader br = null;

    try {
      url = new URL(urlAddress);
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.setConnectTimeout(200);
      connection.setReadTimeout(200);
      connection.connect();
      if(HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
        isr = new InputStreamReader(connection.getInputStream());
        br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
          System.out.println(line);
          System.out.println("---------------");
        }
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
