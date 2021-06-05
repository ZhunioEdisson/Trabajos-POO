/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ClienteControlador;
import controlador.FacturaControlador;
import controlador.ProductoControlador;
import java.util.Scanner;
import modelo.DatoCliente;
import modelo.DatoProducto;

/**
 *
 * @author mary zhingre
 */
public class VistaGeneral {
    private Scanner teclado;
    private VistaCliente vistaCliente;
    private VistaProducto vistaProducto;
    private VistaFactura vistaFactura;
    private ClienteControlador clienteControlador;
    private ProductoControlador productoControlador;
    private FacturaControlador facturaControlador;
    
    public VistaGeneral(){
        teclado =new Scanner(System.in);
        clienteControlador = new ClienteControlador();
        productoControlador = new ProductoControlador();
        facturaControlador = new FacturaControlador();
        vistaCliente = new  VistaCliente(clienteControlador);
        vistaProducto = new  VistaProducto(productoControlador); 
        vistaFactura = new VistaFactura(facturaControlador,clienteControlador,productoControlador);
    }
    public void Menu(){
        int opcion = 0;
        do {
            System.out.println("Venta de Computadoras");
            System.out.println(" 1. Generar Clientes \n 2. Generar Productos \n 3. Generar Facturas  \n 4. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaCliente.Menu(); break;
                case 2: vistaProducto.Menu(); break;
                case 3: this.Factura();break;
            }
        } while (opcion < 4);
    }
    public void Factura(){
        DatoCliente cliente = vistaCliente.Buscar();
        DatoProducto producto = vistaProducto.Buscar();
        if(cliente != null && producto != null){
            vistaFactura.Menu();
        }else
            System.out.println("El cliente y producto que acaba de ingresar no existen");
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public VistaCliente getVistaCliente() {
        return vistaCliente;
    }

    public void setVistaCliente(VistaCliente vistaCliente) {
        this.vistaCliente = vistaCliente;
    }

    public VistaProducto getVistaProducto() {
        return vistaProducto;
    }

    public void setVistaProducto(VistaProducto vistaProducto) {
        this.vistaProducto = vistaProducto;
    }

    public VistaFactura getVistaFactura() {
        return vistaFactura;
    }

    public void setVistaFactura(VistaFactura vistaFactura) {
        this.vistaFactura = vistaFactura;
    }

    public ClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }

    public ProductoControlador getProductoControlador() {
        return productoControlador;
    }

    public void setProductoControlador(ProductoControlador productoControlador) {
        this.productoControlador = productoControlador;
    }

    public FacturaControlador getFacturaControlador() {
        return facturaControlador;
    }

    public void setFacturaControlador(FacturaControlador facturaControlador) {
        this.facturaControlador = facturaControlador;
    }
    
}
