/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class Figura {
    private Plano plano;
    private long indetificador;
    private String nombre;
    private String color;
    private int NumLineas;
    private List<Linea> listaLinea;

    public Figura(long indetificador, String nombre, String color, int NumLineas) {
        this.indetificador = indetificador;
        this.nombre = nombre;
        this.color = color;
        this.NumLineas = NumLineas;
        listaLinea = new ArrayList();
    }

    public Figura( long indetificador, String nombre, String color, int NumLineas,Plano plano) {
        this.indetificador = indetificador;
        this.nombre = nombre;
        this.color = color;
        this.NumLineas = NumLineas;
        this.plano = plano;
        listaLinea = new ArrayList();
    }

    public Figura(String nombre, String color, int NumLineas,List<Linea> listaLinea) {
        this.nombre = nombre;
        this.color = color;
        this.NumLineas = NumLineas;
        this.listaLinea = listaLinea;
    }

    
    

    public long getIndetificador() {
        return indetificador;
    }

    public void setIndetificador(long indetificador) {
        this.indetificador = indetificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumLineas() {
        return NumLineas;
    }

    public void setNumLineas(int NumLineas) {
        this.NumLineas = NumLineas;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Linea> getListaLinea() {
        return listaLinea;
    }

    public void setListaLinea(List<Linea> listaLinea) {
        this.listaLinea = listaLinea;
    }
    

    @Override
    public String toString() {
        return "{"   + plano + "\n Figura:[ Indentificador : " + indetificador + "  Nombre : " + nombre + "  Color : " + color + "  Lineas : " + NumLineas + " ]"+'}';
    }

    
     
    

    
   
    
}
