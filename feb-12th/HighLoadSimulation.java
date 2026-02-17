import java.util.concurrent.*;

class HighLoadSimulation {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100; i++) {
            service.execute(() -> {
                try { Thread.sleep(200); } catch (Exception e) {}
            });
        }

        service.shutdown();
        service.awaitTermination(5, TimeUnit.MINUTES);

        long end = System.currentTimeMillis();
        System.out.println("Time Taken: " + (end - start) + " ms");
    }
}

