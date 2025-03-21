package com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas;

import com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas.Producto;
import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.ILibro;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    //Implementación de atributos propios de la clase Libro
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    //Implementación de Método Constructor
    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial){
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    //Implementación de sobreescritura de Métodos Getter
    @Override
    public Date getFechaPublicacion(){
        return fechaPublicacion;
    }
    @Override
    public String getAutor(){
        return autor;
    }
    @Override
    public String getTitulo(){
        return titulo;
    }
    @Override
    public String getEditorial(){
        return editorial;
    }

    //Implementación de Método abstracto heredado de la interfaz IProducto
    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.10;
    }
}