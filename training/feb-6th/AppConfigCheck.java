public class AppConfigCheck {

    public static void main(String[] args) {

        int maxUsers = 150;
        double threshold = 99.9;
        boolean feature = true;
        String environment = "PRODUCTION";

        System.out.println("Environment: " + environment);
        System.out.println("Max Users: " + maxUsers);
        System.out.println("Threshold: " + threshold);
        System.out.println("Feature Enabled: " + feature);

        if (maxUsers > threshold) {
            System.out.println("WARNING: Max users exceeded the threshold!");
        }

        if (!feature) {
            System.out.println("WARNING: Feature is disabled!");
        }
    }
}
