package Lesson_39.part_2;

public class Replenishment implements Command {

  private BankAccount account;
  private int amount;

  public Replenishment(BankAccount account, int amount) {
    this.account = account;
    this.amount = amount;
  }

  @Override
  public void executed() {
    account.setBalance(account.getBalance() + amount);
  }
}
