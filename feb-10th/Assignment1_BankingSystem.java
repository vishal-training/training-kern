import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

abstract class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > getBalance())
            throw new InsufficientBalanceException("Insufficient Balance");
        setBalance(getBalance() - amount);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}

public class Assignment1_BankingSystem {
    public static void main(String[] args) throws Exception {
        Map<String, BankAccount> map = new HashMap<>();
        BankAccount a = new SavingsAccount("101", 5000);
        BankAccount b = new CurrentAccount("102", 2000);
        map.put("101", a);
        map.put("102", b);
        a.withdraw(1000);
        b.withdraw(3000);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
    }
}
