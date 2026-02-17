import java.util.concurrent.*;

public class ScheduledCleanupJob {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
            () -> System.out.println("Cleanup running by " + Thread.currentThread().getName()),
            0, 5, TimeUnit.SECONDS
        );

        Thread.sleep(16000);
        scheduler.shutdown();
    }
}
