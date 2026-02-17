import java.util.concurrent.*;

public class ApiRequestSystem {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            int req = i;
            pool.execute(() ->
                System.out.println(Thread.currentThread().getName() + " handling API request " + req)
            );
        }

        pool.shutdown();
    }
}

