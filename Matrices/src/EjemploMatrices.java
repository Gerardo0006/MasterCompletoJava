public class EjemploMatrices {
    public static void main(String[] args) {
        //Definimos la matriz
        int[][] numeros = new int[2][4];

        //Inicializamos la matriz (asignación de valor a cada índice de la matriz)
        //Fila 1
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        //Fila 2
        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;

        //Imprimimos el número de filas y columnas
        System.out.println("Número de filas = " + numeros.length);
        System.out.println("Número de columnas = " + numeros[0].length);

        //Imprimimos la matriz
        for (int i = 0; i<numeros.length; i++){
            for (int j = 0; j<numeros[0].length; j++){
                System.out.print("[" + numeros[i][j] + "]");
            }
            System.out.println();
        }

        //Imprimimos primer y último elemento de la matriz
        System.out.println("Primer elemento de la matriz = " + numeros[0][0]);
        System.out.println("Último elemento de la matriz = " + numeros[numeros.length-1][numeros[1].length-1]);
    }
}
