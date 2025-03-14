package com.gerardodev.poointerfaces.imprenta.modelo;

import java.util.List;

public class Libro {
    //Implementación de atributos propios de la clase
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    //Implementación de Método constructor
    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    //Implementamos Método para agregar Página
    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    //Implementación de Método imprimir
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Título: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Género: ").append(this.genero).append("\n");
        //Agregando paginas
        for (Hoja pag : paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }

}
