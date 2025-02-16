package com.gerardodev.ejemplo;

import com.gerardodev.pooherencia.Alumno;
import com.gerardodev.pooherencia.AlumnoInternacional;
import com.gerardodev.pooherencia.Persona;
import com.gerardodev.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("=== Método Constructor de Alumno ===");
        //Creamos instancia/objeto de clase Alumno pasando valores por parámetro
        // argumento a su método constructor
        Alumno alumno = new Alumno("Gerardo", "Macías",
                24, "Universidad Autónoma de Aguascalientes");
        //Asignamos valores con métodos get & set propios de la clase Alumno
        alumno.setCalifEspaniol(10);
        alumno.setCalifHistoria(10);
        alumno.setCalifMatematicas(10);
        alumno.setEmail("gerardo@email.com");

        System.out.println("=== Método Constructor de AlumnoInternacional ===");
        AlumnoInternacional alumnoInter = new AlumnoInternacional("Peter", "Parker", "Noruega");
        alumnoInter.setEscuela("UAA"); //Método heredado de la clase padre Alumno
        alumnoInter.setCalifEspaniol(10);
        alumnoInter.setCalifHistoria(10);
        alumnoInter.setCalifMatematicas(10);
        alumnoInter.setCalifIdiomas(9); //Método propio de la clase AlumnoInternacional
        alumnoInter.setEmail("alumno-internacional@email.com");

        System.out.println("=== Método Constructor de Profesor ===");
        Profesor profesor = new Profesor("Andrés", "Guzmán", "Programación con lenguaje Java");
        profesor.setEdad(37); //Método heredado de la clase Persona
        profesor.setEmail("profesor@email.com");

        System.out.println();
        //Invocamos la función/método imprimir
        imprimir(profesor);
        System.out.println();
        imprimir(alumnoInter);
        System.out.println();

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
        //Accedemos a nombre y apellido con los métodos get heredados de la clase padre Persona
        System.out.println("Imprimiendo los datos del tipo Persona (las clases Alumno/AlumnoInt/Profesor heredan estos datos al ser clases hijas de Persona)");
        System.out.println("Nombre: " + persona.getNombre() +
                "\nApellido: " + persona.getApellido() +
                "\nEdad: " + persona.getEdad() +
                "\nEmail: " + persona.getEmail());

        //Implementamos filtro para diferenciar qué clase es (Alumno, AlumnoInternacional o Profesor)
        //usando instanceof
        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Escuela: " + ((Alumno) persona).getEscuela() +
                    "\nCalificación Español: " + ((Alumno) persona).getCalifEspaniol() +
                    "\nCalificación Historia: " + ((Alumno) persona).getCalifHistoria() +
                    "\nCalificación Matemáticas: " + ((Alumno) persona).getCalifMatematicas()); //Hacemos cast para convertir objeto persona a tipo Alumno

            //Validamos si es o no es del tipo de la subclase de AlumnoInternacional
            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Calificación idiomas: " + ((AlumnoInternacional) persona).getCalifIdiomas() +
                        "\nPaís: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("\nSobreescritura de método calcularPromedio();");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor");
            System.out.println("Materia: " + ((Profesor) persona).getMateria());
        }
    }
}
