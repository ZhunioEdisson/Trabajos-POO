/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Figura;
import Modelo.Linea;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorLinea {
    private List<Linea> listadoLinea;
    private Linea seleccion;

    public ControladorLinea() {
        listadoLinea = new ArrayList<>();
        seleccion = null;
    }
     public long GenerarId(){
        return (listadoLinea.size() >0)? listadoLinea.get(listadoLinea.size() - 1).getId() + 1 : 1;
    }
     
    
     public boolean Crear(  int puntoX1, int puntoY1, int puntoX2, int puntoY2, double Longitud){
        Linea linea = new Linea( GenerarId(), puntoX1,  puntoY1,  puntoX2,  puntoY2,Longitud);
        return listadoLinea.add(linea);
    }
    
    public boolean Crear( int puntoX1, int puntoY1, int puntoX2, int puntoY2,double Longitud,Figura figura ){
        
        
        Linea linea = new Linea( GenerarId(), puntoX1,  puntoY1,  puntoX2,  puntoY2,Longitud,figura );
        figura.getListaLinea().add(linea);
        return listadoLinea.add(linea);
    }
    
    public Linea Buscar(double longitud){
        for (Linea fi : listadoLinea) {
            if(fi.getLongitud()==longitud){
                seleccion = fi;
                return fi;
            }
        }
        return null;
    }
    public boolean Eliminar(double longitud){
        Linea linea = this.Buscar(longitud);
        return listadoLinea.remove(linea);
    }

    public List<Linea> getListadoLinea() {
        return listadoLinea;
    }

    public void setListadoLinea(List<Linea> listadoLinea) {
        this.listadoLinea = listadoLinea;
    }

    public Linea getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Linea seleccion) {
        this.seleccion = seleccion;
    }
    
    
    
    
     
}
