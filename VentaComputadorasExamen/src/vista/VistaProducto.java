/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ProductoControlador;
import java.util.Scanner;
import modelo.DatoProducto;

/**
 *
 * @author mary zhingre
 */
public class VistaProducto {
    private Scanner teclado;
    private ProductoControlador productoControlador;

    public VistaProducto( ProductoControlador productoControlador) {
        teclado = new Scanner(System.in);
        this.productoControlador = productoControlador;
    }
    public void Menu(){
         int opcion = 0;
        do {            
            System.out.println(" 1. Crear Producto \n 2. Actualizar Producto  \n 3. Buscar Producto  \n 4. Eliminar Producto \n 5. Listar Producto \n 6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.Crear(); break;
                case 2: this.Actualizar(); break;
                case 3: this.Buscar(); break;
                case 4: this.Eliminar(); break;
                case 5: this.Listar(); break;
            }
        } while (opcion < 6);
    }
     public void Crear(){
        System.out.println("Ingrese: \n Nombre del Producto");
        String descripcion = teclado.next();
        System.out.println("Precio del producto: ");
        double precioUnitaerio = teclado.nextDouble();
        System.out.println("Stock:");
        double stock = teclado.nextDouble();
        System.out.println("Con IVA? :");
        String iva = teclado.next();
        System.out.println("Res:" + productoControlador.Crear(descripcion, precioUnitaerio,stock,iva ));
    } 
      public DatoProducto Buscar(){
        System.out.println("Ingrese: \n Nombre del Producto: ");
        String descripcion = teclado.next();
        System.out.println(productoControlador.Buscar(descripcion));
        return productoControlador.Buscar(descripcion);
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n Nombre del Producto: ");
        String descripcion = teclado.next();
        System.out.println("Precio del producto: ");
        double precioUnitaerio = teclado.nextDouble();
        System.out.println("Stock:");
        double stock = teclado.nextDouble();
        System.out.println("Con IVA? :");
        String iva = teclado.next();
        System.out.println("Res:" + productoControlador.Actualizar(descripcion, precioUnitaerio,stock,iva ));
    } 
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ productoControlador.Eliminar(productoControlador.getSeleccionado().getDescripcion()));
    }
    public void Listar(){ 
        for (DatoProducto producto : productoControlador.getListaProducto()) {
            System.out.println(producto);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ProductoControlador getProductoControlador() {
        return productoControlador;
    }

    public void setProductoControlador(ProductoControlador productoControlador) {
        this.productoControlador = productoControlador;
    }
    
}
