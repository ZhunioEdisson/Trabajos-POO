/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author mary zhingre
 */
public class Factura {
    private long id;
    private double codigo;
    private int cantidad;
    private double precio;
    private Date fechaRegistro;
    private DatoProducto datoProducto;
    private DatoCliente datoCliente;
    
    public void Borrador(){
    }

    public Factura(long id, double codigo, int cantidad, double precio, Date fechaRegistro, DatoProducto datoProducto, DatoCliente datoCliente) {
        this.id = id;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
        this.datoProducto = datoProducto;
        this.datoCliente = datoCliente;
    }

    public Factura(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    

    public Factura(DatoProducto datoProducto, DatoCliente datoCliente) {
        this.datoProducto = datoProducto;
        this.datoCliente = datoCliente;
    }

    public Factura(long id, int cantidad, double precio, Date fechaRegistro) {
        this.id = id;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaRegistro = fechaRegistro;
    }

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DatoProducto getDatoProducto() {
        return datoProducto;
    }

    public void setDatoProducto(DatoProducto datoProducto) {
        this.datoProducto = datoProducto;
    }

    public DatoCliente getDatoCliente() {
        return datoCliente;
    }

    public void setDatoCliente(DatoCliente datoCliente) {
        this.datoCliente = datoCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", CodigoF=" + codigo + ", Cantidad=" + cantidad + ", Producto=" + datoProducto + ", Cliente=" + datoCliente + ", PrecioFinal=" + precio + ", Fecha=" + fechaRegistro + '}';
    }

   
    
}
