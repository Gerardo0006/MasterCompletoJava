public class Tanque {
    //Declaración de atributos
    private int capacidad;

    //Implementamos métodos constructor para asignar la capacidad
    public Tanque() {
        this.capacidad = 40; //Dejamos setteado éste valor por defecto
    }
    public Tanque(int capacidad) {
        this.capacidad = capacidad;
    }

    //Implementamos método getter
    public int getCapacidad() {
        return capacidad;
    }
}
