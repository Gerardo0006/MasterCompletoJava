public class Rueda {
    //Declaramos/definimos los atributos
    private String fabricante;
    private int rin;
    private double ancho;

    //Implementamos método constructor
    public Rueda(String fabricante, int rin, double ancho) {
        this.fabricante = fabricante;
        this.rin = rin;
        this.ancho = ancho;
    }

    //Implementamos métodos getter
    public String getFabricante() {
        return fabricante;
    }
    public int getRin() {
        return rin;
    }
    public double getAncho() {
        return ancho;
    }
}
