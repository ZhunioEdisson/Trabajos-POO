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
public class ControladorProyecto {
    private List<Proyecto> listadoProyecto;
    private Proyecto seleccionado; 
    
    public ControladorProyecto (){
        listadoProyecto = new ArrayList<>();
        seleccionado = null;
    }
    public long GenerarId(){
        return (listadoProyecto.size() >0)? listadoProyecto.get(listadoProyecto.size() - 1).getId() + 1 : 1;
    }
    public boolean Crear (long codigo, String nombreCompleto, Jefeproyecto jefeProyecto){
        return listadoProyecto.add(new Proyecto(GenerarId(),codigo, nombreCompleto,jefeProyecto ));
    }
    public Proyecto Buscar(long codigo){
        for (Proyecto proyecto : listadoProyecto) {
            if(proyecto.getCodigo() == codigo){
                seleccionado = proyecto;
                return proyecto;
            }
        }
        return null;
    }
    public boolean Actualizar(long codigo, String nombreCompleto){
        Proyecto proyecto = Buscar(codigo);
        if(proyecto != null){
            int posicion = listadoProyecto.indexOf(proyecto);
            proyecto.setNombreCompleto(nombreCompleto);
            listadoProyecto.set(posicion, proyecto);
            return true;
        }
        return false;
    }
    public boolean Eliminar(long codigo){
        Proyecto proyecto = Buscar(codigo);
        return listadoProyecto.remove(proyecto);
    }

    public List<Proyecto> getListadoProyecto() {
        return listadoProyecto;
    }

    public void setListadoProyecto(List<Proyecto> listadoProyecto) {
        this.listadoProyecto = listadoProyecto;
    }

    public Proyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Proyecto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
}
