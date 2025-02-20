package tareados.almacenyverduleria;

public class Limpieza extends Producto{
    //Declaramos los atributos
    private String componentes;
    private double lts;

    //Declaramos/definimos el método constructor
    public Limpieza(String nombre, int cantidad, String componentes, double lts){
        super(nombre, cantidad);
        this.componentes = componentes;
        this.lts = lts;
    }

    //Declaramos/definimos los métodos getter
    public String getComponentes(){
        return componentes;
    }
    public double getLts(){
        return lts;
    }

    //Implementación de sobreescritura del Método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nComponentes: " + componentes +
                "\nLts: " + lts + "lts";
    }
}
