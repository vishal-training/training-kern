class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 0) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1500);

        System.out.println("Balance: " + account.getBalance());
    }
}

