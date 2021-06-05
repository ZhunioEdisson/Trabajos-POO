/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modulo.Dni;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class DniControlador {
    private List<Dni> listaDni;
    private Dni seleccionado;
    
    public DniControlador(){
        listaDni = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaDni.size() >0)? listaDni.get(listaDni.size() - 1).getId() + 1 : 1;
    }
    public boolean Crear (String numero, int codigoVerificacion){
        return listaDni.add(new Dni(GenerarId(), numero, codigoVerificacion));
    }
    public Dni Buscar(String numero){
        for (Dni dni : listaDni) {
            if(dni.getNumero().equals(numero)){
                seleccionado = dni;
                return dni;
            }
        }
        return null;
    }
    public boolean Actualizar(String numero, int codigoVerificacion){
        Dni dni = Buscar(numero);
        if(dni != null){
            int posicion = listaDni.indexOf(dni);
            dni.setCodigoVerificacion(codigoVerificacion);
            listaDni.set(posicion, dni);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String numero){
        Dni dni = Buscar(numero);
        return listaDni.remove(dni);
    }

    public List<Dni> getListaDni() {
        return listaDni;
    }

    public void setListaDni(List<Dni> listaDni) {
        this.listaDni = listaDni;
    }

    public Dni getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Dni seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
