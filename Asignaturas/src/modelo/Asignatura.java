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
public class Asignatura {
    private long id;
    private String nombre;
    private Grupo grupo;
    
    public Asignatura(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Asignatura(long id, String nombre, Grupo grupo) {
        this.id = id;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", grupo=" + grupo + '}';
    }
    
    
    
    
    
}
