class ApiRetryMechanism {

    public static void main(String[] args) {

        int maxRetries = 3;
        int attempt = 1;
        boolean success = false;

        while (attempt <= maxRetries) {

            System.out.println("API Call Attempt: " + attempt);

            if (attempt == 2) {   // simulate success on 2nd attempt
                success = true;
                System.out.println("API Call Successful");
                break;
            } else {
                System.out.println("API Call Failed");
            }

            attempt++;
        }

        if (!success) {
            System.out.println("API Failed After Maximum Retries");
        }
    }
}

