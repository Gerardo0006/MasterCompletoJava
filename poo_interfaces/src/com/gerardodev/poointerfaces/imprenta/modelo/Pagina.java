package com.gerardodev.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja{

    //Implementación de Método Constructor
    public Pagina(String contenido) {
        super(contenido);
    }

    //Implementación de atributo abstracto heredado de la clase abstracta padre 'Hoja'
    @Override
    public String imprimir() {
        return this.contenido;
    }
}
