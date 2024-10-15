import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno/ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path1 = System.getenv("Path");
        System.out.println("path = " + path1);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        /*Se pueden crear variables de entorno desde la consola usando el comando:
        * 'setx' seguido del nombre (en mayúsculas y separado por '_' en caso de ser palabra compuesta, y
        * este seguido de su valor (debe ir entre comillas si es más de una palabra).
        * Ejemplo:
        * setx SLUDAR_HOLA "Hola mundo, cómo están?"*/
        //Investigar para qué sirven las variables de ambiente

        System.out.println("----------------------------------------------");

        System.out.println("----- Listando variables de entorno del sistema -----");
        for (String key: varEnv.keySet()){
            System.out.println(key + " -> " + varEnv.get(key));
        }
    }
}
