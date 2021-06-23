/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorJefe;
import Controlador.ControladorPlano;
import Controlador.ControladorProyecto;
import Modelo.Figura;
import Modelo.Jefeproyecto;
import Modelo.Plano;
import Modelo.Proyecto;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaGeneral {
    private Scanner teclado;
    private VistaPlano vistaPlano;
    private VistaJefe vistaJefe;
    private VistaFigura vistaFigura;
    private VistaLiena vistaLinea;
    private VistaProyecto vistaProyecto;
    private ControladorProyecto controladorProyecto;
    private ControladorJefe controladorJefe;
    private ControladorPlano controladorPlano;

    public VistaGeneral() {
        controladorProyecto = new ControladorProyecto();
        controladorJefe = new ControladorJefe();
        teclado = new Scanner(System.in);
        vistaJefe = new VistaJefe(controladorJefe);
        vistaProyecto = new VistaProyecto(controladorProyecto, controladorJefe );
        vistaPlano = new VistaPlano(vistaProyecto.getControladorProyecto());
        vistaFigura = new VistaFigura(vistaPlano.getControladorPlnao());
        vistaLinea = new VistaLiena(vistaFigura.getControladorFigura());
    }
    public void Menu(){
        int opcion = 0;
        do {
            System.out.println("----------<Gestion de Proyectos>----------");
            System.out.println(" 1. Generar Jefe deProyecto \n 2. Generar Proyecto \n 3. Generar Planos \n 4. Figuras \n 5. Salir");
            System.out.print("Opcion?: ");
            opcion = teclado.nextInt();
            System.out.println("----------<Gestion de Proyectos>----------");
            switch(opcion){
                case 1: vistaJefe.Menu(); break;
                case 2: this.Proyecto(); break;
                case 3: this.Planos(); break;
                case 4: this.Figura(); break;
                case 5: this.Lineas(); break;
            }
        } while (opcion < 6);
    }
     public void Proyecto() {
        System.out.println("Ingrese una Jefe de Proyecto para gestionar los proyectos: ");
        Jefeproyecto jefe = vistaJefe.Buscar();
        if(jefe != null){ 
            vistaProyecto.Menu();
        }else {
            System.out.println("No exite el jefe");
            this.Menu();
        }
    }
     public void Planos(){
         System.out.println("Ingrese el Proyecto en cual va a trabajar: ");
         Proyecto proyecto = vistaProyecto.Buscar();
         if(proyecto!=null){
             vistaProyecto.AsignarProyectos(proyecto);
             vistaPlano.Menu();
         }else{
             System.out.println("No exite el Proyecto");
            this.Menu(); 
         }
     }
     public void Figura(){
        System.out.println("Ingrese el Plano en cual va a trabajar: ");
        Plano plano = vistaPlano.Buscar();
        if(plano != null){
            vistaPlano.Asignar(plano);
            vistaFigura.Menu();
        }else{
            System.out.println("No exite el plano");
            this.Menu();
        }
     }
     public void Lineas(){
         System.out.println("Ingrese la Figura en cual va a trabajar: ");
        Figura fi = vistaFigura.Buscar();
        if(fi != null){
            vistaFigura.AsignarFigura(fi);
            vistaLinea.Menu();
        }else{
            System.out.println("No exite La figura");
            this.Menu();
        }
     }
      
    
    
    
    
    
    
}
