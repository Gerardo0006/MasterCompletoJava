public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        /*int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int [20]; //array3 va a almacenar los valores de array1 y array2*/

        //Manera alternativa de declarar y definir varios arrays
        int[] array1, array2, array3;
        array1 = new int[10];
        array2 = new int[10];
        array3 = new int[20];

        //Llenamos el primer array
        for (int i = 0; i<array1.length; i++){
            array1[i] = i+1;
        }

        //Llenamos el segundo array
        for (int i=0; i<array2.length; i++){
            array2[i] = (i+1)*5;
        }

        //Llenamos el tercer array con los datos de los dos arrays anteriores
        int aux = 0;
        for (int i = 0; i<array2.length; i++){
            /*El límite puede ser la longitud de array1 o array2 ya que en cada iteración
            * almacenará 2 valores, por lo tanto no es necesario iterar 20 veces*/
            array3[aux++] = array1[i];
            array3[aux++] = array2[i];
        }

        //Imprimimos el array3 que contiene los valores de array1 y array2 intercalados
        for (int i=0; i<array3.length; i++){
            System.out.println("array3[" + i + "] -> " + array3[i]);
        }
    }
}
