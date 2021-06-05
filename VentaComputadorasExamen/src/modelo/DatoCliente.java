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
public class DatoCliente {
    private long id;
    private String nombreCompleto;
    private String cedula;
    private String fiabilidadPago;

    public DatoCliente(long id, String nombreCompleto, String cedula, String fiabilidadPago) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
    }

    public DatoCliente(long id, String nombreCompleto, String cedula) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
    }

    public DatoCliente(String nombreCompleto, String cedula, String fiabilidadPago) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFiabilidadPago() {
        return fiabilidadPago;
    }

    public void setFiabilidadPago(String fiabilidadPago) {
        this.fiabilidadPago = fiabilidadPago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", Nombre=" + nombreCompleto + ", cedula=" + cedula + ", MetodoPago=" + fiabilidadPago + '}';
    }
    
    
    
}
