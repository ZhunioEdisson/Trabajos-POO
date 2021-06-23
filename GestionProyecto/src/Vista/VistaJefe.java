/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJefe;
import Modelo.Jefeproyecto;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaJefe {
    public Scanner teclado;
    private ControladorJefe controladorJefe;
    

    public VistaJefe(ControladorJefe controladorJefe) {
        this.teclado = new Scanner(System.in);
        this.controladorJefe = controladorJefe;
    }
    
    public void Menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear Jefe \n 2. Actualizar Jefe  \n 3. Buscar Jefe  \n 4. Eliminar Jefe \n 5. Listar Jefe \n 6. Salir");
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
        System.out.print("Nombre Completo: ");
        teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.print("Direccion: ");
        String direccion = teclado.next();
        System.out.print("Telefono: ");
        String telefono = teclado.next();
        boolean resultado = controladorJefe.Crear(nombreCompleto, direccion, telefono);
        System.out.println("Creado = " + resultado);
    } 
   
      public Jefeproyecto Buscar(){
        System.out.print("Nombre Completo: ");
         teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.println(controladorJefe.Buscar(nombreCompleto));
        return controladorJefe.Buscar(nombreCompleto);
    }
    public void Actualizar(){
        System.out.print("\n Ingrese: \n Nombre Completo: ");
        teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.print("Direccion: ");
        String direccion = teclado.next();
        System.out.print("Telefono: ");
        String telefono = teclado.next();
        System.out.println("Res:" + controladorJefe.Actualizar(nombreCompleto, direccion,telefono));
    } 
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ controladorJefe.Eliminar(controladorJefe.getSeleccionado().getNombreCompleto()));
    }
    public void Listar(){ 
        for (Jefeproyecto jefe : controladorJefe.getListadoJefe()) {
            System.out.println(jefe);
            System.out.println(" ");
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ControladorJefe getControladorJefe() {
        return controladorJefe;
    }

    public void setControladorJefe(ControladorJefe controladorJefe) {
        this.controladorJefe = controladorJefe;
    }

    
    
    
}
