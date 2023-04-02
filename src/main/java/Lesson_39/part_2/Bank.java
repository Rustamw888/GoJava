package Lesson_39.part_2;

public class Bank {

  Command command;

  void operation(BankAccount account, int amount) {
    if (amount < 0) {
      command = new WithDraw(account, Math.abs(amount));
    }
    if (amount >= 0) {
      command = new Replenishment(account, amount);
    }
    command.executed();
  }

  public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("Andrey Petrovich");
    BankAccount bankAccount2 = new BankAccount("Olga Andreevna");

    System.out.printf("Balance mt/mrs: %s = %s dollars\n", bankAccount1.getFullName(), bankAccount1.getBalance());
    System.out.printf("Balance mt/mrs: %s = %s dollars\n", bankAccount2.getFullName(), bankAccount2.getBalance());
    System.out.println("---------------------------------------------");

    Bank bank = new Bank();
    bank.operation(bankAccount1, 1000);
    System.out.printf("Balance mt/mrs: %s = %s dollars\n", bankAccount1.getFullName(), bankAccount1.getBalance());
    System.out.printf("Balance mt/mrs: %s = %s dollars\n", bankAccount2.getFullName(), bankAccount2.getBalance());

  }
}
