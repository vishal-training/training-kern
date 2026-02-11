class AccessValidator {

    public static void main(String[] args) {

        int age = 20;
        boolean hasValidId = true;
        boolean hasActiveSubscription = false;

        if (age >= 18 && hasValidId && hasActiveSubscription) {
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}
