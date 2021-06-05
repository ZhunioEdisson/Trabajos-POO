/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.DatoCliente;
import modelo.DatoProducto;
import modelo.Factura;

/**
 *
 * @author mary zhingre
 */
public class FacturaControlador {
    private List<Factura> listaFactura;
    private Factura seleccionado;
    public FacturaControlador(){
        listaFactura = new ArrayList<>();
    }
     public long GenerarId(){
        return(listaFactura.size()>0)? listaFactura.get(listaFactura.size()-1).getId()+1:1;
    }
     public boolean Crear(double codigo, int cantidad, double precio, Date fechaRegistro, DatoProducto datoProducto, DatoCliente datoCliente ){
        return listaFactura.add(new Factura(GenerarId(),codigo, cantidad,precio,fechaRegistro,datoProducto,datoCliente));
    } 
    public Factura Buscar(double codigo){
        for (Factura factura : listaFactura) {
             if(factura.getCodigo() == codigo ){
                seleccionado = factura;
                return factura;
            }
        }
        return null;
    }
    public boolean Actualizar(double codigo, int cantidad, double precio ){
        Factura factura = Buscar(codigo);
        if(factura != null){
            int posicion = listaFactura.indexOf(factura);
            factura.setCantidad(cantidad);
            factura.setPrecio(precio);
            listaFactura.set(posicion, factura);
            return true;
        }
        return false;
    }
     public boolean Eliminar(double codigo){
        Factura factura = Buscar(codigo);
        return listaFactura.remove(factura);
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }

   
     
}
