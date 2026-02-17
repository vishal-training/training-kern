import java.util.*;
import java.util.concurrent.*;

public class BankingBatchProcessing {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Future<Double>> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int acc = i;
            Callable<Double> task = () -> acc * 1000 * 0.05;
            list.add(service.submit(task));
        }

        for (Future<Double> f : list) {
            System.out.println("Interest: " + f.get());
        }

        service.shutdown();
    }
}

