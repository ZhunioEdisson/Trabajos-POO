/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ClienteControlador;
import java.util.Scanner;
import modelo.DatoCliente;

/**
 *
 * @author mary zhingre
 */
public class VistaCliente {
    private Scanner teclado;
    private ClienteControlador clienteControlador;
    
    public VistaCliente(ClienteControlador clienteControlador){
        teclado = new Scanner(System.in);
        this.clienteControlador = clienteControlador;
    }
    
    public void Menu(){
         int opcion = 0;
        do {            
            System.out.println(" 1. Crear cliente \n 2. Actualizar cliente  \n 3. Buscar cliente  \n 4. Eliminar cliente \n 5. Listar clientes \n 6. Salir");
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
        System.out.println("Ingrese: \n Nombre Completo");
        teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.println("Cedula:");
        String cedula = teclado.next();
        System.out.println("Metodo de Pago:");
        String fiabilidadPago = teclado.next();
        System.out.println("Res:" + clienteControlador.Crear(nombreCompleto, cedula,fiabilidadPago ));
    } 
      public DatoCliente Buscar(){
        System.out.println("Ingrese: \n Cedula");
        String cedula = teclado.next();
        System.out.println(clienteControlador.Buscar(cedula));
        return clienteControlador.Buscar(cedula);
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n Cedula");
        String cedula = teclado.next();
        System.out.println("Nombre Completo: ");
        teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.println("Metodo de Pago: ");
        String fiabilidadPago = teclado.next();
        System.out.println("Res:" + clienteControlador.Actualizar(cedula, nombreCompleto,fiabilidadPago));
    } 
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ clienteControlador.Eliminar(clienteControlador.getSeleccionado().getCedula()));
    }
    public void Listar(){ 
        for (DatoCliente cliente : clienteControlador.getListaCliente()) {
            System.out.println(cliente);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
    
}
