public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Gerardo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Gerardo\") = " + nombre.equals("Gerardo"));
        System.out.println("nombre.equals(\"gerardo\") = " + nombre.equals("gerardo"));
        System.out.println("nombre.equalsIgnoreCase(\"gerardo\") = " + nombre.equalsIgnoreCase("gerardo"));
        System.out.println("nombre.compareTo(\"Gerardo\") = " + nombre.compareTo("Gerardo"));
        System.out.println("nombre.compareTo(\"Rolando\") = " + nombre.compareTo("Rolando"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(6) = " + nombre.charAt(6));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,6) = " + nombre.substring(1,6));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length() - 2));

        System.out.println("------------------------------------------------------------------------");

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas = " + trabalenguas.contains("r"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith(\"t\") = " + trabalenguas.endsWith("t"));
        String palabraConEspacios = "   Hola   ";
        System.out.println("palabraConEspacios = " + palabraConEspacios);
        System.out.println("palabraConEspacios.trim() = " + "[" + palabraConEspacios.trim() + "]");
    }
}
