import java.util.concurrent.*;

public class ProducerConsumerSystem {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable producer = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced Order " + i);
                } catch (Exception e) {}
            }
        };

        Runnable consumer = () -> {
            while (true) {
                try {
                    System.out.println("Consumed Order " + queue.take());
                } catch (Exception e) {
                    break;
                }
            }
        };

        executor.execute(producer);
        executor.execute(consumer);

        Thread.sleep(3000);
        executor.shutdownNow();
    }
}

