public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzman";

        String resultado1 = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado1 = " + resultado1);
        System.out.println(curso == resultado1);

        String resultado2 = curso.transform(course -> {
            return course + " con " + profesor;
        });

        System.out.println("El valor de curso sigue siendo= " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado1.replace("a", "A");
        System.out.println("resultado1 = " + resultado1);
        System.out.println("resultado3 = " + resultado3);
    }
}
