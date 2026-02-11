class LoginTracker {

    static int totalLogins = 0;

    int sessionId;

    LoginTracker(int sessionId) {
        this.sessionId = sessionId;
        totalLogins++;
    }

    void showLoginInfo() {
        System.out.println("Session ID: " + sessionId);
        System.out.println("Total Logins: " + totalLogins);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        LoginTracker user1 = new LoginTracker(101);
        user1.showLoginInfo();

        LoginTracker user2 = new LoginTracker(102);
        user2.showLoginInfo();

        LoginTracker user3 = new LoginTracker(103);
        user3.showLoginInfo();
    }
}

