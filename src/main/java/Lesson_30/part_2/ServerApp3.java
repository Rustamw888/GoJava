package Lesson_30.part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp3 {

  public static void main(String[] args) {

    try (ServerSocket server = new ServerSocket(1234)) {
      System.out.println("Server3 started...");
      while (true) {
        try (Socket socket = server.accept();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream())
        ) {
          System.out.println("Client connected");

          for (int i = 0; i < 11; i++) {
            String request = reader.readLine();
            String response = String.format("Hello, your request = %s", request);
            Thread.sleep(500);
            System.out.println(response);
            writer.format("<p>%s<p>", response);
            writer.flush();
          }

        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
