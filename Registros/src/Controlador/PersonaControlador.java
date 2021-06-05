/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modulo.Dni;
import Modulo.Fecha;
import Modulo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class PersonaControlador {
    private List<Persona> listaPersona;
    private Persona seleccionado;
    
    public PersonaControlador(){
        listaPersona = new ArrayList <>();
    }
    public long GenerarId(){
        return(listaPersona.size()>0)? listaPersona.get(listaPersona.size()-1).getId()+1:1;
    }
    
    public boolean Crear(String NombreCompleto, Fecha fecha, Dni dni ){
        return listaPersona.add(new Persona(GenerarId(), NombreCompleto, fecha, dni));
    }
    public Persona Buscar(String NombreCompleto){
        for (Persona persona : listaPersona) {
            if(persona.getNombreCompleto().equals(NombreCompleto)){
                seleccionado = persona;
                return persona;
            }
        }
        return null;
    }
    public boolean Actualizar(String NombreCompleto, Fecha fecha, Dni dni){
        Persona persona = Buscar(NombreCompleto);
        if(persona != null){
            int posicion = listaPersona.indexOf(persona);
            persona.setFecha(fecha);
            persona.setDni(dni);
            listaPersona.set(posicion, persona);
            return true;
        }
        return false;
    }
    public boolean eliminar(String NombreCompleto){
        Persona persona = Buscar(NombreCompleto);
        return listaPersona.remove(persona);
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public Persona getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Persona seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
    
}
