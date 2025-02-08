package com.gerardodev.appfacturas.modelo;

public class Cliente {
    //Declaración de atributos
    private String nombre;
    private String rfc;

    //Implementamos métodos getter & setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}
