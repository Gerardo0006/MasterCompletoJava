package tareatres.almacendeventaalpormayor;

import java.time.LocalDate;

public class AlimentoPerecedero extends Producto{
    //Atributos propios de ésta clase
    private LocalDate expirationDate;

    //Implementación de método constructor
    public AlimentoPerecedero(String name, double price, LocalDate expirationDate){
        super(name, price);
        this.expirationDate = expirationDate;
    }

    //Implementación de métodos getter
    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    //Implementación sobreescritura de método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nFecha de caducidad: " + expirationDate;
    }
}
