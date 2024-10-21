import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[3];
        //String prods[] = new String[3]; //Esta es otra manera de definir un array
        int longArray = productos.length;

        productos[0] = "Kingston pendrive 64GB";
        productos[1] = "Samsung Galaxy S24 Ultra";
        productos[2] = "AirPods Pro 3ra Gen";

        //Clase Arrays con métodos (método sort) para ordenar alfabeticamente arrays
        //Siempre que vayamos a ordenar un array con el método sort, hay que hacerlo antes de imprimirlo con un for

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i<longArray; i++){
            System.out.println("Para índice i -> " + i + ": " + productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for (String prod: productos){
            System.out.println("Producto: " + prod);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while(i<longArray){
            System.out.println("Para índice i -> " + i + ": " + productos[i]);
            i++;
        }
        System.out.println("=== Usando Do While ===");
        int j = 0;
        do {
            System.out.println("Para índice j -> " + j + ": " + productos[j]);
            j++;
        }while(j<longArray);
        System.out.println("-------------------------");

        //Llenado o población de un array tipo int
        int[] array = new int[5];
        int totalArrayInt = array.length;
        for (int k = 0; k<totalArrayInt; k++){
            array[k] = k*3; //Asignando valor a índice k multiplicando 3*k
        }
        //Imprimiendo array
        for (int k=0; k<totalArrayInt; k++){
            System.out.println("array[" + k + "] = " + array[k]);
        }
    }
}
