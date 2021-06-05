/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.FechaControlador;
import Modulo.Fecha;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaFecha {
    private Scanner teclado;
    private FechaControlador fechacontrolador;
    
    public VistaFecha(FechaControlador fechacontrolador){
        teclado = new Scanner(System.in);
        this.fechacontrolador = fechacontrolador;
    }
    
    public void Menu(){
        int opcion = 0;
        do{
            System.out.println(" 1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.Crear(); break;
                case 2: this.Actualizar(); break;
                case 3: this.Buscar(); break;
                case 4: this.Eliminar(); break;
                case 5: this.Listar(); break;
            }
        }while(opcion<6);
    }
    public void Crear(){
        System.out.println("Ingrese: \n dia");
        int dia = teclado.nextInt();
        System.out.println("mes");
        int mes = teclado.nextInt();
        System.out.println("Año");
        int anio = teclado.nextInt();
        System.out.println("Res:" + fechacontrolador.crear(dia, mes, anio));
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n dia");
        int dia = teclado.nextInt();
        System.out.println("mes");
        int mes = teclado.nextInt();
        System.out.println("Año");
        int anio = teclado.nextInt();
        System.out.println("Res:" + fechacontrolador.actualizar(dia, mes, anio));
    }
    public Fecha Buscar(){
        System.out.println("Ingrese: \n dia");
        int dia = teclado.nextInt();
        System.out.println("mes");
        int mes = teclado.nextInt();
        System.out.println(fechacontrolador.buscar(dia, mes));
        return fechacontrolador.buscar(dia, mes);
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ fechacontrolador.eliminar(fechacontrolador.getSeleccionado().getDia(), fechacontrolador.getSeleccionado().getMes()));
    }
    public void Listar(){
        for (Fecha fecha : fechacontrolador.getListaFecha()) {
            System.out.println(fecha);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public FechaControlador getFechacontrolador() {
        return fechacontrolador;
    }

    public void setFechacontrolador(FechaControlador fechacontrolador) {
        this.fechacontrolador = fechacontrolador;
    }
    
    
    
}
