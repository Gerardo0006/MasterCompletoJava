public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    //Implementamos métodos constructores (vacío y con parámetros)
    public Motor() {
    }
    public Motor(double cilindrada, TipoMotor tipo) {
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    //Implementamos métodos getter & setter
    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }
    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
