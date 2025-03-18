package com.gerardodev.poointerfaces.imprenta;

import com.gerardodev.poointerfaces.imprenta.modelo.*;
//Importamos de manera estática el enum para usarlo como una constante propia de la clase
import static com.gerardodev.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        //Instancia del tipo Curriculum
        Curriculum cv = new Curriculum(new Persona("Gerardo",  "Macías"), "Ingeniería en Sistemas Computacionales", "Resumen laboral...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador Fullstack")
        .addExperiencia("Angular")
        .addExperiencia("PHP")
        .addExperiencia("JavaScript")
        .addExperiencia("HTML")
        .addExperiencia("CSS")
        .addExperiencia("WordPress");

        //Creamos instancia del tipo Libro
        Libro libro = new Libro(new Persona("Erich", "Gamma"),
                "Parones de Diseño: Elementos Reusables POO",
                PROGRAMACION);
        //Agregando páginas al libro
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        //Instancia del tipo Informe
        Informe informe = new Informe(new Persona("Gerardo", "Macías"),
                new Persona("John", "Doe"),
                "Estudio sobre microservicios");

        //Implementamos el método imprimir();
        imprimir(cv);
        System.out.println("-----------");
        imprimir(informe);
        System.out.println("-----------");
        //Para imprimir libro es necesario implementar una iterfaz ya que la clase Libro no cumple el contrato y no hereda el método imprimir()
        imprimir(libro);
    }

    //Implementación de control de tipo/contrato de la clase abstracta 'Hoja'
    public static void imprimir(Imprimible imprimible){
        //Cualquier objeto que sea hijo de Hoja se puede imprimir
        System.out.println(imprimible.imprimir());
    }
}
