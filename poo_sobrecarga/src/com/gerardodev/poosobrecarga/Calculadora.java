package com.gerardodev.poosobrecarga;

public class Calculadora {
    //Implementando Método Constructor private para que no se puedan crear instancias en otras clases
    private Calculadora() {
    }

    //Implementación de métodos
    //Sobrecarga de métodos (mismo nombre de método pero distinto tipo de parámetros/argumentos).
    public static int sumar(int a, int b){
        return a+b;
    }
    public static float sumar(float a, float b){
        return a+b;
    }
    public static float sumar(int a, float b){
        return a+b;
    }
    public static float sumar(float a, int b){
        return a+b;
    }
    public static double sumar(double a, double b){
        return a+b;
    }
    public static int sumar(String a, String b){
        int resultado;
        //Validación que retorna un 0 en caso de error
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    public static int sumar(int a, int b, int c){
        return a+b+c;
    }

    //Implementando varargs
    public static int sumar(int... argumentos){
        int total = 0;
        //Recorremos el array argumentos para asignarle valores a cada índice
        for(int i : argumentos){
            total += i;
        }
        return total;
    }
    public static float sumar(float a, int... argumentos){
        float total = a;
        //Recorremos el array argumentos para asignarle valores a cada índice
        for(int i : argumentos){
            total += i;
        }
        return total;
    }
    public static double sumar(double... varargs){
        double total = 0.0;
        for (double d : varargs){
            total += d;
        }
        return total;
    }
}
