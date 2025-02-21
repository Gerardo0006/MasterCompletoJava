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
        System.out.println("El cliente [" + client.getName() + "] ha comprado: \n" +
                product.getName() + "\nVendedor: [" + this.getName() + "]");
    }
}
