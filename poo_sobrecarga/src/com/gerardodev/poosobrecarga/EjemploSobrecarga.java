package com.gerardodev.poosobrecarga;

//Importamos todos los métodos de la clase Calculadora para poder usarlos como propios de ésta clase (sin Calculadora.sumar() -> sumar())
import static com.gerardodev.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        //Creamos instancia de la clase Calculadora
        //Calculadora calculadora = new Calculadora();

        //Ejecutamos todos los métodos (sobrecarga) que tiene la clase pasando valores por parámetro
        System.out.println("sumar int: " + sumar(10, 5));
        System.out.println("sumar float: " + sumar(10.0F, 5F));
        System.out.println("sumar int-float: " + sumar(10, 5f));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar double: " + sumar(10.0, 5.0));
        System.out.println("sumar string: " + sumar("10", "5"));
        System.out.println("sumar tres int: " + sumar(10, 5, 3));

        //Usando tipos de datos compatibles
        System.out.println("sumar long: " + sumar(10L, 5L)); //Tipo compatible float
        System.out.println("sumar int: " + sumar(10, '@')); //Tipo compatible con char int (A todo caracter le corresponde un valor int).
        System.out.println("sumar float-int/char: " + sumar(10F, '@'));

        //Implementación de sobrecarga de Métodos con varargs
        System.out.println("sumar cuatro int: " + sumar(10, 5, 3, 4));
        System.out.println("sumar float+Nint: " + /*Calculadora.*/sumar(10.5F, 10, 9, 15));
        System.out.println("sumar cuatro double: " + /*Calculadora.*/sumar(10.0, 5.0, 3.5, 4.5));
    }
}
