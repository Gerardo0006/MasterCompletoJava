import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 2;
        array[2] = Integer.valueOf("3"); //Ejemplo de AutoUnboxing
        array[3] = (int)4L; //Ejemplo de Cast
        array[4] = 5;

        int i = array[0];
        int j = array[1];
        int k = array[2];
        int l = array[3];
        int m = array[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);

        System.out.println("-------------------------");

        String[] productos = new String[3];
        //String prods[] = new String[3]; //Esta es otra manera de definir un array
        productos[0] = "Kingston pendrive 64GB";
        productos[1] = "Samsung Galaxy S24 Ultra";
        productos[2] = "AirPods Pro 3ra Gen";

        //Clase Arrays con métodos (método sort) para ordenar alfabeticamente arrays
        Arrays.sort(productos);

        String prod1 = productos[0];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
    }
}
