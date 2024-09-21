import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreFactura;
        double price1, price2;
        double impuesto, totalBruto, totalNeto;

        System.out.println("Ingrese el nombre de la factura: ");
        nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio 1: ");
        price1 = scanner.nextDouble();

        System.out.println("Ingrese el precio 2: ");
        price2 = scanner.nextDouble();

        totalBruto = price1+price2;
        impuesto = (price1+price2)*0.19;
        totalNeto = totalBruto+impuesto;

        System.out.println("La factura '" + nombreFactura + "' tiene un total bruto de [$" + totalBruto + "], un impuesto de [$" + impuesto +"] y el precio neto es [$" + totalNeto + "]");
    }
    /*Ejemplo instructor
    * import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }
}
    * */
}
