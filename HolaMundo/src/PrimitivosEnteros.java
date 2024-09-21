public class PrimitivosEnteros {
    public static void main(String[] args) {
        //Trabajando con tipo de dato byte
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);

        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mÍnimo que se puede asignar a tipo de dato byte: " + Byte.MIN_VALUE);
        System.out.println("------------------------------------------------------------------------");

        //Trabajando con tipo de dato short
        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);

        System.out.println("Tipo short corresponde en byte a " + Byte.BYTES);
        System.out.println("Typo short corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor mÍnimo que se puede asignar a tipo de dato short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato short: " + Short.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");

        //Trabajando con tipo de dato int
        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);

        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato int: " + Integer.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");

        //Trabajando con tipo de dato long
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);

        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato long: " + Long.MAX_VALUE);

        //Usando var
        var numeroVar = 2147483648L;
    }
}
