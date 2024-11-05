public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        //Declaramos la matriz
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Joel";

        System.out.println("Iterando con un For:");
        //El primer for es para las filas
        for (int i=0; i<nombres.length; i++){
            //El segundo for es para las columnas
            for (int j=0; j<nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nIterando con un ForEach:");
        //El primer foreach es para las filas
        for (String[] fila : nombres){
            //El segundo foreach es para las columnas
            for (String nombre : fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
