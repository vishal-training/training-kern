class Ticket {
    int tickets = 10;

    synchronized void book() {
        if (tickets > 0) {
            tickets--;
            System.out.println(Thread.currentThread().getName() + " booked ticket. Left: " + tickets);
        }
    }

    public static void main(String[] args) {
        Ticket t = new Ticket();
        for (int i = 1; i <= 5; i++) {
            new Thread(() -> t.book(), "User-" + i).start();
        }
    }
}

