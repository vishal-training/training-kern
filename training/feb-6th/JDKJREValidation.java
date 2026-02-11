import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

class JDKJREValidation {

    public static void main(String[] args) {

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        if (compiler == null) {
            System.out.println("JDK NOT FOUND");
            System.out.println("Only JRE is installed.");
            System.out.println("JRE can run Java programs but cannot compile them.");
            System.out.println("JDK includes the compiler and is required for compilation.");
        } else {
            System.out.println("JDK FOUND");
            System.out.println("JDK allows both compilation and execution of Java programs.");
            System.out.println("JRE is only used for running compiled programs.");
        }
    }
}

