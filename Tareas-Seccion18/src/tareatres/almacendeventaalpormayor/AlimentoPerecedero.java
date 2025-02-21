package tareatres.almacendeventaalpormayor;

import java.time.LocalDateTime;

public class AlimentoPerecedero extends Producto{
    //Atributos propios de ésta clase
    private LocalDateTime expirationDate;

    //Implementación de método constructor
    public AlimentoPerecedero(String name, double price, LocalDateTime expirationDate){
        super(name, price);
        this.expirationDate = expirationDate;
    }

    //Implementación de métodos getter
    public LocalDateTime getExpirationDate(){
        return expirationDate;
    }
}
