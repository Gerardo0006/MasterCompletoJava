public class EjemploMatricesSumar {
    public static void main(String[] args) {
        //Declaramos las matrices
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mat2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        int[][] suma = new int[3][3];

        //Sumamos las matrices mat1 y mat2, almacenamos los valores en suma[][]
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1.length; j++){
                suma[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        //Imprimimos la matriz suma
        for (int i = 0; i<suma.length; i++){
            for (int j = 0; j<suma.length; j++){
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
