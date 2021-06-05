/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorEmpresa {
    private List<Empresa>ListaEmpresa;
    private Empresa seleccionado;
    
    public ControladorEmpresa(){
        ListaEmpresa = new ArrayList();
        seleccionado = null;
    }
    
    public long GenerarId(){
        return (ListaEmpresa.size()>0)?ListaEmpresa.get(ListaEmpresa.size()-1).getId()+1:1;
    }
    
    public boolean crear(String nombre){
        return ListaEmpresa.add(new Empresa(GenerarId(),nombre));
    }
    
    public Empresa buscar(String nombre){
        for(Empresa empresa :ListaEmpresa){
            if(empresa.getNombre().equals(nombre))
                return empresa;
        }
        return null;
    }
    
    public boolean actulizar(String nombreAnterior,String nombre){
         Empresa empresa =this.buscar(nombreAnterior);
        if(empresa!=null){
            int posicion = ListaEmpresa.indexOf(empresa);
            empresa.setNombre(nombre);
            ListaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        Empresa empresa =this.buscar(nombre);
        return ListaEmpresa.remove(empresa);
    }
    public boolean agregarEmpleado(Empleado empleado){
        return seleccionado.getListadoEmpleados().add(empleado);
    }
    public boolean agregarCliente(Cliente cliente){
        return seleccionado.getListadoClientes().add(cliente);
    }


    public List<Empresa> getListaEmpresa() {
        return ListaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> ListaEmpresa) {
        this.ListaEmpresa = ListaEmpresa;
    }

    public Empresa getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Empresa seleccionado) {
        this.seleccionado = seleccionado;
    }
    
    
}
