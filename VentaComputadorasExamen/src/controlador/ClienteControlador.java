/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DatoCliente;

/**
 *
 * @author mary zhingre
 */
public class ClienteControlador {
    private List<DatoCliente> listaCliente;
    private DatoCliente seleccionado;
    
    public ClienteControlador (){
        listaCliente = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaCliente.size() >0)? listaCliente.get(listaCliente.size() - 1).getId() + 1 : 1;
    }
    public boolean Crear (String nombreCompleto, String cedula, String fiabilidadPago){
        return listaCliente.add(new DatoCliente(GenerarId(), nombreCompleto, cedula,fiabilidadPago ));
    }
    public DatoCliente Buscar(String cedula){
        for (DatoCliente cliente : listaCliente) {
            if(cliente.getCedula().equals(cedula)){
                seleccionado = cliente;
                return cliente;
            }
        }
        return null;
    }
    public boolean Actualizar(String cedula, String nombreCompleto,String fiabilidadPago){
        DatoCliente cliente = Buscar(cedula);
        if(cliente != null){
            int posicion = listaCliente.indexOf(cliente);
            cliente.setNombreCompleto(nombreCompleto);
            cliente.setFiabilidadPago(fiabilidadPago);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String cedula){
        DatoCliente cliente = Buscar(cedula);
        return listaCliente.remove(cliente);
    }

    public List<DatoCliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<DatoCliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public DatoCliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(DatoCliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
