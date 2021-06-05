/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DatoProducto;

/**
 *
 * @author mary zhingre
 */
public class ProductoControlador {
    private List<DatoProducto> listaProducto;
    private DatoProducto seleccionado;
    public ProductoControlador(){
        listaProducto = new ArrayList<>();
    }
    public long GenerarId(){
        return (listaProducto.size() >0)? listaProducto.get(listaProducto.size() - 1).getId() + 1 : 1;
    }
    public boolean Crear (String descripcion, double precioUnitaerio, double stock, String iva){
        return listaProducto.add(new DatoProducto(GenerarId(), descripcion, precioUnitaerio,stock,iva ));
    }
    public DatoProducto Buscar(String descripcion){
        for (DatoProducto producto : listaProducto) {
            if(producto.getDescripcion().equals(descripcion)){
                seleccionado = producto;
                return producto;
            }
        }
        return null;
    }
    public boolean Actualizar(String descripcion, double precioUnitaerio, double stock, String iva){
        DatoProducto producto = Buscar(descripcion);
        if(producto != null){
            int posicion = listaProducto.indexOf(producto);
            producto.setPrecioUnitaerio(precioUnitaerio);
            producto.setStock(stock);
            producto.setIva(iva);
            listaProducto.set(posicion, producto);
            return true;
        }
        return false;
    }
    public boolean Eliminar(String descripcion){
        DatoProducto producto = Buscar(descripcion);
        return listaProducto.remove(producto);
    }

    public List<DatoProducto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<DatoProducto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public DatoProducto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(DatoProducto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
