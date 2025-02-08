package com.gerardodev.appfacturas.modelo;

public class ItemFactura {
    //Declaración de atributos
    private int cantidad;
    //Declaración de atributos de la relación con la clase Producto
    private Producto producto;

    //Implementamos método constructor
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //Implementación de métodos getter & setter
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Implementación de métodos getter & setter del atributo de relación con la clase Producto
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //Implementamos método para calcular el importe total de un producto
    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }
}
