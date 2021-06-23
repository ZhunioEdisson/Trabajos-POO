/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJefe;
import Controlador.ControladorProyecto;
import Modelo.Proyecto;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaProyecto {
    public Scanner teclado;
    private ControladorProyecto controladorProyecto;
    private ControladorJefe controladorJefe;

    public VistaProyecto(ControladorProyecto controladorProyecto, ControladorJefe controladorJefe) {
        this.teclado = new Scanner(System.in);
        this.controladorProyecto = controladorProyecto;
        this.controladorJefe = controladorJefe;
    }

   
    
    public void Menu(){
        int opcion = 0;
        do {       
            if(controladorProyecto.GenerarId()<2){
                System.out.println("1. Crear Proyecto: ");
            }
            System.out.println(" 2. Actualizar Proyecto  \n 3. Buscar Proyecto  \n 4. Eliminar Proyecto \n 5. Listar Proyectos \n 6. Salir");
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
        System.out.print("Ingrese: \n Codigo: ");
        long codigo = teclado.nextLong();
        System.out.print("Nombre: ");
        String nombreCompleto = teclado.next();
        System.out.println("Res:" + controladorProyecto.Crear(codigo,nombreCompleto,controladorJefe.getSeleccionado()));
    } 
      public Proyecto Buscar(){
        System.out.print("Ingrese: \n Codigo: ");
        long codigo = teclado.nextLong();
        System.out.println(controladorProyecto.Buscar(codigo));
        return controladorProyecto.Buscar(codigo);
    }
    public void Actualizar(){
        System.out.print("Ingrese: \n Codigo: ");
        long codigo = teclado.nextLong();
        System.out.print("Nuevo nombre: ");
        teclado.nextLine();
        String nombreCompleto = teclado.nextLine();
        System.out.println("Res:" + controladorProyecto.Actualizar(codigo, nombreCompleto));
    } 
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ controladorProyecto.Eliminar(controladorProyecto.getSeleccionado().getCodigo()));
    }
    public void Listar(){ 
        for (Proyecto Proyecto : controladorProyecto.getListadoProyecto()) {
            System.out.println(Proyecto);
            System.out.println(" ");
        }
    }
    public void AsignarProyectos(Proyecto proyecto){
        controladorProyecto.setSeleccionado(proyecto);
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public ControladorProyecto getControladorProyecto() {
        return controladorProyecto;
    }

    public void setControladorProyecto(ControladorProyecto controladorProyecto) {
        this.controladorProyecto = controladorProyecto;
    }

    public ControladorJefe getControladorJefe() {
        return controladorJefe;
    }

    public void setControladorJefe(ControladorJefe controladorJefe) {
        this.controladorJefe = controladorJefe;
    }
    
    
    
    
    
    
    
    
}
