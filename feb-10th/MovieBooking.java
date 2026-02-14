class Theatre {
    int seats = 5;

    synchronized void book() {
        if (seats > 0) {
            seats--;
            System.out.println("Booked");
        } else {
            System.out.println("Full");
        }
    }
}

class User extends Thread {
    Theatre t;
    User(Theatre t) {
        this.t = t;
    }
    public void run() {
        t.book();
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Theatre t = new Theatre();
        new User(t).start();
        new User(t).start();
        new User(t).start();
    }
}

