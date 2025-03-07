package com.gerardodev.pooclasesabstractas.form;

import com.gerardodev.pooclasesabstractas.form.elementos.*;
import com.gerardodev.pooclasesabstractas.form.elementos.select.Opcion;
import com.gerardodev.pooclasesabstractas.form.validador.EmailValidador;
import com.gerardodev.pooclasesabstractas.form.validador.LargoValidador;
import com.gerardodev.pooclasesabstractas.form.validador.NoNuloValidador;
import com.gerardodev.pooclasesabstractas.form.validador.RequeridoValidador;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        //Implementación de validador
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("Contraseña", "password");
        //Implementación de validador
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("Correo", "email");
        //Implementación de validador
        email.addValidador(new RequeridoValidador())
            .addValidador(new EmailValidador());

        InputForm edad = new InputForm("Edad", "number");
        //Implementación de validador
        edad.addValidador(new RequeridoValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        //Implementación de validador
        lenguaje.addValidador(new NoNuloValidador());

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

        //Implementación de Validación en cada elemento de la lista 'elementos'
        elementos.forEach(e -> {
            /*e.getErrores().forEach(err -> {
                System.out.println(e.getNombre() + ": " + err); //Esto se puede reemplazar/optmizar usando el método de referencia
            });*/
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println); //Ésta es la versión optimizada pero no permite imprimir el nombre del campo que se está validando
            }
        });


    }
}
