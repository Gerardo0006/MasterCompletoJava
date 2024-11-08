public class ImprimirX {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        //Asignamos 1s a la diagonal izquierda-derecha
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        //Asignamos 1s a la diagonal derecha-izquierda
        int posJ = 0, count = 0;
        for (int i = 0; i<matriz.length; i++){
            for (int j = matriz[i].length-1; j>=0; j--){
                posJ = matriz[i].length-1-count;
                if (j == posJ){
                    matriz[i][j] = 1;
                }
            }
            count++;
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
