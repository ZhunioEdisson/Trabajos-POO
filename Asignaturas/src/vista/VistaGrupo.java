/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AulaControlador;
import controlador.GrupoControlador;
import java.util.Scanner;
import modelo.Grupo;

/**
 *
 * @author mary zhingre
 */
public class VistaGrupo {
    private Scanner teclado;
    private GrupoControlador grupoControlador;
    private AulaControlador aulaControlador;

    public VistaGrupo (AulaControlador aulaControlador) {
        this.teclado = new Scanner(System.in);
        this.grupoControlador = new GrupoControlador();
        this.aulaControlador = aulaControlador;
    }
    public void Menu(){
        int opcion = 0;
        do{
            System.out.println("\nGestión de Grupos");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar/Leer");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar/Imprimir");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: 
                    this.crear(); 
                break;
                case 2: 
                    this.actualizar(); 
                break;
                case 3: 
                    this.buscar(); 
                break;
                case 4: 
                    this.eliminar(); 
                break;
                case 5: 
                    System.out.println("Listado de grupos: ");
                    grupoControlador.imprimir(); 
                break;
            }
        }while(opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese el nombre de grupo:");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.Crear(nombre, aulaControlador.getSeleccionado());
        System.out.println("Grupo creado: " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar");
        System.out.println("Nombre: ");
        String nombreAntiguo = teclado.next();
        System.out.println("Nombre nuevo: ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.Actualizar(nombreAntiguo, nombre);
        System.out.println("Cliente actualizado: " + resultado);
    }
      public void eliminar(){
        System.out.println("Eliminar Grupo");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        boolean resultado = grupoControlador.Eliminar(nombre);
        System.out.println("Cliente eliminado: " + resultado);
    }
     public Grupo buscar(){
        System.out.println("Buscar Grupo");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        Grupo grupo = grupoControlador.Buscar(nombre);
        System.out.println(grupo);
        return grupo;
    }
     public void asignarSeleccionado(Grupo grupo) {
        grupoControlador.setSeleccionado(grupo);
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public GrupoControlador getGrupoControlador() {
        return grupoControlador;
    }

    public void setGrupoControlador(GrupoControlador grupoControlador) {
        this.grupoControlador = grupoControlador;
    }

    public AulaControlador getAulaControlador() {
        return aulaControlador;
    }

    public void setAulaControlador(AulaControlador aulaControlador) {
        this.aulaControlador = aulaControlador;
    }
     
}
