/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Aula;
import modelo.Grupo;

/**
 *
 * @author mary zhingre
 */
public class GrupoControlador {
    private List <Grupo> listaGrupo;
    private Grupo seleccionado;
    
    public  GrupoControlador (){
        listaGrupo = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaGrupo.size()>0)? listaGrupo.get(listaGrupo.size() -1).getId() +1 : 1;
    }
    
   public boolean Crear(String nombre) {
        Grupo grupo = new Grupo(GenerarId(), nombre); // Creo un nuevo grupo
        return listaGrupo.add(grupo); // Agrego a mi lista de datos
    }
    public boolean Crear( String nombre,Aula aula) {
        Grupo grupo = new Grupo(GenerarId(), nombre, aula); // Creo un nuevo grupo
        aula.getListadoGrupo().add(grupo); // Relación bidireccional // Agregamos a la lista de grupo de la aula 
        return listaGrupo.add(grupo); // Agrego a mi lista de datos 
    }
    
    
    public Grupo Buscar(String nombre){
       for (Grupo grupo : listaGrupo) {
            if(grupo.getNombre().equals(nombre)){
                
                return grupo;
            }
        }
        return null; 
    }
    public boolean Actualizar(String nombreAntiguo, String nombreNu){
        Grupo grupo = Buscar(nombreAntiguo);
        if(grupo != null){
            int posicion = listaGrupo.indexOf(grupo);
            grupo.setNombre(nombreNu);
            listaGrupo.set(posicion, grupo);
            return true;
        }
        return false;
    }
   public boolean Eliminar(String nombre) {
        Grupo grupo = this.Buscar(nombre);
        if(grupo != null){
            grupo.getAula().getListadoGrupo().remove(grupo);
            return listaGrupo.remove(grupo);
        }
        return false;
    }
    public void imprimir(){
        for (Grupo grupo : listaGrupo) {
            System.out.println(grupo);
        }
    }

    public List<Grupo> getListaGrupo() {
        return listaGrupo;
    }

    public void setListaGrupo(List<Grupo> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    public Grupo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Grupo seleccionado) {
        this.seleccionado = seleccionado;
    }

    
}
