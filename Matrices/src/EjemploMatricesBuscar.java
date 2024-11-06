public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementToFind = 15;
        boolean found = false;

        //Recorremos la matriz en búsqueda de elementToFind
        int i;
        int j = 0;
        search: for (i = 0; i<matrizDeEnteros.length; i++){
            for (j = 0; j<matrizDeEnteros[i].length; j++){
                if (matrizDeEnteros[i][j] == elementToFind){
                    found = true;
                    break search; //search es la etiqueta con la que identificamos el primer bucle for
                }
            }
        }

        //Imprimimos las coordenadas en la que se encuentra el elemento
        if (found){
            System.out.println(elementToFind + " Encontrado en la coordenada [" + i + ", " + j + "]");
        } else {
            System.out.println(elementToFind + " No existe en la matriz");
        }
    }
}
