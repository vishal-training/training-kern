import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {}

class OrderService {
    @LogExecutionTime
    void placeOrder() {
        System.out.println("Order");
    }
}

class Logger {
    static void log(Object o) throws Exception {
        for (Method m : o.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long s = System.currentTimeMillis();
                m.invoke(o);
                long e = System.currentTimeMillis();
                System.out.println(e - s);
            }
        }
    }
}

public class MiniFramework {
    public static void main(String[] args) throws Exception {
        Logger.log(new OrderService());
    }
}

