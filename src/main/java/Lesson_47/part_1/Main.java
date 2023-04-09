package Lesson_47.part_1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
  public static void main(String[] args) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    server.createContext("/", new MyHandler());
    server.setExecutor(null);
    server.start();
  }

  static class MyHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String str = "<h1>Hello. I am simply HTTPServer!</h1>";

      byte[] bytes = str.getBytes();
      exchange.sendResponseHeaders(200, bytes.length);

      OutputStream os = exchange.getResponseBody();
      os.write(bytes);
      os.close();
    }
  }
}
