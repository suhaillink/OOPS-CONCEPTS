package three.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(500);
        savingAccount.withdraw(200);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(500);
        currentAccount.withdraw(200);
    }
}
