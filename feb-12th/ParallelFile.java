import java.util.concurrent.*;

public class ParallelFile {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            int file = i;
            executor.execute(() -> {
                try {
                    Thread.sleep(3000);
                    System.out.println("Processed file " + file + " by " + Thread.currentThread().getName());
                } catch (Exception e) {}
            });
        }

        executor.shutdown();
    }
}
