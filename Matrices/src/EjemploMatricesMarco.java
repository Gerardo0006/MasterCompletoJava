public class EjemploMatricesMarco {
    public static void main(String[] args) {
        //Definición de la matriz
        int[][] matriz = new int[5][5];

        //Asignamos "1" a los marcos de la matriz
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (i == 0 || i == matriz.length-1 ||
                j == 0 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }
            }
        }

        //Imprimimos la matriz marco
        System.out.println("Matriz Marco (1s en el marco de la matriz y 0s en el centro)");
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
