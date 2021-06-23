/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jefeproyecto;
import Modelo.Proyecto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorJefe {
    private List<Jefeproyecto> listadoJefe;
    private Jefeproyecto seleccionado;

    public ControladorJefe() {
        listadoJefe = new ArrayList<>();
        this.seleccionado = seleccionado;
    }
    
    public long GenerarId(){
        return (listadoJefe.size() >0)? listadoJefe.get(listadoJefe.size() - 1).getId() + 1 : 1;
    }
    public boolean Crear (String nombreCompleto, String direccion, String telefono){
        return listadoJefe.add(new Jefeproyecto(GenerarId(), nombreCompleto,direccion, telefono ));
    }
    public Jefeproyecto Buscar(String nombreCompleto){
        for (Jefeproyecto jefe : listadoJefe) {
            if(jefe.getNombreCompleto().equals(nombreCompleto)){
                seleccionado = jefe;
                return jefe;
            }
        }
        return null;
    }
    public boolean Actualizar(String nombreCompleto,String direccion, String telefono){
        Jefeproyecto jefe = Buscar(nombreCompleto);
        if(jefe != null){
            int posicion = listadoJefe.indexOf(jefe);
            jefe.setDireccion(direccion);
            jefe.setTelefono(telefono);
            listadoJefe.set(posicion, jefe);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String nombreCompleto){
        Jefeproyecto jefe = Buscar(nombreCompleto);
        return listadoJefe.remove(jefe);
    }

    public List<Jefeproyecto> getListadoJefe() {
        return listadoJefe;
    }

    public void setListadoJefe(List<Jefeproyecto> listadoJefe) {
        this.listadoJefe = listadoJefe;
    }

    public Jefeproyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Jefeproyecto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
    
    
    
    
}
