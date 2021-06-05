/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorCliente {
    private List<Cliente> ListaCliente;
    private Cliente seleccionado;

    public ControladorCliente(){
        ListaCliente = new ArrayList();
        seleccionado = null;
    }
    
    public long GenerarId(){
        if(ListaCliente.size()>0){
            return ListaCliente.get(ListaCliente.size()-1).getId()+1;
        }else{
            return 1;
        }
    }
    
    public Cliente buscar(String cedula){
        for(Cliente cliente : ListaCliente){
            if(cliente.getCedula().equals(cedula))
               return cliente;
        }
        return null;
    }
    
    public boolean crear(String nombre, String apellido,String cedula,String direccion,String telefono ){
        Cliente e= new Cliente(this.GenerarId(),nombre,apellido,cedula,direccion,telefono);
        return ListaCliente.add(e);
    }
    
    public boolean actualizar(String nombre, String apellido,String cedula,String direccion,String telefono){
        Cliente cliente =this.buscar(cedula);
        if(cliente!=null){
            int posicion = ListaCliente.indexOf(cliente);
            cliente.setDireccion(direccion);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(telefono);
            ListaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String cedula){
        Cliente cliente =this.buscar(cedula);
        if(cliente!=null)
            return ListaCliente.remove(cliente);
        return false;
    }

    public List<Cliente> getListaCliente() {
        return ListaCliente;
    }

    public void setListaCliente(List<Cliente> ListaCliente) {
        this.ListaCliente = ListaCliente;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
