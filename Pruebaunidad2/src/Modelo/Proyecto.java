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
public class Proyecto {
    private long id;
    private long codigo;
    private String nombreCompleto;
    private Jefeproyecto jefeProyecto;
    private List<Plano> listaPlanos;
    
    
    public Proyecto(long id, long codigo, String nombreCompleto) {
        this.id = id;
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.listaPlanos = new ArrayList();
       
    }

    public Proyecto(long id, long codigo, String nombreCompleto, Jefeproyecto jefeProyecto, List<Plano> listaPlanos) {
        this.id = id;
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.jefeProyecto = jefeProyecto;
        this.listaPlanos = listaPlanos;
    }

    public Proyecto(long id, long codigo, String nombreCompleto, Jefeproyecto jefeProyecto) {
        this.id = id;
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.jefeProyecto = jefeProyecto;
        listaPlanos = new ArrayList();
    }

 

  
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Jefeproyecto getJefeProyecto() {
        return jefeProyecto;
    }

    public void setJefeProyecto(Jefeproyecto jefeProyecto) {
        this.jefeProyecto = jefeProyecto;
    }

    public List<Plano> getListaPlanos() {
        return listaPlanos;
    }

    public void setListaPlanos(List<Plano> listaPlanos) {
        this.listaPlanos = listaPlanos;
    }

    @Override
    public String toString() {
        return "{" + "  " + jefeProyecto +  "\n Proyecto: [ Id: " + id + "  Codigo : " + codigo + "  NombreProyecto : " + nombreCompleto  + " ]" + '}';
    }
    
    

  
   
    
    
    
}
