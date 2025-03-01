package com.gerardodev.pooclasesabstractas.form;

import com.gerardodev.pooclasesabstractas.form.elementos.ElementoForm;
import com.gerardodev.pooclasesabstractas.form.elementos.InputForm;
import com.gerardodev.pooclasesabstractas.form.elementos.SelectForm;
import com.gerardodev.pooclasesabstractas.form.elementos.TextareaForm;
import com.gerardodev.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        experiencia.setValor("... Más de dos años de experiencia ...");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);
//        elementos.add(username);
//        elementos.add(password);
//        elementos.add(email);
//        elementos.add(edad);
//        elementos.add(experiencia);
//        elementos.add(lenguaje);

//        for (ElementoForm e : elementos){
//            System.out.println(e.dibujarHtml());
//        }
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
