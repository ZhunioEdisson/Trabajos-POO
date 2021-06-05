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
public class Dni {
    private long id;
    private String numero;
    private int codigoVerificacion;

    public Dni(long id, String numero, int codigoVerificacion) {
        this.id = id;
        this.numero = numero;
        this.codigoVerificacion = codigoVerificacion;
    }

    public Dni(String numero) {
        this.numero = numero;
    }

    public Dni(long id, int codigoVerificacion) {
        this.id = id;
        this.codigoVerificacion = codigoVerificacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(int codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    @Override
    public String toString() {
        return "Dni{" + "id=" + id + ", numero=" + numero + ", codigoVerificacion=" + codigoVerificacion + '}';
    }
    
    
    
}
