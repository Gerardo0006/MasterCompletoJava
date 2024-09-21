public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        String detalle1 = curso + " con el instructor " + profesor;
        System.out.println(detalle1);

        int numA = 10;
        int numB = 5;

        System.out.println(detalle1 + numA + numB);
        System.out.println(detalle1 + (numA+numB));
        System.out.println(numA + numB + detalle1  );

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
