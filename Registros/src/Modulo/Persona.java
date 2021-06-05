/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author mary zhingre
 */
public class Persona {
    private long id;
    private String NombreCompleto;
    private Fecha fecha;
    private Dni dni;

    public Persona(long id, String NombreCompleto, Fecha fecha, Dni dni) {
        this.id = id;
        this.NombreCompleto = NombreCompleto;
        this.fecha = fecha;
        this.dni = dni;
    }

    public Persona(long id, String NombreCompleto ) {
        this.id = id;
        this.NombreCompleto = NombreCompleto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", NombreCompleto=" + NombreCompleto + ", fecha=" + fecha + ", dni=" + dni + '}';
    }
    

}
