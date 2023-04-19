package Lesson_54;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

  public static void main(String[] args) {

    TextChat chat = new TextChat();
    Client client1 = new User(chat, 1);
    Client client2 = new User(chat, 2);
    Client client3 = new User(chat, 3);
    Client client4 = new User(chat, 4);
    Client client5 = new User(chat, 5);
    chat.addClient(client1);
    chat.addClient(client2);
    chat.addClient(client3);
    chat.addClient(client4);

    client5.sendMessage("Hello. I am client");
  }
}

interface Chat {
  void sendMessage(String text, Client client);
}

interface Client {
  void printMessage(String text);
  void sendMessage(String text);
}

class TextChat implements Chat {

  private List<Client> clients = new ArrayList<>();
  void addClient(Client client) {
    clients.add(client);
  }
  @Override
  public void sendMessage(String text, Client client) {
    for (Client client1 : clients) {
      if (client1 != client) {
        client1.printMessage(text);
      }
    }
  }
}

class User implements Client {

  private Chat chat;
  private int id;
  User(Chat chat, int id) {
    connectToChat(chat);
    this.id = id;
  }
  void connectToChat(Chat chat) {
    this.chat = chat;
  }

  @Override
  public void printMessage(String text) {
    System.out.printf("User id: %s ", this.id);
    System.out.println(text);
  }

  @Override
  public void sendMessage(String text) {
    chat.sendMessage(text, this);
  }
}
