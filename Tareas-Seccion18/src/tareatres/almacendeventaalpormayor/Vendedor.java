package tareatres.almacendeventaalpormayor;

public class Vendedor {
    //Atributos
    private String name;
    private int id;

    //Implementación método constructor
    public Vendedor(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Implementación de métodos getter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //Implementación para vender producto a cliente
    public void sellProduct(Cliente client, Producto product){
        System.out.println("El cliente [" + client.getName() + "] ha comprado:");
        System.out.println("Producto: " + product.getName());
        if(product instanceof AlimentoPerecedero) {
            System.out.println("Fecha de caducidad: " + ((AlimentoPerecedero) product).getExpirationDate() +
                    "\nVendedor: [" + this.getName() + "]");
        }
        if (product instanceof AlimentoNoPerecedero){
            System.out.println("Contenido (gr): " + ((AlimentoNoPerecedero)product).getContentWeight() +
                    "\nVendedor: [" + this.getName() + "]");
        }
        if (product instanceof Limpieza){
            System.out.println("Marca: " + ((Limpieza)product).getBrand() +
                    "\nTipo de producto: " + ((Limpieza)product).getProductType() +
                    "\nVendedor: [" + this.getName() + "]");
        }
    }
}
