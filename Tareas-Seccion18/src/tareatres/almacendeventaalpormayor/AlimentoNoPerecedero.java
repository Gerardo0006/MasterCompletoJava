package tareatres.almacendeventaalpormayor;

public class AlimentoNoPerecedero extends Producto{
    //Atributos propios de la clase
    private double contentWeight;

    //Implementación de método Constructor
    public AlimentoNoPerecedero(String name, double price, double contentWeight){
        super(name, price);
        this.contentWeight = contentWeight; //Peso en gramos
    }

    //Método getter
    public double getContentWeight(){
        return contentWeight;
    }

    //Implementación sobreescritura de método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nPeso (gr): " + contentWeight;
    }
}
