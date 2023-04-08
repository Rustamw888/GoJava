package Lesson_46.part_1;

//public class InerTest {
//
//  public static void main(String[] args) {
//    Ниаткусик ниаткусик = new Ниаткусик();
//    System.out.println(ниаткусик.Дима);
//  }
//}
//
//class Ниаткусик {
//  String Дима = "Залуповец";
//
//}

import java.util.ArrayList;

public class InerTest {

  public static void main(String[] args) {

    Invoice invoice1 = new Invoice();
    Invoice invoice2 = new Invoice();
    invoice1.show();
    invoice1.addItem("Apple", 10, 1);
    invoice1.addItem("Carrot", 10, 2);
    invoice1.addItem("Egg", 20, 1);

    invoice1.show();
    invoice2.show();

    Invoice.Item item2 = new Invoice.Item();
    System.out.println(item2);
  }
}

class Invoice {

  public static class Item {
    String description;
    int quantity;
    double price;

    double getPrice() {
      return quantity * price;
    }

    @Override
    public String toString() {
      return "Item{" +
          "description='" + description + '\'' +
          ", quantity=" + quantity +
          ", price=" + price +
          ", Summa=" + getPrice() +
          '}';
    }
  }

  private ArrayList<Item> items = new ArrayList<>();

  public void addItem(String description, int quantity, double price) {
    Item newItem = new Item();
    newItem.description = description;
    newItem.quantity = quantity;
    newItem.price = price;
    items.add(newItem);
  }

  public void show() {
    System.out.println(items);
  }
}

class Network {
  public class Member {
    private String name;
    private ArrayList<Member> friends;

    public Member(String name) {
      this.name = name;
      friends = new ArrayList<>();
    }
  }

  private ArrayList<Member> members = new ArrayList<>();

  public Member enroll(String name) {
    Member newMember = new Member(name);
    members.add(newMember);
    return newMember;
  }
}