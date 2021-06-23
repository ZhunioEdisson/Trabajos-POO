/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mary zhingre
 */
public class Jefeproyecto {
    private long id;
    private String nombreCompleto;
    private String direccion;
    private String telefono;
   

    public Jefeproyecto(long id, String nombreCompleto, String direccion, String telefono) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
       
    }

    public Jefeproyecto(String nombreCompleto, String direccion, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Jefe[" + "Id: " + id + ", Nombre: " + nombreCompleto + ", Direccion: " + direccion + ", Telefono: " + telefono + ']';
    }
    
    
    
    
    
    
}
