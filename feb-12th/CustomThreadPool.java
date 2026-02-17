import java.util.concurrent.*;

class CustomThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(
                        5,
                        10,
                        60,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(10)
                );

        for (int i = 1; i <= 30; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " Task " + taskId);
                try { Thread.sleep(1000); } catch (Exception e) {}
            });
        }
        executor.shutdown();
    }
}
