package Lesson_30.part_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientApp {

    public static void main1(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 8080);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ){
            writer.write("Hello, I am client");
            writer.newLine();
            writer.flush();
            String response = reader.readLine();
            System.out.println(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket("localhost", 8080);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ){
            for (int i = 0; i < 8; i++) {
                writer.write("Hello, I am client");
                writer.newLine();
                writer.flush();
                String response = reader.readLine();
                System.out.println(response);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
