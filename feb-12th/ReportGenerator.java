import java.util.*;
import java.util.concurrent.*;

class ReportGenerator {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            int id = i;
            tasks.add(() -> {
                Thread.sleep(1000);
                return "Report " + id + " generated";
            });
        }

        List<Future<String>> results = service.invokeAll(tasks);

        for (Future<String> f : results) {
            System.out.println(f.get());
        }
        service.shutdown();
    }
}

