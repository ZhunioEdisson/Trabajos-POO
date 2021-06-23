/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorFigura;
import Controlador.ControladorPlano;
import Controlador.ControladorProyecto;
import Modelo.Plano;

import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaPlano {
    private Scanner teclado;
    private ControladorPlano controladorPlnao;
    private ControladorProyecto controladorProyecto;
    private ControladorFigura controladorPersona;
    private VistaFigura vistaFi;

    public VistaPlano(ControladorProyecto controladorProyecto) {
        this.teclado = new Scanner(System.in);
        this.controladorPlnao = new ControladorPlano();
        this.controladorProyecto = controladorProyecto;
    }
    
    public void Menu(){
        int opcion =0;
        do{
            System.out.println(" 1. Crear Plano \n 2. Actualizar Plano  \n 3. Buscar Plano  \n 4. Eliminar Plano \n 5. Listar Plano \n 6.  Salir");
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
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Indentificacion: ");
        long Indentificacion = teclado.nextLong();
        System.out.println("Fecha de entrada:  'dd/mm/anio' ");
        String FechaEntrga = teclado.next();
        System.out.println("Ingrese nombre del Arquitecto: ");
        teclado.nextLine();
        String nombreArqui = teclado.nextLine();
        System.out.println("Numero de Figuras: ");
        int nmFiguras = teclado.nextInt();
        boolean resultado = controladorPlnao.Crear(Indentificacion,  FechaEntrga,  nombreArqui,  nmFiguras, controladorProyecto.getSeleccionado() );
        System.out.println("Cliente creado: " + resultado);
    }
    public void Actualizar(){
        System.out.print("\n Ingrese: \n Indentificacion: ");
        long Indentificacion = teclado.nextLong();
        System.out.print("Nueva Fecha de entrega: ");
        String FechaEntrga = teclado.next();
        System.out.print("Nuevo nombre de Aruitecto: ");
        teclado.nextLine();
        String nombreArqui = teclado.nextLine();
        System.out.print("Nuevo numero de figuras: ");
        int nmFiguras = teclado.nextInt();
        System.out.println("Res:" + controladorPlnao.Actualizar(Indentificacion, FechaEntrga, nombreArqui, nmFiguras));
        
    }
    public Plano Buscar(){
        System.out.print("Indentificacion: ");
        long Indentificacion = teclado.nextLong();
        System.out.println(controladorPlnao.Buscar(Indentificacion));
        return controladorPlnao.Buscar(Indentificacion);
    
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ controladorPlnao.Eliminar(controladorPlnao.getSeleccionado().getIndentificacion()));
    }
    
    public void Listar(){
         for (Plano plano : controladorPlnao.getListadoPlanos()) {
            System.out.println(plano);
            System.out.println(" ");
        }
        
    } 
   
    public void Asignar(Plano plano){
        controladorPlnao.setSeleccionado(plano);
    }
    

    public ControladorPlano getControladorPlnao() {
        return controladorPlnao;
    }

    public void setControladorPlnao(ControladorPlano controladorPlnao) {
        this.controladorPlnao = controladorPlnao;
    }

    public ControladorProyecto getControladorProyecto() {
        return controladorProyecto;
    }

    public void setControladorProyecto(ControladorProyecto controladorProyecto) {
        this.controladorProyecto = controladorProyecto;
    }
    
    
    
    
}
