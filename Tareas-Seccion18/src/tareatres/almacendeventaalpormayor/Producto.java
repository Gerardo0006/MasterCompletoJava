package tareatres.almacendeventaalpormayor;

public class Producto {
    //Atributos propios de la clase padre Producto
    private String name;
    private double price;

    //Implementación de método constructor
    public Producto(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Implementación métodos getter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
