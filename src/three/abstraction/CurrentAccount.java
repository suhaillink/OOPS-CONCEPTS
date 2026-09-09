package three.abstraction;

public class CurrentAccount extends BankAccount{
    @Override
    public void deposit(double amount) {
        System.out.printf("Depositing $%.2f%n",amount);
    }

    @Override
    public void withdraw(double amount) {
    System.out.printf("Withdrawing $%.2f%n",amount);
    }
}
