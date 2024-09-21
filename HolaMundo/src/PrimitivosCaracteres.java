public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040'; //Estamos accediendo a '@' con Unicode
        char decimal = 64; //Estamos accediendo a '@' con su valor entero
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);

        System.out.println("caracter = decimal: " + (caracter == decimal)); //(caracter == decimal) -> retorna una expresión booleana (true/false)
        System.out.println("simbolo = caracter: " + (simbolo == caracter)); //(simbolo == caracter) -> retorna una expresión booleana (true/false)

        System.out.println("char corresponde en byte a:  " + Character.BYTES);
        System.out.println("char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato char: " + Character.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato char: " + Character.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte a:" + espacio + Character.BYTES);
        System.out.println("char corresponde en bites a: " + retroceso + Character.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato char:" + tabulador + tabulador + Character.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato char:\t\t" + Character.MAX_VALUE);
        System.out.println("Esta es una línea de ejemplo para probar el... " + nuevaLinea + "...salto de línea.");
        System.out.println("Esta es una línea de ejemplo para probar el " + retornoCarro + "retorno de carro.");
    }
}
