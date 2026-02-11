class JavaEnvironmentCheck{
    public static void main(String[] args){
        String javaVersion=System.getProperty("java.version");
        String javaVendor=System.getProperty("java.vendor");
         String osName = System.getProperty("os.name");
        String osArch = System.getProperty("os.arch");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("JVM Vendor: " + javaVendor);
        System.out.println("OS Name: " + osName);
        System.out.println("OS Architecture: " + osArch);
    }
}