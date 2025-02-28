package com.gerardodev.pooclasesabstractas.form;

import com.gerardodev.pooclasesabstractas.form.elementos.InputForm;
import com.gerardodev.pooclasesabstractas.form.elementos.SelectForm;
import com.gerardodev.pooclasesabstractas.form.elementos.TextareaForm;
import com.gerardodev.pooclasesabstractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("Contraseña", "password");
        InputForm email = new InputForm("Correo", "email");
        InputForm edad = new InputForm("Edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "JavaScript"));
        lenguaje.addOpcion(new Opcion("3", "Python"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("gerardo.macias");
        password.setValor("a1b2c3");
        email.setValor("gerardo@email.com");
        edad.setValor("24");
        java.setSelected(true);

    }
}
