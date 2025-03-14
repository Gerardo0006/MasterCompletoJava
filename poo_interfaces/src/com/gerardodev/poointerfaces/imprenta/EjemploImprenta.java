package com.gerardodev.poointerfaces.imprenta;

import com.gerardodev.poointerfaces.imprenta.modelo.Curriculum;
import com.gerardodev.poointerfaces.imprenta.modelo.Hoja;
import com.gerardodev.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        //Instancia del tipo Curriculum
        Curriculum cv = new Curriculum("Gerardo Macías", "Ingeniería en Sistemas Computacionales", "Resumen laboral...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador Fullstack");
        cv.addExperiencia("Angular");
        cv.addExperiencia("PHP");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("HTML");
        cv.addExperiencia("CSS");
        cv.addExperiencia("WordPress");

        //Instancia del tipo Informe
        Informe informe = new Informe("Gerardo Macías", "John Doe", "Estudio sobre microservicios");

        //Implementamos el método imprimir();
        imprimir(cv);
        imprimir(informe);
    }

    //Implementación de control de tipo/contrato de la clase abstracta 'Hoja'
    public static void imprimir(Hoja imprimible){
        //Cualquier objeto que sea hijo de Hoja se puede imprimir
        System.out.println(imprimible.imprimir());
    }
}
