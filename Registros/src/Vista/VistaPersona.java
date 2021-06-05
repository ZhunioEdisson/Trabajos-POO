/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DniControlador;
import Controlador.FechaControlador;
import Controlador.PersonaControlador;
import Modulo.Persona;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaPersona {
    private Scanner teclado;
    private PersonaControlador personaControlador;
    private FechaControlador fechacontrolador;
    private DniControlador dniControlador;
    
    public VistaPersona(PersonaControlador personaControlador,FechaControlador fechacontrolador,DniControlador dniControlador ){
        teclado = new Scanner(System.in);
        this.personaControlador = personaControlador;
        this.fechacontrolador = fechacontrolador;
        this.dniControlador = dniControlador;
    }
    public void Menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Salir");
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
        System.out.println("Ingrese: \n nombre completo");
        teclado.nextLine();
        String NombreCompleto = teclado.nextLine();
        System.out.println("Res:" + personaControlador.Crear(NombreCompleto, fechacontrolador.getSeleccionado(), dniControlador.getSeleccionado()));
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n nombre completo");
        teclado.nextLine();
        String NombreCompleto = teclado.nextLine();
        System.out.println("Res:" + personaControlador.Actualizar(NombreCompleto, fechacontrolador.getSeleccionado(), dniControlador.getSeleccionado()));
    }
    public Persona Buscar(){
        System.out.println("Ingrese: \n nombre completo");
        teclado.nextLine();
        String NombreCompleto = teclado.nextLine();
        System.out.println(personaControlador.Buscar(NombreCompleto));
        return personaControlador.Buscar(NombreCompleto);
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ personaControlador.eliminar(personaControlador.getSeleccionado().getNombreCompleto()));
    }
    public void Listar(){
         for (Persona persona : personaControlador.getListaPersona()) {
            System.out.println(persona);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public PersonaControlador getPersonaControlador() {
        return personaControlador;
    }

    public void setPersonaControlador(PersonaControlador personaControlador) {
        this.personaControlador = personaControlador;
    }

    public FechaControlador getFechacontrolador() {
        return fechacontrolador;
    }

    public void setFechacontrolador(FechaControlador fechacontrolador) {
        this.fechacontrolador = fechacontrolador;
    }

    public DniControlador getDniControlador() {
        return dniControlador;
    }

    public void setDniControlador(DniControlador dniControlador) {
        this.dniControlador = dniControlador;
    }
    
}
