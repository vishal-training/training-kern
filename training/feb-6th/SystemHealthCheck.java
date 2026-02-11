class SystemHealthCheck {

    public static void main(String[] args) {

        double usedCpu = 65;
        double totalCpu = 100;

        double usedMemory = 7000;
        double totalMemory = 8000;

        double cpuUsage = (usedCpu / totalCpu) * 100;
        double memoryUsage = (usedMemory / totalMemory) * 100;

        System.out.println("CPU Usage: " + cpuUsage + "%");
        System.out.println("Memory Usage: " + memoryUsage + "%");

        String cpuStatus = cpuUsage < 80 ? "HEALTHY" : "CRITICAL";
        String memoryStatus = memoryUsage < 75 ? "HEALTHY" : "CRITICAL";

        System.out.println("CPU Status: " + cpuStatus);
        System.out.println("Memory Status: " + memoryStatus);
    }
}
