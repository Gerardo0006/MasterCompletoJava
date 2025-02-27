package com.gerardodev.pooclasesabstractas.form.elementos;

import com.gerardodev.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    //Declaramos una lista de tipo String
    private List<Opcion> opciones;

    //Implementación de Métodos Constructores
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>(); //Inicializamos la lista
    }
    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return null;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=\"")
                .append(this.nombre)
                .append("\">");

        for (Opcion opcion : this.opciones){
            sb.append("\n<option value=\"")
                    .append(opcion.getValor())
                    .append("\"");
            if (opcion.isSelected()){
                sb.append(" selected")
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>")
        }
        sb.append("</selec>")
        return sb.toString();
    }
}
