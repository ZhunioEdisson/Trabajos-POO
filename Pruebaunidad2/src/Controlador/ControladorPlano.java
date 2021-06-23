/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Plano;
import Modelo.Proyecto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorPlano {
    private List<Plano> listadoPlanos;
    private Plano seleccionado;
    
    public ControladorPlano() {
        listadoPlanos = new ArrayList<Plano>();
        seleccionado = null;
    }
    public boolean Crear(long Indentificacion, String FechaEntrga, String nombreArqui, int nmFiguras ) {
        Plano plano = new Plano(Indentificacion, FechaEntrga, nombreArqui, nmFiguras ); // Creo un nuevo cliente
        return listadoPlanos.add(plano); 
    }
  
    public boolean Crear(long Indentificacion, String FechaEntrga, String nombreArqui, int nmFiguras, Proyecto proyecto) {
        Plano plano = new Plano(Indentificacion, FechaEntrga, nombreArqui, nmFiguras, proyecto); // Creo un nuevo cliente
        proyecto.getListaPlanos().add(plano); // Relación bidireccional // Agregamos a la lista de cliente de la empresa 
        return listadoPlanos.add(plano); // Agrego a mi lista de datos
    }
    public Plano Buscar(long Indentificacion){
        for (Plano plano : listadoPlanos) { // Recorre cada uno de los planos dentro de la lista de datos
            if(plano.getIndentificacion() == Indentificacion){  
                seleccionado = plano;
                return plano; // 
            }
        }
        return null; // Si no encuentra retorna null
    }
    public boolean Actualizar(long Indentificacion,String FechaEntrga, String nombreArqui, int nmFiguras ) {
        Plano plano = this.Buscar(Indentificacion); // busco al plano con la Indentificacion
        if(plano != null) { // Comprobar que el plano exista
            int posicion = listadoPlanos.indexOf(plano); // obtengo la posición del plano actual
            plano.setFechaEntrga(FechaEntrga);
            plano.setNombreArqui(nombreArqui);
            plano.setNmFiguras(nmFiguras);
            listadoPlanos.set(posicion, plano);
            return true;
        }
        return false;
    }
    public boolean Eliminar(long Indentificacion) {
        Plano plano = Buscar(Indentificacion);
        return listadoPlanos.remove(plano);
       
          
    }

    public List<Plano> getListadoPlanos() {
        return listadoPlanos;
    }

    public void setListadoPlanos(List<Plano> listadoPlanos) {
        this.listadoPlanos = listadoPlanos;
    }

    public Plano getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Plano seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
}
