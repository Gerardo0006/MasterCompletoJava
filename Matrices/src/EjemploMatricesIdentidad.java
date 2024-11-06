public class EjemploMatricesIdentidad {
    public static void main(String[] args) {
        //Definición de la matriz
        int[][] matriz = new int[5][5];

        //Asignamos "1" a la diagonal principal de la matriz
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        //Imprimimos la matriz identidad
        System.out.println("Matriz Identidad (diagonal de 1s)");
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
