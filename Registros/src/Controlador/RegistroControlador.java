/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modulo.Dni;
import Modulo.Fecha;
import Modulo.Persona;
import Modulo.Registro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class RegistroControlador {
    private Registro seleccionado;
    private List<Registro> listaRegistro;
    
    public  RegistroControlador (){
        listaRegistro = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaRegistro.size()>0)? listaRegistro.get(listaRegistro.size() -1).getId() +1 : 1;
    }
    public boolean Crear(String codigo, Date fechaRegistro, Persona persona){
        return listaRegistro.add(new Registro(GenerarId(), codigo, fechaRegistro, persona));
    }
    public Registro Buscar(String codigo){
        for (Registro registro : listaRegistro) {
            if(registro.getCodigo().equals(codigo)){
                seleccionado = registro;
                return registro;
            }
        }
        return null;
    }
    public boolean Actualizar(String codigo, Date fechaRegistro, Persona persona){
        Registro registro = Buscar(codigo);
        if(registro != null){
            int posicion = listaRegistro.indexOf(registro);
            registro.setFechaRegistro(fechaRegistro);
            registro.setPersona(persona);
            listaRegistro.set(posicion, registro);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String codigo){
        Registro registro = Buscar(codigo);
        return listaRegistro.remove(registro);
    }

    public Registro getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Registro seleccionado) {
        this.seleccionado = seleccionado;
    }

    public List<Registro> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<Registro> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }
    
}
