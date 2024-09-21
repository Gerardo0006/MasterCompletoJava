public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String... qué tal";
        //String texto = new String ("Creando un objeto de la clase String... qué tal");
        Integer num = 7;
        //Integer num = new Integer(7);

        boolean bool1 = texto instanceof String;
        System.out.println("¿La variable 'texto' es de tipo bool? " + bool1);
        bool1 = texto instanceof Object;
        System.out.println("¿La variable 'texto' es de tipo bool? " + bool1);

        bool1 = num instanceof Integer;
        System.out.println("¿La variable 'num' es de tipo Integer? " + bool1);
        bool1 = num instanceof Number;
        System.out.println("¿La variable 'num' es de tipo Number? " + bool1);
        bool1 = num instanceof Object;
        System.out.println("¿La variable 'num' es de tipo Object? " + bool1);
    }
}
