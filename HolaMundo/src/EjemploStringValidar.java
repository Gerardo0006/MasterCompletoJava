public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = " "; //Programación Java
        }

        boolean esVacio1 = curso.length() == 0;

        System.out.println("esVacio = " + esVacio1);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean espacioBlanco = curso.isBlank();
        System.out.println("espacioBlanco = " + espacioBlanco);

        if (!espacioBlanco){//if (!esVacio1){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }

    }
}
