public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        //Declaramos la matriz de una manera diferente
        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Joel"} };

        System.out.println("Iterando con un ForEach:");
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
