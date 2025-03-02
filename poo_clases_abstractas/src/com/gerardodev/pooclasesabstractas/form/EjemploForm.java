package com.gerardodev.pooclasesabstractas.form;

import com.gerardodev.pooclasesabstractas.form.elementos.*;
import com.gerardodev.pooclasesabstractas.form.elementos.select.Opcion;

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

        lenguaje.addOpcion(new Opcion("1", "Java"));
        lenguaje.addOpcion(new Opcion("2", "JavaScript"));
        lenguaje.addOpcion(new Opcion("3", "Python"));
        lenguaje.addOpcion(new Opcion("4", "TypeScript").setSelected());
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name=\"" + this.nombre + "\" value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola qué tal, éste campo está deshabilitado!");
        username.setValor("gerardo.macias");
        password.setValor("a1b2c3");
        email.setValor("gerardo@email.com");
        edad.setValor("24");
        experiencia.setValor("... Más de dos años de experiencia ...");
        //java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);
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
