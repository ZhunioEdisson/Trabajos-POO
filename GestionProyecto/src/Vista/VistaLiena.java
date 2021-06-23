/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorFigura;
import Controlador.ControladorLinea;
import Modelo.Linea;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaLiena {
    private ControladorLinea controladorLinea;
    private ControladorFigura controladorFigura;
    private Scanner teclado;

    public VistaLiena( ControladorFigura controladorFigura) {
        this.controladorLinea = new ControladorLinea();
        controladorFigura = controladorFigura;
        teclado = new Scanner(System.in);
    }
    
    public void Menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear Cordenada \n 2. Buscar Cordenada  \n 3. Eliminar Figura \n 4. Listar Figura \n 5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.Crear(); break;
                case 2: this.Buscar(); break;
                case 3: this.Eliminar(); break;
                case 4: this.Listar(); break;
            }
        } while (opcion < 6);
    }
    public void Crear(){
        System.out.println("Cordenada X1");
        int puntoX1 = teclado.nextInt();
        System.out.println("Cordenada Y1");
        int puntoY1 = teclado.nextInt();
        System.out.println("Cordenada X2");
        int puntoX2 = teclado.nextInt();
        System.out.println("Cordenada Y2");
        int puntoY2 = teclado.nextInt();
        System.out.println("Longitud: ");
        double Longitud = teclado.nextDouble();
        System.out.println("Resultado: " + controladorLinea.Crear(puntoX1, puntoY1,  puntoX2,  puntoY2,Longitud,controladorFigura.getSeleccion()));
    }
      public Linea Buscar(){
        System.out.print("Ingrese la longitud: ");
        double longitud = teclado.nextDouble();
        System.out.println(controladorLinea.Buscar(longitud));
        return controladorLinea.Buscar(longitud);
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ controladorLinea.Eliminar(controladorLinea.getSeleccion().getLongitud()));
    }
      public void Listar(){
         for (Linea fi : controladorLinea.getListadoLinea()) {
            System.out.println(fi);
            System.out.println(" ");
        }
    } 

    public ControladorLinea getControladorLinea() {
        return controladorLinea;
    }

    public void setControladorLinea(ControladorLinea controladorLinea) {
        this.controladorLinea = controladorLinea;
    }

    public ControladorFigura getControladorFigura() {
        return controladorFigura;
    }

    public void setControladorFigura(ControladorFigura controladorFigura) {
        this.controladorFigura = controladorFigura;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
      
    
    
    
    
    
}
