package tareatres.almacendeventaalpormayor;

public class Limpieza extends Producto{
    //Atributos propios de la clase
    private String brand;
    private String productType;

    //Implementaciíón de método Constructor
    public Limpieza(String name, double price, String brand, String productType){
        super(name, price);
        this.brand = brand;
        this.productType = productType;
    }

    //Implementación de métodos getter
    public String getBrand(){
        return brand;
    }
    public String getProductType(){
        return productType;
    }

    //Implementación sobreescritura de método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nMarca: " + brand +
                "\nTipo de producto: " + productType;
    }
}
