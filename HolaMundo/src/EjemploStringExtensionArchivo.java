public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String extensionArchivo1 = "alguna-imagen.jpg";
        int i = extensionArchivo1.indexOf('.');
        System.out.println("extensionArchivo1.length() = " + extensionArchivo1.length());
        System.out.println("extensionArchivo1 = " + extensionArchivo1.substring(i));

        String extensionArchivo2 = "algun-archivo.txt";
        int j = extensionArchivo2.lastIndexOf('.');
        System.out.println("extensionArchivo2.length() = " + extensionArchivo2.length());
        System.out.println("extensionArchivo2 = " + extensionArchivo2.substring(j));
    }
}
