/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mary zhingre
 */
public class ControladorEmpleado {
    private List<Empleado> ListaEmpleado;
    private Empleado seleccionado;

    public ControladorEmpleado() {
        ListaEmpleado = new ArrayList();
        seleccionado = null;
    }
    public long GenerarId(){
        if(ListaEmpleado.size()>0){
            return ListaEmpleado.get(ListaEmpleado.size()-1).getId()+1;
        }else{
            return 1;
        }
    }
    public boolean crear (String nombre, String apellido,String cedula,String direccion,double sueldoBruto){
        Empleado e= new Empleado(this.GenerarId(),nombre,apellido,cedula,direccion,sueldoBruto);
        return ListaEmpleado.add(e);
    }
    
    public Empleado buscar(String cedula){
        for(Empleado empleado : ListaEmpleado){
            if(empleado.getCedula().equals(cedula))
               return empleado;
        }
        return null;
    }
    public boolean actualizar(String nombre, String apellido,String cedula,String direccion,double sueldoBruto){
        Empleado empleado =this.buscar(cedula);
        if(empleado!=null){
            int posicion = ListaEmpleado.indexOf(empleado);
            empleado.setDireccion(direccion);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setSueldoBruto(sueldoBruto);
            ListaEmpleado.set(posicion, empleado);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula){
        Empleado empleado =this.buscar(cedula);
        if(empleado!=null)
            return ListaEmpleado.remove(empleado);
        return false;
    }
    

    public List<Empleado> getListaEmpleado() {
        return ListaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> ListaEmpleado) {
        this.ListaEmpleado = ListaEmpleado;
    }

    public Empleado getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Empleado seleccionado) {
        this.seleccionado = seleccionado;
    }

   
    
    
}
