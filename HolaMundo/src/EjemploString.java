public class EjemploString {
    public static void main(String[] args) {
        /*String curso1 = "Programación Java";
        String curso2 = new String("Programación Java");
        String curso3 = "Programación Java";

        boolean esIgual1 = (curso1 == curso2);
        System.out.println("curso1 == curso2 = " + esIgual1);

        boolean esIgual2 = curso1.equals(curso2);
        System.out.println("curso1.equals(curso2) = " + esIgual2);

        boolean esIgual3 = (curso1 == curso3);
        System.out.println("(curso1 == curso3) = " + esIgual3);*/

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
