class Order implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " validating");
        System.out.println(Thread.currentThread().getName() + " payment processed");
        System.out.println(Thread.currentThread().getName() + " completed");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new Order(), "Order-" + i);
            t.start();
        }
    }
}

