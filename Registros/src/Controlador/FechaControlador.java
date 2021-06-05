/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modulo.Fecha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class FechaControlador {
    private List<Fecha> listaFecha;
    private Fecha seleccionado;
    
    public FechaControlador() {
        listaFecha = new ArrayList<>();
    }
    public long GenerarId(){
        return(listaFecha.size()>0)? listaFecha.get(listaFecha.size()-1).getId()+1:1;
    }
    
    public boolean crear(int dia, int mes, int anio){
        return listaFecha.add(new Fecha(GenerarId(), dia, mes, anio));
    }
    public Fecha buscar( int dia, int mes){
        for(Fecha fecha: listaFecha){
            if(fecha.getDia()==dia && fecha.getMes()==mes){
                seleccionado = fecha;
                return fecha;
            }
        }
        return null;
    }
    public boolean actualizar(int dia, int mes, int anio){
        Fecha fecha = buscar(dia, mes);
        if(fecha != null){
            int posicion=listaFecha.indexOf(fecha);
            fecha.setDia(dia);
            fecha.setMes(mes);
            fecha.setAnio(anio);
            listaFecha.set(posicion,fecha);
            return true;
        }
        return false;
    }
    public boolean eliminar(int dia, int mes){
        Fecha fecha = buscar(dia, mes);
        return listaFecha.remove(fecha);
        
    }

    public List<Fecha> getListaFecha() {
        return listaFecha;
    }

    public void setListaFecha(List<Fecha> listaFecha) {
        this.listaFecha = listaFecha;
    }

    public Fecha getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Fecha seleccionado) {
        this.seleccionado = seleccionado;
    }
                                                                                
}
