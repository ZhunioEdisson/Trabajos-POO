/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Aula;

/**
 *
 * @author mary zhingre
 */
public class AulaControlador {
    private List<Aula> listaAula;
    private Aula seleccionado;
    
    public  AulaControlador (){
        listaAula = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaAula.size()>0)? listaAula.get(listaAula.size() -1).getId() +1 : 1;
    }
   
    public boolean Crear(String descripcion){
        Aula aula = new Aula(GenerarId(), descripcion);
        return listaAula.add(aula);
    }
    public Aula Buscar(String descripcion){
       for (Aula aula : listaAula) {
            if(aula.getDescripcion().equals(descripcion)){
                
                return aula;
            }
        }
        return null; 
    }
    public boolean Actualizar(String descripcionAntigua, String descripcionNu){
        Aula aula = Buscar(descripcionAntigua);
        if(aula != null){
            int posicion = listaAula.indexOf(aula);
            aula.setDescripcion(descripcionNu);
            listaAula.set(posicion, aula);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String descripcion){
        Aula aula = Buscar(descripcion);
        return listaAula.remove(aula);
    }

    public List<Aula> getListaAula() {
        return listaAula;
    }

    public void setListaAula(List<Aula> listaAula) {
        this.listaAula = listaAula;
    }

    public Aula getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Aula seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
}
