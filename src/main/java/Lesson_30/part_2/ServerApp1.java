package Lesson_30.part_2;

import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp1 {

//  public static void main(String[] args) throws IOException {
//    HttpServer server = HttpServer.create();
//    server.bind(new InetSocketAddress(1234), 0);
//    server.createContext("/", httpExchange -> {
//      String text = "<HTML>some messages</HTML>";
//      httpExchange.sendResponseHeaders(200, text.length());
//      OutputStream os = httpExchange.getResponseBody();
//      os.write(text.getBytes());
//      os.close();
//    });
//    server.start();
//  }


//  public static void main(String[] args) {
//
//    try (ServerSocket server = new ServerSocket(1234)) {
//      System.out.println("Server1 started...");
//      while (true) {
//        try (Socket socket = server.accept();
//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(socket.getInputStream()));
//            PrintWriter writer = new PrintWriter(socket.getOutputStream())
//        ) {
//          System.out.println("Client connected");
//          String request = reader.readLine();
//          String[] str = request.split(" ");
//
//          String response = String.format("Hello, your request = %s",
//              str[1].substring(1));
//
//          writer.format("<p>%s<p>", response);
//          writer.flush();
//        } catch (Exception e) {
//          e.printStackTrace();
//        }
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }

  private static Socket clientSocket; //сокет для общения
  private static ServerSocket server; // серверсокет
  private static BufferedReader in; // поток чтения из сокета
  private static BufferedWriter out; // поток записи в сокет

  public static void main(String[] args) {
    try {
      try  {
        server = new ServerSocket(4004); // серверсокет прослушивает порт 4004
        System.out.println("Сервер запущен!"); // хорошо бы серверу
        //   объявить о своем запуске
        clientSocket = server.accept(); // accept() будет ждать пока
        //кто-нибудь не захочет подключиться
        try { // установив связь и воссоздав сокет для общения с клиентом можно перейти
          // к созданию потоков ввода/вывода.
          // теперь мы можем принимать сообщения
          in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
          // и отправлять
          out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

          String word = in.readLine(); // ждём пока клиент что-нибудь нам напишет
          System.out.println(word);
          // не долго думая отвечает клиенту
          out.write("Привет, это Сервер! Подтверждаю, вы написали : " + word + "\n");
          out.flush(); // выталкиваем все из буфера

        } finally { // в любом случае сокет будет закрыт
          clientSocket.close();
          // потоки тоже хорошо бы закрыть
          in.close();
          out.close();
        }
      } finally {
        System.out.println("Сервер закрыт!");
        server.close();
      }
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
