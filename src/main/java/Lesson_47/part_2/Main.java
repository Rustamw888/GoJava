package Lesson_47.part_2;

import com.sun.net.httpserver.*;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

  public static void main(String[] args) throws IOException {
    HttpServer server = HttpServer.create();
    server.bind(new InetSocketAddress(8080), 0);

    HttpContext context1 = server.createContext("/info", new EchoHandler1());
    HttpContext context2 = server.createContext("/Java", new EchoHandler2());
    context1.setAuthenticator(new Auth());
    server.setExecutor(null);
    server.start();
  }

  static class Auth extends Authenticator {

    @Override
    public Result authenticate(HttpExchange httpExchange) {
      System.out.printf("httpExchange.getRequestURI().toString()=%s", httpExchange.getRequestURI().toString());
      if ("/info/forbidden".equals(httpExchange.getRequestURI().toString())) {
        System.out.println("403");
        return new Failure(403);
      } else {
        System.out.println("OK");
        return new Success(new HttpPrincipal("const", "realm"));
      }
    }
  }

  static class EchoHandler1 implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      StringBuilder builder = new StringBuilder();

      builder.append("<h1>URI: ").append(exchange.getRequestURI()).append("</h1>");
      Headers headers = exchange.getRequestHeaders();
      for (String s : headers.keySet()) {
        builder.append("<p>").append(s).append("=")
            .append(headers.getFirst(s)).append("</p>");
      }

      byte[] bytes = builder.toString().getBytes();
      exchange.sendResponseHeaders(200, bytes.length);

      OutputStream os = exchange.getResponseBody();
      os.write(bytes);
      os.close();
    }
  }

  static class EchoHandler2 implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String builder = "<p>Hello</p>";

      byte[] bytes = builder.toString().getBytes();
      exchange.sendResponseHeaders(200, bytes.length);

      OutputStream os = exchange.getResponseBody();
      os.write(bytes);
      os.close();
    }
  }
}
