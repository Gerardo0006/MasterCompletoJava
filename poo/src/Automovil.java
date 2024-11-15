//Las clases tienen 2 modificadores de acceso (public y default (para usar
// default no se escribe nada antes del nombre de la clase)).
public class Automovil {

    //Declaramos los atributos
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    /*
    //Agregamos Métodos
    public void detalle(){
        //Es buena práctica y más recomendado usar this
        //Es mala practica imprimir dentro del método con sout
        String modelo = "Otro modelo";
        System.out.println("auto.fabricante = " + fabricante); //Aquí aunque quitemos el
        // this, hace referencia al atributo porque dentro del método no hay otra variable
        // con el mismo nombre del método
        System.out.println("modelo = " + modelo); //Se puede omitir la palabra this,
        // pero en este caso está haciendo referencia al String modelo y no al atributo.
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);
    }*/

    public String verDetalle(){
        //StringBuilder sb = new StringBuilder(); //Optimización de Código, aquí no usamos la variable sb y por ende podemos omitirla
        return ("auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo  +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada);
        //return sb.toString(); //Optimización de Código, aquí no usamos la variable sb y por ende podemos omitirla
    }

    //Otro método (acelerar)
    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " está acelerando a " + rpm + "rpm";
    }

    //Otro método (frenar)
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    //Otro método (acelerar y frenar)
    public String acelerarFrenar(int rpm){
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n" + frenar;
    }
}
