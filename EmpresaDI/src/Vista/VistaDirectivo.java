/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorDirectivo;
import Modelo.Directivo;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaDirectivo {
    private ControladorDirectivo controladorDirectivo;
    private Scanner teclado;
    
    public VistaDirectivo(){
        controladorDirectivo = new ControladorDirectivo();
        teclado = new Scanner(System.in);
    }
    
    public void menu (){
        int opcion = 0;
        do{
            System.out.println("1.-Crear");
            System.out.println("2.-Actualizar");
            System.out.println("3.-Buscar");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Listar");
            System.out.println("6.-Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1 : crear(); break;
                case 2 : actualizar(); break;
                case 3 : buscar(); break;
                case 4 : eliminar(); break;
                case 5 : imprimir(); break;
            }
        }while(opcion<6);
    }
    
    public void crear(){
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.next();
        System.out.println("Ingrese el apellido: ");
        String apellido = teclado.next();
        System.out.println("Ingrese el cedula: ");
        String cedula = teclado.next();
        System.out.println("Ingrese el direccion: ");
        String direccion = teclado.next();
        System.out.println("Ingrese el sueldo: ");
        double sueldo = teclado.nextDouble();
        System.out.println("Ingrese la categoria: ");
        String categoria = teclado.next();
        System.out.println("Resultado: " + controladorDirectivo.crear(nombre, apellido, cedula, direccion, sueldo, categoria));
    }
    
    public Directivo buscar(){
        System.out.println("Ingrese la cedula: ");
        String cedula = teclado.next();
        Directivo directivo = controladorDirectivo.buscar(cedula);
        controladorDirectivo.setSeleccionado(directivo);
        System.out.println(directivo);
        return directivo;
    }
    
    public void actualizar(){
        Directivo directivo = buscar();
        if(directivo !=null){
            System.out.println("Ingrese el nuevo nombre: ");
            String nombre = teclado.next();
            System.out.println("Ingrese el nuevo apellido: ");
            String apellido = teclado.next();
            System.out.println("Ingrese el nuevo direccion: ");
            String direccion= teclado.next();
            System.out.println("Ingrese la nuevo sueldo ");
            double sueldo = teclado.nextDouble();
            System.out.println("Ingrese el categoria");
            String categoria = teclado.next();
            System.out.println("Resultado: "+controladorDirectivo.actualizar(nombre,apellido,directivo.getCedula(),direccion,sueldo,categoria));
        }
    }
    
    public void eliminar(){
        Directivo directivo = buscar();
        if(directivo!=null)
            System.out.println("Resultado: "+controladorDirectivo.eliminar(directivo.getCedula()));
    }
    public void imprimir(){
        for(Directivo directivo : controladorDirectivo.getListaDirectivo())
            System.out.println(directivo);
    }

    public ControladorDirectivo getControladorDirectivo() {
        return controladorDirectivo;
    }

    public void setControladorDirectivo(ControladorDirectivo controladorDirectivo) {
        this.controladorDirectivo = controladorDirectivo;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
    
}
