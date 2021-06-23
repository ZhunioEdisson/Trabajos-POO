/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class Plano {
    private long Indentificacion;
    private String FechaEntrga;
    private String nombreArqui;
    private int nmFiguras;
    private Proyecto proyecto;
    private List<Figura> listaFigura;

    public Plano(long Indentificacion, String FechaEntrga, String nombreArqui, int nmFiguras) {
        this.Indentificacion = Indentificacion;
        this.FechaEntrga = FechaEntrga;
        this.nombreArqui = nombreArqui;
        this.nmFiguras = nmFiguras;
        listaFigura = new ArrayList();
    }
    

    public Plano(long Indentificacion, String FechaEntrga, String nombreArqui, int nmFiguras, Proyecto proyecto, List<Figura> listaFigura) {
        this.Indentificacion = Indentificacion;
        this.FechaEntrga = FechaEntrga;
        this.nombreArqui = nombreArqui;
        this.nmFiguras = nmFiguras;
        this.proyecto = proyecto;
        this.listaFigura = listaFigura;
    }

    public Plano(long Indentificacion, String FechaEntrga, String nombreArqui, int nmFiguras, Proyecto proyecto) {
        this.Indentificacion = Indentificacion;
        this.FechaEntrga = FechaEntrga;
        this.nombreArqui = nombreArqui;
        this.nmFiguras = nmFiguras;
        this.proyecto = proyecto;
        listaFigura = new ArrayList();
    }

    public long getIndentificacion() {
        return Indentificacion;
    }

    public void setIndentificacion(long Indentificacion) {
        this.Indentificacion = Indentificacion;
    }

    public String getFechaEntrga() {
        return FechaEntrga;
    }

    public void setFechaEntrga(String FechaEntrga) {
        this.FechaEntrga = FechaEntrga;
    }

    public String getNombreArqui() {
        return nombreArqui;
    }

    public void setNombreArqui(String nombreArqui) {
        this.nombreArqui = nombreArqui;
    }

    public int getNmFiguras() {
        return nmFiguras;
    }

    public void setNmFiguras(int nmFiguras) {
        this.nmFiguras = nmFiguras;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Figura> getListaFigura() {
        return listaFigura;
    }

    public void setListaFigura(List<Figura> listaFigura) {
        this.listaFigura = listaFigura;
    }

   

   

    @Override
    public String toString() {
        return "Plano{"  + proyecto+ " \n Plano: [  Indentificacion: " + Indentificacion + "  FechaEntrga : " + FechaEntrga + "  Arquitecto: " + nombreArqui + "  Figuras : " + nmFiguras  + " ]"+ '}';
    }
    
    
    
    
}
