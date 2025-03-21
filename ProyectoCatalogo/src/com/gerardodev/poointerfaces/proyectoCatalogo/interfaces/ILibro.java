package com.gerardodev.poointerfaces.proyectoCatalogo.interfaces;

import java.util.Date;

public interface ILibro {
    //Métodos que deben implementar las clases que incluyan ésta interfaz
    Date getFechaPublicacion();
    String getAutor();
    String getTitulo();
    String getEditorial();
}