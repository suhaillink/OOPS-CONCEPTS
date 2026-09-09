package three.abstraction;

 public class SavingAccount extends BankAccount{

     @Override
     public void deposit(double amount) {
        System.out.printf("Deposited $%.2f%n",amount);
     }

     @Override
     public void withdraw(double amount) {
        System.out.printf("Withdrawing $%.2f%n",amount);
     }
 }
