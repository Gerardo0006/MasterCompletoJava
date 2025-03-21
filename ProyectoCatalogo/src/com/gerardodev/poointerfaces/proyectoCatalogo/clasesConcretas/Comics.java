package com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas;

import java.util.Date;

public class Comics extends Libro{
    //Implementación de atributos propios de la clase
    private String personaje;

    //Implementación de Método Constructor
    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje){
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    //Implementación de Método Getter
    public String getPersonaje(){
        return personaje;
    }

    //Implementación de sobreescritura de Método getPrecioVenta();
    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.10;
    }
}