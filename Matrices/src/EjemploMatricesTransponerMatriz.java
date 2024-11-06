public class EjemploMatricesTransponerMatriz {
    public static void main(String[] args) {
        //Declaramos las matrices mat1, mat2
        int[][] mat1, mat2;
        //Definimos las matrices mat1, mat2
        mat1 = new int[8][4];
        mat2 = new int[4][8];

        //Llenamos y mostramos mat1
        System.out.println("Matriz mat1");
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                mat1[i][j] = i+j*3;
                System.out.print(mat1[i][j] + "\t");
            }
            System.out.println();
        }

        //Asignamos la matriz transpuesta de mat1 a mat2 (intercambiar filas por columnas)
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[i].length; j++){
                mat2[j][i] = mat1[i][j];
            }
        }

        //Imprimimos la mat2, que es la matriz transpuesta de mat1
        System.out.println("\nMatriz mat2 (matriz transpuesta de mat1)");
        for (int i = 0; i<mat2.length; i++){
            for (int j = 0; j<mat2[i].length; j++){
                System.out.print(mat2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
