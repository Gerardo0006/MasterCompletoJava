public enum TipoAutomovil {
    SEDAN("Sedán", "Automovil normal", 4),
    STATION_WAGON("Station Wagon", "Automóvil grande", 4),
    HATCHBACK("Hatchback", "Automóvil compacto", 4),
    PICKUP("Pickup", "Camioneta de carga", 4),
    COUPE("Coupé", "Automóvil pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgoneta", "Automóvil utilitario", 4);

    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    //Declaramos el método constructor
    TipoAutomovil(String nombre, String descripcion, int numeroPuertas) {
        this.nombre = nombre;
        this.numeroPuertas = numeroPuertas;
        this.descripcion = descripcion;
    }

    //Declaramos métodos getter
    public String getNombre() {
        return nombre;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
