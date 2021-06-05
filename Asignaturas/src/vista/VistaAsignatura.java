/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AsignaturaControlador;
import controlador.GrupoControlador;
import java.util.Scanner;
import modelo.Asignatura;



/**
 *
 * @author mary zhingre
 */
public class VistaAsignatura {
    private AsignaturaControlador asignaturaControlador;
    private GrupoControlador grupoControlador;
    private Scanner teclado;
    
    public VistaAsignatura(GrupoControlador grupoControlador){
        this.grupoControlador = grupoControlador;
        asignaturaControlador = new AsignaturaControlador();
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("Gestión de Asignaturas");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                    case 1: this.crear(); break;
                    case 2: this.actualizar();break;
                    case 3: this.buscar(); break;
                    case 4: this.eliminar(); break;
                    case 5: this.listar(); break;
            }
        } while (opcion < 6);
    }    
    public void crear(){
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = asignaturaControlador.crear(nombre, grupoControlador.getSeleccionado());
        System.out.println("Cliente creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Nombre: ");
        String nombreAnterior = teclado.next();
        System.out.println("Nombre nuevo: ");
        String nombre = teclado.next();
        boolean resultado = asignaturaControlador.Actualizar(nombreAnterior, nombre);
        System.out.println("Cliente actualizado: " + resultado);
    }
    public void eliminar(){
        Asignatura asignatura = this.buscar();
        if (asignatura != null) {
            boolean resultado = asignaturaControlador.Eliminar(asignatura.getNombre());
            System.out.println("Elminado : " + resultado);
        }
    }
     public Asignatura buscar(){
        System.out.println("Buscar Asignatura");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        Asignatura asignatura = asignaturaControlador.Buscar(nombre);
        System.out.println(asignatura);
        return asignatura;
    }
     public void listar(){
        for (Asignatura dato : asignaturaControlador.getListaAsignatura()) 
            System.out.println(dato);
    }

    public AsignaturaControlador getAsignaturaControlador() {
        return asignaturaControlador;
    }

    public void setAsignaturaControlador(AsignaturaControlador asignaturaControlador) {
        this.asignaturaControlador = asignaturaControlador;
    }

    public GrupoControlador getGrupoControlador() {
        return grupoControlador;
    }

    public void setGrupoControlador(GrupoControlador grupoControlador) {
        this.grupoControlador = grupoControlador;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
     
}
