public enum Color {
    NEGRO("Negro"),
    GRIS_MAZDA("Gris Polimetal"),
    GRIS_HONDA("Gris Meteoro"),
    COLOR_PATENTE("Blanco");

    //Declaramos un atributo de tipo final que sea String para almacenar ahí el color/valor de cada elemento enum
    private final String color;

    //Creamos un método setter para asignar valor al atributo color
    Color(String color){
        this.color = color;
    }
    //Creamos método getter
    public String getColor() {
        return color;
    }

    //Ageragamos sobreescritura de metodo toString
    //Declaramos éste métodos para dar una representación al valor de cada constante del enum
    //Éste método nos sirve para poder retornar el valor string de cada constante del enum, y
    // poder acceder a él sin necesidad de la concatenación del método getColor();.
    @Override
    public String toString() {
        return this.color;
    }

}
