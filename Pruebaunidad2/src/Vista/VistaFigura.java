/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorFigura;
import Controlador.ControladorPlano;
import Modelo.Figura;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaFigura {
    private ControladorFigura controladorFigura;
    private ControladorPlano controladorplano;
    private Scanner teclado;
    
    
    public VistaFigura(ControladorPlano controladorplano){
        this.controladorplano = controladorplano;
        controladorFigura = new ControladorFigura();
        teclado = new Scanner(System.in);
    }
    public void Menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear Figura \n 2. Actualizar Figura  \n 3. Buscar Figura  \n 4. Eliminar Figura \n 5. Listar Figura \n 6. Salir");
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
        System.out.println("Ingrese el indetificador");
        long indetificador = teclado.nextLong();
        System.out.println("Ingrese el nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el color");
        String color = teclado.next();
        System.out.println("Ingrese el Numero de lineas");
        int NumLineas = teclado.nextInt();
        System.out.println("Resultado: " + controladorFigura.Crear(indetificador, nombre, color, NumLineas, controladorplano.getSeleccionado()));
    }
     public Figura Buscar(){
        System.out.print("Indentificacion de la figura: ");
        long Indentificacion = teclado.nextLong();
        System.out.println(controladorFigura.Buscar(Indentificacion));
        return controladorFigura.Buscar(Indentificacion);
    }
     public void Actualizar(){
        System.out.print("\n Ingrese: \n Indentificacion: ");
        long Indentificacion = teclado.nextLong();
        System.out.print("Nueva Nombre: ");
        String nombre = teclado.next();
        System.out.print("Nuevo Color: ");
        String color = teclado.next();
        System.out.print("Nuevo numero de Lineas: ");
        int NumLineas = teclado.nextInt();
        System.out.println("Res:" + controladorFigura.ActualizarFigura(Indentificacion, nombre, color, NumLineas));
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ controladorFigura.Eliminar(controladorFigura.getSeleccion().getIndetificador()));
    }
     public void Listar(){
         for (Figura fi : controladorFigura.getListadoFigura()) {
            System.out.println(fi);
            System.out.println(" ");
        }
    } 
     public void AsignarFigura(Figura figura){
         controladorFigura.setSeleccion(figura);
     }

    public ControladorFigura getControladorFigura() {
        return controladorFigura;
    }

    public void setControladorFigura(ControladorFigura controladorFigura) {
        this.controladorFigura = controladorFigura;
    }

    public ControladorPlano getControladorplano() {
        return controladorplano;
    }

    public void setControladorplano(ControladorPlano controladorplano) {
        this.controladorplano = controladorplano;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
     
     
        
        
      
     
    

    
    
    
    
    
}
