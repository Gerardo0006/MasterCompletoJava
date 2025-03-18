package com.gerardodev.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    //Implementación de atributos propios de la clase
    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    //Implementación de Método Constructor
    public Curriculum(Persona persona, String carrera, String contenido){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>(); //Inicializamos la lista
    }

    //Implementamos el método add para agregar elementos a la lista 'experiencias'
    public Curriculum addExperiencia(String exp){
        experiencias.add(exp);
        return this;
    }

    //Implementación de Método abstracto de la clase abstracta padre Hoja
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        //Implementación de foreach para iterar en cada elemento de la lista 'experiencias'
        for (String exp : experiencias){
            sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
