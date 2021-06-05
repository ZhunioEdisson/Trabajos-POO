/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AulaControlador;
import java.util.Scanner;
import modelo.Aula;
import modelo.Grupo;

/**
 *
 * @author mary zhingre
 */
public class VistaAula {
    private AulaControlador aulaControlador;
    private Scanner teclado;
    
    public VistaAula(){
        aulaControlador = new AulaControlador();
        teclado = new Scanner(System.in);
    }
    public void Menu(){
         int opcion = 0;
        do {
            System.out.println("\n Gestion Aulas");
            System.out.println("1. Crear");
            System.out.println("2. Actaulizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar();break;
                case 3: this.buscar();break;
                case 4: this.eliminar();break;
                case 5: this.imprimir(); break;  
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Ingresar los siguientes datos:");
        System.out.println("Nombre del aula");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.Crear(descripcion);
        System.out.println("Creado = " + resultado);
    }
     public void actualizar(){
        System.out.println("Nombre Ddel aula");
        String descripcionAntigua = teclado.next();
        System.out.println("Nombre Nuevo");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.Actualizar(descripcionAntigua, descripcion);
        System.out.println("Actualizado = " + resultado);
    }
     public Aula buscar(){
        System.out.println("Nombre del aula");
        String descripcion = teclado.next();
        Aula aula = aulaControlador.Buscar(descripcion);
        return aula;
    }
   
    public void eliminar(){
        System.out.println("Nombre del aula");
        String descripcion = teclado.next();
        boolean resultado = aulaControlador.Eliminar(descripcion);
        System.out.println("Eliminado = " + resultado);
    }
    public void imprimir(){
        for (Aula aula : aulaControlador.getListaAula()) 
            System.out.println(aula); 
    }
     public void asignarSelecionado(Aula aula){
        aulaControlador.setSeleccionado(aula);
    }

    public AulaControlador getAulaControlador() {
        return aulaControlador;
    }

    public void setAulaControlador(AulaControlador aulaControlador) {
        this.aulaControlador = aulaControlador;
    }
    
   

    

   
    
}
