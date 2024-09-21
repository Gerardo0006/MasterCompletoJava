public class SentenciaFor {
    public static void main(String[] args) {
        /*Manera distinta de escribir/definir un bucle for
        * int i=0; //Inicialización de la variable de iteración
        * for( ; ; ){
        *   if(i>5){ //Condición que debe cumplir el bucle para ejecutarse
        *       break;
        *   }
        *   System.out.println("i  = " + i);
        *   i++; //Incremento del bucle en la variable de iteración
        * }
        * */

        //Manera tradicional de escribir/definir un bucle for
        for (int i=0; i<5; i++){
            System.out.println("índice ["+i+"] = "+(i+1));
        }

        System.out.println("---------------------------------");

        //Ejemplo decreciente
        for (int i=9; i>=0; i--){
            System.out.println("índice [" + i + "] = " + (i+1));
        }

        System.out.println("---------------------------------");
        
        //Ejemplo con más de una variable
        for (int i=0, j=10; i<j; i++, j--){
            System.out.println((i+1) + " -> " + j);
        }

        System.out.println("---------------------------------");

        //Ejemplo imprimir números pares
        for (int i=0; i<=10; i++){
            if (i%2 == 0){
                System.out.println("i = " + i);
            }
        }

        //Ejemplo imprimir números impares
        System.out.println("Imprimiendo números impares");
        for (int i=0; i<=10; i++){
            if (i%2 == 0){
                continue; //Esta sentencia excluye esa iteración del bucle y pasa a la siguiente
            }
            System.out.println("i = " + i);
        }

        System.out.println("Imprimiendo números pares con negación en el algoritmo anterior");
        for (int i=0; i<=10; i++){
            if (i%2 != 0){
                continue; //Esta sentencia excluye esa iteración del bucle y pasa a la siguiente
            }
            System.out.println("i = " + i);
        }

        System.out.println("Imprimiendo números pares con otra manera de negación en sentencia if");
        for (int i=0; i<=10; i++){
            if ( !(i%2 == 0) ){ //Negamos la condición con el operador "!"
                continue; //Esta sentencia excluye esa iteración del bucle y pasa a la siguiente
            }
            System.out.println("i = " + i);
        }
    }
}
