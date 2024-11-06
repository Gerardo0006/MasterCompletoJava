public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {
        int sumaFila, sumaColumna;
        //Declaramos las matrices
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Sumamos las matrices mat1 y mat2, almacenamos los valores en suma[][]
        for (int i = 0; i<matriz.length; i++){
            sumaColumna = 0;
            sumaFila = 0;
            for (int j = 0; j<matriz[i].length; j++){
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            System.out.println("Suma total de la fila " + i + "= " + sumaFila);
            System.out.println("Suma total de la columna " + i + "= " + sumaColumna);
        }
    }
}
