package Lesson_57.part_4;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("CLIENT_TYPE")
public class Client extends Human {

  private int balance;

  public Client() {}

  public Client(String name, int age, int balance) {
    super(name, age);
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Client{" +
        "balance=" + balance +
        '}';
  }
}
