package com.gerardodev.app.jardin;

import com.gerardodev.app.hogar.Persona;

public class Perro {

    //Declaramos los atributos de tipo protected
    //protected es parecido al default ya que deja inaccesibles los atributos a clases ajegnas
    //y disponibles para clases en el mismo contexto
    protected String nombre;
    protected String raza;

    //Implementamos método default para que el perro juegue
    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
