package tareatres.almacendeventaalpormayor;

public class Cliente {
    //Atributos de la clase
    private String name;
    private int id;

    //Método constructor
    public Cliente(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Métodos getter
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    //Método para realizar una compra
    public void buyProduct(Vendedor seller, Producto product){
        seller.sellProduct(this, product);
    }
}
