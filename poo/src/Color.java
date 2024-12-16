public enum Color {
    /*un enum es una coleción de Atributos constantes*/
    ROJO/*Agregando personalización a cada color*/("Rojo"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    AMARILLO("Amarillo"),
    NARANJA("Naranja"),
    AZUL("Azul");

    //Agregando personalización a cada color
    private final String color;

    //Método constructor
    Color(String color) {
        this.color = color;
    }

    //Método getter
    public String getColor() {
        return color;
    }

    //Agregamos sobreescritura de método toString
    @Override
    public String toString() {
        return this.color;
    }
}
