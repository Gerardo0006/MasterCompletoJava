public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... qué tal";
        //String texto = new String ("Creando un objeto de la clase String... qué tal");
        Number num = 7;
        //Integer num = new Integer(7);

        boolean bool1 = texto instanceof String;
        System.out.println("¿La variable 'texto' es de tipo String = " + bool1);
        bool1 = texto instanceof Integer;
        System.out.println("¿La variable 'texto' es de tipo Integer? " + bool1);
        bool1 = texto instanceof Object;
        System.out.println("¿La variable 'texto' es de tipo Object? " + bool1);

        bool1 = num instanceof Integer;
        System.out.println("¿La variable 'num' es de tipo Integer? " + bool1);
        bool1 = num instanceof Number;
        System.out.println("¿La variable 'num' es de tipo Number? " + bool1);
        bool1 = num instanceof Object;
        System.out.println("¿La variable 'num' es de tipo Object? " + bool1);
        bool1 = texto instanceof Double;
        System.out.println("¿La variable 'num' es de tipo Double? " + bool1);
    }
}
