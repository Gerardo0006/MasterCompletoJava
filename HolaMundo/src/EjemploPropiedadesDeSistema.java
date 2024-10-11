import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        String lineSeparator1 = System.getProperty("line.separator");
        System.out.println("lineSeparator1: " + lineSeparator1 + "lineSeparator1 es un salto de línea");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2 + "lineSeparator2 también es un salto de línea pero usando directamente el método de la clase de la manera System.lineSeparator()");

        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
    }
}
