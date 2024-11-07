public class ImprimirX {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (i == j){
                    matriz[i][j] = 1;
                }
            }
        }
        int decremento;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                decremento = matriz.length-1;
                if (i == 0 && j == decremento ||
                        i == 1 && j == decremento){
                    decremento--;
                    matriz[i][decremento] = 1;
                }
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
