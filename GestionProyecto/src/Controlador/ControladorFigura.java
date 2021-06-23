/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Figura;
import Modelo.Plano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorFigura {
    private List< Figura> listadoFigura;
    private Figura seleccion;

    public ControladorFigura() {
        listadoFigura = new ArrayList<Figura>();
        seleccion = null;
    }
    
    public boolean Crear( long indetificador, String nombre, String color, int NumLineas){
        Figura figura = new Figura( indetificador, nombre, color, NumLineas);
        return listadoFigura.add(figura);
    }
    public boolean Crear( long indetificador, String nombre, String color, int NumLineas, Plano plano){
        Figura figura = new Figura( indetificador, nombre, color, NumLineas, plano);
        plano.getListaFigura().add(figura);
        return listadoFigura.add(figura);
    }
    public Figura Buscar(long indetificador){
        for (Figura fi : listadoFigura) {
            if(fi.getIndetificador()== indetificador){
                seleccion = fi;
                return fi;
            }
        }
        return null;
    }
    public boolean ActualizarFigura(long indetificador, String nombre, String color, int NumLineas ){
        Figura figura = Buscar(indetificador);
        if(figura !=null){
            int posicion = listadoFigura.indexOf(figura);
            figura.setNombre(nombre);
            figura.setColor(color);
            figura.setNumLineas(NumLineas);
            listadoFigura.set(posicion, figura);
            return true;
        }
        return false;
    }
    public boolean Eliminar(long indetificador){
        Figura figura = this.Buscar(indetificador);
        return listadoFigura.remove(figura);
    }

    public List<Figura> getListadoFigura() {
        return listadoFigura;
    }

    public void setListadoFigura(List<Figura> listadoFigura) {
        this.listadoFigura = listadoFigura;
    }

    public Figura getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Figura seleccion) {
        this.seleccion = seleccion;
    }
    
    
}
