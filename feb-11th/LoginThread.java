class LoginThread extends Thread {
    public LoginThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " START at " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(getName() + " LOGIN SUCCESS");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            LoginThread t = new LoginThread("User-" + i);
            System.out.println(t.getName() + " state before: " + t.getState());
            t.start();
            System.out.println(t.getName() + " state after: " + t.getState());
        }
    }
}
