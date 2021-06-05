/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ClienteControlador;
import controlador.FacturaControlador;
import controlador.ProductoControlador;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import modelo.Factura;

/**
 *
 * @author mary zhingre
 */
public class VistaFactura {
    private Scanner teclado;
    private FacturaControlador facturaControlador;
    private ClienteControlador clienteControlador;
    private ProductoControlador productoControlador;
    private DateFormat formatoFecha;

    public VistaFactura(FacturaControlador facturaControlador, ClienteControlador clienteControlador, ProductoControlador productoControlador) {
        teclado = new Scanner(System.in);
        this.facturaControlador = facturaControlador;
        this.clienteControlador = clienteControlador;
        this.productoControlador = productoControlador;
        formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
    }
    
    public void Menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear Factura \n 2. Actualizar Factura \n 3. Buscar Factura \n 4. Eliminar Factura \n 5. Listar Factura \n 6. Salir");
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
        System.out.println("Ingrese: \n Codigo de Factura: ");
        double codigo = teclado.nextDouble();
        System.out.println("Cantida de producto: ");
        int  cantidad = teclado.nextInt();
        System.out.println("Precio Final: ");
        double precio = teclado.nextDouble();
        System.out.println("Fecha de Facturacion (dd/mm/yyyy): ");
        String fechaRegistro = teclado.next(); 
        try {
            System.out.println("Res:" + facturaControlador.Crear(codigo, cantidad,precio,formatoFecha.parse(fechaRegistro),productoControlador.getSeleccionado(), clienteControlador.getSeleccionado()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n Codigo de Factura");        
        double codigo = teclado.nextDouble();
        System.out.println("Nueva cantidad : ");
        int cantidad = teclado.nextInt(); 
        System.out.println("Nuevo precio Fnal: ");  
        double precio = teclado.nextDouble();
        System.out.println("Res:" + facturaControlador.Actualizar(codigo,cantidad,precio ));
    }
    public Factura Buscar(){
        System.out.println("Ingrese: \n Codigo de Factura: ");
        double codigo = teclado.nextDouble();
        System.out.println(facturaControlador.Buscar(codigo));
        return facturaControlador.Buscar(codigo);
    }
     public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ facturaControlador.Eliminar(facturaControlador.getSeleccionado().getCodigo()));
    }
    public void Listar(){
         for (Factura factura : facturaControlador.getListaFactura()) {
            System.out.println(factura);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public FacturaControlador getFacturaControlador() {
        return facturaControlador;
    }

    public void setFacturaControlador(FacturaControlador facturaControlador) {
        this.facturaControlador = facturaControlador;
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

    public DateFormat getFormatoFecha() {
        return formatoFecha;
    }

    public void setFormatoFecha(DateFormat formatoFecha) {
        this.formatoFecha = formatoFecha;
    }
    
}
