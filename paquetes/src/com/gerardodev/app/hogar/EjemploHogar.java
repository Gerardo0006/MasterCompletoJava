package com.gerardodev.app.hogar;

import com.gerardodev.app.jardin.Perro;

import static com.gerardodev.app.hogar.Persona.saludar; //Importando el Package con el
// método static saludar() para usarlo como propio de ésta clase

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();

        //perro.jugar(); //Aquí podemos instanciar objetos del tipo Perro pero no podemos usar
        // el método jugar ya que está definido default, lo que significa que solamente
        // podremos acceder a él a través de clases que estén en su mismo contexto (a su nivel).

        //Usando método saludar() de la clase Persona (Ambas clases son del mismo Package)
        //String saludar1 = saludar(); //Sin importar el Package
        String saludar2 = saludar(); //Importando el Package
    }
}
