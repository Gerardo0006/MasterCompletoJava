package com.gerardodev.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        //Creamos instancias de Alumno y Profesor
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();
        AlumnoInternacional alumnoInter = new AlumnoInternacional();

        //Asignamos valores con métodos get & set heredados
        alumno.setNombre("Gerardo"); //Método heredado del padre
        alumno.setApellido("Macías"); //Método heredado del padre
        alumno.setEscuela("Universidad Autónoma de Aguascalientes"); //Método propio de la clase Alumno

        profesor.setNombre("Andrés");
        profesor.setApellido("Guzmán");
        profesor.setMateria("Programación con lenguaje Java"); //Método propio de la clase Profesor

        alumnoInter.setNombre("Peter");
        alumnoInter.setApellido("Parker");
        alumnoInter.setEscuela("UAA");
        alumnoInter.setPais("Noruega");

        //Accedemos a nombre y apellido con los métodos get heredados de la clase padre Persona
        System.out.println("ALUMNO\n" + alumno.getNombre() + " " + alumno.getApellido() +
                "\nEscuela: " + alumno.getEscuela());
        System.out.println("PROFESOR\n" + profesor.getNombre() + " " + profesor.getApellido() +
                "\nMateria: " + profesor.getMateria());
        System.out.println("ALUMNO INTERNACIONAL\n" + alumnoInter.getNombre() + " " + alumnoInter.getApellido() +
                "\nEscuela: " + alumnoInter.getEscuela() + "\nPaís: " + alumnoInter.getPais());
    }
}
