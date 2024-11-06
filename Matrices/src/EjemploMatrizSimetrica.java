public class EjemploMatrizSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        //Definimos la matriz
        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };

        //Verificando si es simétrica con bucles While
        System.out.println("Verificamos si es simétrica usando bucles While");
        int it, jt;
        it = 0;
        while (it<matriz.length && simetrica==true){
            jt=0;
            while (jt<it && simetrica==true){
                if (matriz[it][jt] != matriz[jt][it]){
                    simetrica = false;
                }
                jt++;
            }
            it++;
        }

        //Verificando si es simétrica con bucles While y etiquetas
        System.out.println("Verificamos si es simétrica usando bucles While y etiquetas");
        int it2, jt2;
        it2 = 0;
        salir: while (it2<matriz.length){
            jt2=0;
            while (jt2<it2){
                if (matriz[it2][jt2] != matriz[jt2][it2]){
                    simetrica = false;
                    break salir;
                }
                jt2++;
            }
            it2++;
        }

        //Verificando si es simétrica con bucle For y etiqueta
        System.out.println("Verificamos si es simétrica usando bucles For y etiqueta");
        salir: for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica){
            System.out.println("\nLa matriz SÍ es simétrica");
        } else {
            System.out.println("\nLa matriz NO es simétrica");
        }
    }
}
