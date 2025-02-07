package com.gerardodev.app.jardin;

//Importamos el package de la clase que usaremos
import com.gerardodev.app.hogar.*/*Persona*/; //Usando wild import para que se importen todas las clases
//import com.gerardodev.app.hogar.Gato;
import static com.gerardodev.app.hogar.Persona.*;

import static com.gerardodev.app.hogar.ColorPelo.*;


public class EjemploPaquetes {
    public static void main(String[] args) {
        /*//Declarando/instanciando clase Persona sin usar import
        com.gerardodev.app.hogar.Persona persona = new com.gerardodev.app.hogar.Persona();*/
        //Declarando/instanciando objeto del Package importado
        Persona persona = new Persona();
        //Asignamos nombre a persona
        persona.setNombre("Gerardo");
        persona.setApellido("Macías");
        //System.out.println("persona = " + persona.nombre);
        //Asignamos color de cabello a persona
        // persona.setColorPelo(ColorPelo.NEGRO); //Accediendo al valor del enum ColorPelo sin importar el atributo
        persona.setColorPelo(RUBIO); //Accediendo al valor del enum ColorPelo importando todos los valores del enum

        //Instanciando objeto del segundo Package importado
        //Gato gato = new Gato();

        Perro perro = new Perro();
        perro.nombre = "Rocko";
        perro.raza = "Pitbull";

        //String jugando = perro.jugar(persona);
        //System.out.println(jugando);
        System.out.println(perro.jugar(persona));

        //Accediendo al método saludar del package hogar y método saludar de la clase Persona
        String saludar = saludar(); //Accedemos al método como si fuera propio de ésta clase
        System.out.println(saludar);

        //Asignamos valores de tipo final que están en la clase Persona
        String generoFemenino = GENERO_FEMENINO;
        String generoMasculino = GENERO_MASCULINO;



    }
}
