/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.Aula;
import modelo.Grupo;

/**
 *
 * @author mary zhingre
 */
public class VistaGeneral {
    private VistaAula vistaAula;
    private VistaGrupo vistaGrupo;
    private VistaAsignatura vistaAsignatura;
    private Scanner teclado;
    
    public VistaGeneral() {
        vistaAula = new VistaAula();
        vistaGrupo = new VistaGrupo(vistaAula.getAulaControlador());
        vistaAsignatura = new VistaAsignatura(vistaGrupo.getGrupoControlador());
        teclado = new Scanner(System.in);
        
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Organizacion de cursos");
            System.out.println("1. Aula");
            System.out.println("2. Grupo");
            System.out.println("3. Asignatura");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaAula.Menu(); break;
                case 2: this.grupo(); break;
                case 3: this.asignatura();break;
            }
        } while (opcion < 5);
    }
     public void grupo() {
        System.out.println("Seleccione una aula para crear grupos");
        Aula aula = vistaAula.buscar();
        if(aula != null){ 
            vistaAula.asignarSelecionado(aula);
            vistaGrupo.Menu();
        }else {
            System.out.println("No exite el aula");
            this.menu();
            
        }
    }
     public void asignatura(){
        System.out.println("Selecione un grupo");
        Grupo grupo = vistaGrupo.buscar();
        if(grupo != null){
            vistaGrupo.asignarSeleccionado(grupo);
            vistaAsignatura.menu();
        }else {
            System.out.println("No existe el grupo");
            this.menu();
        }
    } 
    
    
}
