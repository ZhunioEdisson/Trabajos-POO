/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mary zhingre
 */
public class DatoProducto {
    private long id;
    private String descripcion;
    private double precioUnitaerio;
    private double stock;
    private String iva;

    public DatoProducto(long id, String descripcion, double precioUnitaerio, double stock, String iva) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitaerio = precioUnitaerio;
        this.stock = stock;
        this.iva = iva;
    }

    public DatoProducto(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public DatoProducto(String descripcion, double precioUnitaerio, double stock, String iva) {
        this.descripcion = descripcion;
        this.precioUnitaerio = precioUnitaerio;
        this.stock = stock;
        this.iva = iva;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitaerio() {
        return precioUnitaerio;
    }

    public void setPrecioUnitaerio(double precioUnitaerio) {
        this.precioUnitaerio = precioUnitaerio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", NombreProducto=" + descripcion + ", ValorUnitario=" + precioUnitaerio + ", Stock=" + stock + ", IVA=" + iva + '}';
    }
    
    
    
}
