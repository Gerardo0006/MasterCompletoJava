package tareados.almacenyverduleria;

public class Main {
    public static void main(String[] args) {
        //Creamos array del tipo Producto para almacenar las instancias de cada tipo de producto
        Producto[] productos = new Producto[8];

        //Inicializamos cada posición del array con un objeto en cada índice
        productos[0] = new Lacteo("Leche LALA 1lt", 20, 1, 20);
        productos[1] = new Lacteo("Leche San Marcos 1lt", 18, 1, 18);
        productos[2] = new Fruta("Manzana", 35, 1.5, "rojo");
        productos[3] = new Fruta("Mango", 40, 1.5, "amarillo");
        productos[4] = new Limpieza("Pinol", 1, "Detergente y aceite de pino", 1);
        productos[5] = new Limpieza("Cloralex", 1, "Cloro", 1);
        productos[6] = new NoPerecible("Arroz", 1, 1000, 360);
        productos[7] = new NoPerecible("Lentejas", 1, 500, 340);

        //Imprimimos el array
        for (Producto p : productos){
            System.out.println(p.toString());
            System.out.println("----------------");
        }
    }
}
