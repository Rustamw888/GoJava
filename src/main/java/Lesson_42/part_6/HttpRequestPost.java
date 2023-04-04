package Lesson_42.part_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestPost {

  public static void main(String[] args) {

    String urlAddress = "http://httpbin.org/post";
    URL url;
    HttpURLConnection httpURLConnection;
    OutputStream os = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    StringBuilder stringBuilder = new StringBuilder();

    try {
      Map<String, String> postargs = new HashMap<>();
      postargs.put("user", "Dima");
      postargs.put("password", "Zalupovec");

      byte[] out = postargs.toString().getBytes();

      url = new URL(urlAddress);
      httpURLConnection = (HttpURLConnection) url.openConnection();
      httpURLConnection.setRequestMethod("POST");
      httpURLConnection.setDoOutput(true);
      httpURLConnection.setDoInput(true);

      httpURLConnection.addRequestProperty("User-Agent", "Chrome/112.0.5615.50");
      httpURLConnection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");

      httpURLConnection.setConnectTimeout(200);
      httpURLConnection.setReadTimeout(200);
      httpURLConnection.connect();

      try {
        os = httpURLConnection.getOutputStream();
        os.write(out);
      } catch (Exception e) {
        System.err.print(e.getMessage());
      }
      if (HttpURLConnection.HTTP_OK == httpURLConnection.getResponseCode()) {
        isr = new InputStreamReader(httpURLConnection.getInputStream());
        br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
          stringBuilder.append(line);
        }
      }

//      System.out.println(stringBuilder);
      System.out.println(stringBuilder.substring(0, 150));
    } catch (ProtocolException e) {
      throw new RuntimeException(e);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        isr.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      try {
        br.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      try {
        os.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
