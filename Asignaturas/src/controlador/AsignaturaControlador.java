/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;
import modelo.Grupo;

/**
 *
 * @author mary zhingre
 */
public class AsignaturaControlador {
    private List<Asignatura> listaAsignatura;
    private Asignatura seleccionado;
    
    public AsignaturaControlador(){
        listaAsignatura = new ArrayList();
        seleccionado = null;
    }
    public long GenerarId(){
        return (listaAsignatura.size()>0)? listaAsignatura.get(listaAsignatura.size() -1).getId() +1 : 1;
    }
    public boolean crear(String nombre, Grupo grupo){
        Asignatura asignatura = new Asignatura(this.GenerarId(), nombre, grupo);
        grupo.getListadoAsignatura().add(asignatura);
        return listaAsignatura.add(asignatura);
    }
   public Asignatura Buscar(String nombre){
       for (Asignatura asignatura : listaAsignatura) {
            if(asignatura.getNombre().equals(nombre)){
                seleccionado = asignatura;
                return asignatura;
            }
        }
        return null; 
    }
    public boolean Actualizar(String nombreAnterior, String nombreNuevo){
        Asignatura asignatura = this.Buscar(nombreAnterior);
        if(asignatura != null){
            int posicion = listaAsignatura.indexOf(asignatura);
            asignatura.setNombre(nombreNuevo);
            listaAsignatura.set(posicion, asignatura);
            return true;
        }
        return false;
    }
   public boolean Eliminar(String nombre) {
        Asignatura asignatura = this.Buscar(nombre);
        if(asignatura != null){
            asignatura.getGrupo().getListadoAsignatura().remove(asignatura);
            return listaAsignatura.remove(asignatura);
        }
        return false;
    }

    public List<Asignatura> getListaAsignatura() {
        return listaAsignatura;
    }

    public void setListaAsignatura(List<Asignatura> listaAsignatura) {
        this.listaAsignatura = listaAsignatura;
    }

    public Asignatura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Asignatura seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
