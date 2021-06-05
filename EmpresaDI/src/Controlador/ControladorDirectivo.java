/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Directivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorDirectivo {
    private List<Directivo>ListaDirectivo;
    private Directivo seleccionado;
    
    public ControladorDirectivo(){
        ListaDirectivo = new ArrayList();
        seleccionado = null;
    }
    
    public long GenerarId(){
         if(ListaDirectivo.size()>0){
            return ListaDirectivo.get(ListaDirectivo.size()-1).getId()+1;
        }else{
            return 1;
        }
    }
    
    public boolean crear(String nombre, String apellido,String cedula,String direccion,double sueldoBruto,String categoria){
        Directivo e= new Directivo(this.GenerarId(),nombre,apellido,cedula,direccion,sueldoBruto,categoria);
        return ListaDirectivo.add(e);
    }
    
    public Directivo buscar(String cedula){
        for(Directivo directivo : ListaDirectivo){
            if(directivo.getCedula().equals(cedula))
               return directivo;
        }
        return null;
    }
    
     public boolean actualizar(String nombre, String apellido,String cedula,String direccion,double sueldoBruto,String categoria){
        Directivo directivo =this.buscar(cedula);
        if(directivo!=null){
            int posicion = ListaDirectivo.indexOf(directivo);
            directivo.setApellido(apellido);
            directivo.setNombre(nombre);
            directivo.setSueldoBruto(sueldoBruto);
            directivo.setCategoria(categoria);
            directivo.setDireccion(direccion);
            ListaDirectivo.set(posicion, directivo);
            return true;
        }
        return false;
    }
     
    public boolean eliminar(String cedula){
        Directivo directivo =this.buscar(cedula);
        return ListaDirectivo.remove(directivo);
    }

    public List<Directivo> getListaDirectivo() {
        return ListaDirectivo;
    }

    public void setListaDirectivo(List<Directivo> ListaDirectivo) {
        this.ListaDirectivo = ListaDirectivo;
    }

    public Directivo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Directivo seleccionado) {
        this.seleccionado = seleccionado;
    }

    
 
    
}
