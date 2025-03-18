package com.gerardodev.poointerfaces.imprenta.modelo;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto.";

    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    //Implementación de control de tipo/contrato de la clase abstracta 'Hoja'
    static void imprimir(Imprimible imprimible){
        //Cualquier objeto que sea hijo de Hoja se puede imprimir
        System.out.println(imprimible.imprimir());
    }
}
