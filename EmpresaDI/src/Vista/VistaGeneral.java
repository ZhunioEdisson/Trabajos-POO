/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.util.Scanner;
import Controlador.ControladorCliente;
import Controlador.ControladorDirectivo;
import Controlador.ControladorEmpleado;
import Controlador.ControladorEmpresa;

/**
 *
 * @author mary zhingre
 */
public class VistaGeneral {
     private Scanner teclado;
    private VistaEmpresa vistaEmpresa;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private VistaDirectivo vistaDirectivo;
    
    public VistaGeneral(){
        vistaCliente = new VistaCliente();
        vistaEmpleado = new VistaEmpleado();
        vistaDirectivo = new VistaDirectivo();
        vistaEmpresa = new VistaEmpresa(vistaCliente, vistaEmpleado, vistaDirectivo);
        teclado = new Scanner(System.in);
    }
    public void menu (){
        int opcion = 0;
        do{
            System.out.println("1.-Empresa");
            System.out.println("2.-Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1 : this.vistaEmpresa.menu(); break;
            }
        }while(opcion<2);
    } 

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public VistaEmpresa getVistaEmpresa() {
        return vistaEmpresa;
    }

    public void setVistaEmpresa(VistaEmpresa vistaEmpresa) {
        this.vistaEmpresa = vistaEmpresa;
    }

    public VistaCliente getVistaCliente() {
        return vistaCliente;
    }

    public void setVistaCliente(VistaCliente vistaCliente) {
        this.vistaCliente = vistaCliente;
    }

    public VistaEmpleado getVistaEmpleado() {
        return vistaEmpleado;
    }

    public void setVistaEmpleado(VistaEmpleado vistaEmpleado) {
        this.vistaEmpleado = vistaEmpleado;
    }

    public VistaDirectivo getVistaDirectivo() {
        return vistaDirectivo;
    }

    public void setVistaDirectivo(VistaDirectivo vistaDirectivo) {
        this.vistaDirectivo = vistaDirectivo;
    }
    
}
