import java.util.concurrent.*;

class ATM {
    static int balance = 1000;

    static synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + " balance " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            service.execute(() -> withdraw(300));
        }
        service.shutdown();
    }
}


