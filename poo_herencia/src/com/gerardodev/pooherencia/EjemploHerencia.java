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

        alumnoInter.setNombre("Peter"); //Método propio de la clase Persona
        alumnoInter.setApellido("Parker"); //Método propio de la clase Persona
        alumnoInter.setEscuela("UAA"); //Método propio de la clase Alumno
        alumnoInter.setPais("Noruega"); //Método propio de la clase AlumnoInternacional

        //Accedemos a nombre y apellido con los métodos get heredados de la clase padre Persona
        System.out.println("ALUMNO\n" + alumno.getNombre() + " " + alumno.getApellido() +
                "\nEscuela: " + alumno.getEscuela());
        System.out.println("PROFESOR\n" + profesor.getNombre() + " " + profesor.getApellido() +
                "\nMateria: " + profesor.getMateria());
        System.out.println("ALUMNO INTERNACIONAL\n" + alumnoInter.getNombre() + " " + alumnoInter.getApellido() +
                "\nEscuela: " + alumnoInter.getEscuela() + "\nPaís: " + alumnoInter.getPais());

        Class clase = alumnoInter.getClass();
        System.out.println("----------------------");
        //Con bucle while recorremos la jerarquía de clases. Que nos de el nombre de la clase y su clase padre
        while (clase.getSuperclass() != null){
            String claseHija = clase.getName();
            String clasePadre = clase.getSuperclass().getName(); //Con getSuperclass() accedemos a la clase padre y con getName() obtenemos su nombre
            System.out.println(claseHija + " es clase hija de clase padre " + clasePadre);
            clase = clase.getSuperclass();
        }
        System.out.println("----------------------");
    }
}
