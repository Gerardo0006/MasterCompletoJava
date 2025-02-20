package tareados.almacenyverduleria;

public class NoPerecible extends Producto{
    //Declaramos los atributos
    private int contenido;
    private int calorias;

    //Declaramos/definimos el método constructor
    public NoPerecible(String nombre, int cantidad, int contenido, int calorias){
        super(nombre, cantidad);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    //Declaramos/definimos los métodos getter
    public int getContenido(){
        return contenido;
    }
    public int getCalorias(){
        return calorias;
    }

    //Implementación de sobreescritura de Método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nContenido: " + contenido +
                "\nCalorías: " + calorias;
    }
}
