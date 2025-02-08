package com.gerardodev.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    //Declaración de los atributos base de la clase Factura
    private int folio;
    private static int ultimoFolio;
    private String descripcion;
    private Date fecha;
    //Declaración de los atributos de la relación con Cliente
    private Cliente cliente; //También implementamos sus met getter&setter
    //Declaración de los atributos de la relación con ItemFactura
    private ItemFactura[] items; //También implementamos su método getter
    private int indiceItems;
    public static final int MAX_ITEMS = 10;

    //Implementación de método constructor
    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS]; //Importante crear la instancia del array en el método constructor
        this.folio = ++ultimoFolio; //Incrementamos el folio
        this.fecha = new Date();
    }

    //Implementación de métodos getter & setter
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Implementación de métodos getter & setter del atributo de la relación con Cliente
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Implementación de método getter del atributo de la relación con ItemFactura
    public ItemFactura[] getItem() {
        return items;
    }

    //Implementación de método addItem para agregar productos a la factura
    public void addItem(ItemFactura item){
        //Agregando validación para que no se desborde el array
        if(indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;
        }
    }

    //Implementación de método para calcular el total de la factura
    public float calcularTotal(){
        float total = 0.0f; //Inicializando la variable total de tipo float
        //Recorriendo el array de items para calcular la suma total (con bucle foreach)
        for(ItemFactura item : this.items){
            //Agregamos validación para que no tome en cuenta los null/vacíos
            if(item == null){
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    //Implementación de método para generar detalle de cada factura
    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura no. ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tRFC: ")
                .append(this.cliente.getRfc())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        //Implementando clase SimpleDateFormat para asignar formato a la fecha
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        sb.append("Fecha de emisión: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        //Implementando foreach para llenar la factura con la información de cada producto
        for(ItemFactura item : this.items){
            //Validación para saltar los valores null
            if(item == null){
                continue; //Salta la iteración actual y pasa a la siguiente
            }
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
        }
        sb.append("\nGran total: ")
                .append((calcularTotal()));

        return sb.toString();
    }
}
