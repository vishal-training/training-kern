class DeadlockPrevention {
    static final Object paymentLock = new Object();
    static final Object inventoryLock = new Object();

    static void process() {
        Object first = paymentLock;
        Object second = inventoryLock;

        synchronized (first) {
            synchronized (second) {
                System.out.println(Thread.currentThread().getName() + " processed safely");
            }
        }
    }

    public static void main(String[] args) {
        Runnable task = DeadlockPrevention::process;
        new Thread(task).start();
        new Thread(task).start();
    }
}
