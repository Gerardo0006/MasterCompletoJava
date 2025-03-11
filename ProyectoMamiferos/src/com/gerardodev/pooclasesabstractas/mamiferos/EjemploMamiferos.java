package com.gerardodev.pooclasesabstractas.mamiferos;

import com.gerardodev.pooclasesabstractas.mamiferos.caninos.*;
import com.gerardodev.pooclasesabstractas.mamiferos.felinos.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        //Implementación de array del tipo Mamiferos
        Mamiferos[] mamiferos = new Mamiferos[5];

        //Implementación de instancias/objetos de cada tipo
        //Felinos
        Mamiferos leon = new Leon(10, 114, 1.5F, 80, "Sabana Africana", 1.25F, 2.5F, 250);
        Mamiferos tigre = new Tigre("Bengala", 7.5F, 90, "Selva", 125, 3.1F, 260);
        Mamiferos guepardo = new Guepardo(6.0F, 104, "Sabana Africana", 90, 150, 65);
        //Caninos
        Mamiferos lobo = new Lobo(8, "Canis Lupus Albus", "Blanco", 6.0F, "Rusia", 90F, 2.0F, 57F);
        Mamiferos perro = new Perro(23, "Pitbull", 49, "Café", 3, "Hogar", 48.0F, 50.0F, 29.0F);

        //Asignando objetos del tipo Mamiferos a cada índice del array 'mamiferos'
        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        //Imprimiendo cada indice del array usando Foreach
        for(Mamiferos animal : mamiferos){
            System.out.println(animal.comer());
            System.out.println(animal.comunicarse());
            System.out.println(animal.correr());
            System.out.println(animal.dormir());
            System.out.println("------------");
        }

        /*
        System.out.println(leon.comer());
        System.out.println(tigre.comunicarse());
        System.out.println(guepardo.correr());

        System.out.println(lobo.dormir());
        System.out.println(perro.comer());
        */
    }
}
