public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {
        //Declaramos la matriz con número de filas fijo y número de columnas variable
        int[][] matriz = new int[3][];
        //Inicializamos el número de columnas para cada fila
        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];

        System.out.println("Número de filas en la matriz: " + matriz.length);
        System.out.println("Número de columnas en la fila 0: " + matriz[0].length);
        System.out.println("Número de columnas en la fila 1: " + matriz[1].length);
        System.out.println("Número de columnas en la fila 2: " + matriz[2].length);

        //Poblamos la matriz
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = i*j;
            }
        }

        //Imprimimos la matriz
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
