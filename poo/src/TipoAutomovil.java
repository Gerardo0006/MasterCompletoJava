public enum TipoAutomovil {
    SEDAN("Sedán", "Auto mediano", 4),
    HATCHBACK("Hatchaback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta de trabajo", 4),
    COUPE("Coupé", "Auto deportivo", 2);

    //Declaramos tres atributos para poder asignarles valor
    private final String nombre;
    private final String descripcion;
    private final int numeroPuertas;

    //Generamos el método constructor
    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    //Generamos métodos getter
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
