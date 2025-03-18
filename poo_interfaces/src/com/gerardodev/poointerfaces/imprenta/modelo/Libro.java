package com.gerardodev.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    //Implementación de atributos propios de la clase
    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    //Implementación de Método constructor
    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    //Implementamos Método para agregar Página
    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    //Implementación de Método imprimir
    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Título: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Género: ").append(this.genero).append("\n");
        //Agregando paginas de la lista con bucle Foreach
        for (Imprimible pag : paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }

}
