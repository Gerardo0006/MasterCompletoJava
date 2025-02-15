package com.gerardodev.ejemplo;

import com.gerardodev.Alumno;
import com.gerardodev.AlumnoInternacional;
import com.gerardodev.Persona;
import com.gerardodev.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        //Creamos instancia/objeto de clase Alumno pasando valores por parámetro
        // argumento a su método constructor
        Alumno alumno = new Alumno("Gerardo", "Macías",
                24, "Universidad Autónoma de Aguascalientes");
        //Asignamos valores con métodos get & set propios de la clase Alumno
        alumno.setCalifEspaniol(10);
        alumno.setCalifHistoria(10);
        alumno.setCalifMatematicas(10);
        alumno.setEmail("gerardo@email.com");

        AlumnoInternacional alumnoInter = new AlumnoInternacional("Peter", "Parker", "Noruega");
        alumnoInter.setEscuela("UAA"); //Método heredado de la clase padre Alumno
        alumnoInter.setCalifEspaniol(9);
        alumnoInter.setCalifHistoria(9);
        alumnoInter.setCalifMatematicas(10);
        alumnoInter.setCalifIdiomas(9); //Método propio de la clase AlumnoInternacional
        alumnoInter.setEmail("alumno-internacional@email.com");

        Profesor profesor = new Profesor("Andrés", "Guzmán", "Programación con lenguaje Java");
        profesor.setEdad(37); //Método heredado de la clase Persona
        profesor.setEmail("profesor@email.com");

        //Invocamos la función/método imprimir
        imprimir(profesor);
        System.out.println("-------------------------");
        imprimir(alumnoInter);
        System.out.println("-------------------------");

        //Implementamos la sobreescritura del método propio de Persona saludar();
        // heredado a clases hijas
        System.out.println("Imprimiendo sobreescritura de Alumno\n"
                + alumno.saludar());
        System.out.println("Imprimiendo sobreescritura de AlumnoInternacional\n"
                + alumnoInter.saludar());
        System.out.println("Imprimiendo sobreescritura de Profesor\n"
                + profesor.saludar());
    }

    //Declaramos/definimos una función/método que imprima objetos de la clase Persona
    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
