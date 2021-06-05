/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DniControlador;
import Controlador.FechaControlador;
import Controlador.PersonaControlador;
import Controlador.RegistroControlador;
import Modulo.Dni;
import Modulo.Fecha;
import Modulo.Persona;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaGeneral {
    private Scanner teclado;
    private VistaDni vistaDni;
    private DniControlador dniControlador;
    private VistaFecha vistaFecha;
    private FechaControlador fechacontrolador;
    private VistaPersona vistaPersona;
    private PersonaControlador personaControlador;
    private VistaRegistro vistaRegistro;
    private RegistroControlador registroControlador;
    
    
    public VistaGeneral(){
        teclado = new Scanner(System.in);
        dniControlador = new DniControlador();
        fechacontrolador = new FechaControlador();
        personaControlador = new PersonaControlador();
        registroControlador = new RegistroControlador();
        vistaFecha = new VistaFecha(fechacontrolador);
        vistaDni = new VistaDni(dniControlador);
        vistaPersona = new VistaPersona(personaControlador, fechacontrolador, dniControlador);
        vistaRegistro = new VistaRegistro(registroControlador, personaControlador);
    }
    
    public void Menu(){
        int opcion = 0;
        do {
            System.out.println("Gestión de Registros");
            System.out.println(" 1. Fecha \n 2. DNI \n 3. Persona \n 4. Registro \n 5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaFecha.Menu(); break;
                case 2: vistaDni.Menu(); break;
                case 3: this.Persona();break;
                case 4: this.Registro();break;
            }
        } while (opcion < 5);
    }
    public void Persona(){
        Fecha fecha = vistaFecha.Buscar();
        Dni dni = vistaDni.Buscar();
        if(fecha != null && dni != null){
            vistaPersona.Menu();
        }
    }
    public void Registro(){
        Persona persona = vistaPersona.Buscar();
        if(persona != null){
            vistaRegistro.Menu();
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public VistaDni getVistaDni() {
        return vistaDni;
    }

    public void setVistaDni(VistaDni vistaDni) {
        this.vistaDni = vistaDni;
    }

    public DniControlador getDniControlador() {
        return dniControlador;
    }

    public void setDniControlador(DniControlador dniControlador) {
        this.dniControlador = dniControlador;
    }

    public VistaFecha getVistaFecha() {
        return vistaFecha;
    }

    public void setVistaFecha(VistaFecha vistaFecha) {
        this.vistaFecha = vistaFecha;
    }

    public FechaControlador getFechacontrolador() {
        return fechacontrolador;
    }

    public void setFechacontrolador(FechaControlador fechacontrolador) {
        this.fechacontrolador = fechacontrolador;
    }

    public VistaPersona getVistaPersona() {
        return vistaPersona;
    }

    public void setVistaPersona(VistaPersona vistaPersona) {
        this.vistaPersona = vistaPersona;
    }

    public PersonaControlador getPersonaControlador() {
        return personaControlador;
    }

    public void setPersonaControlador(PersonaControlador personaControlador) {
        this.personaControlador = personaControlador;
    }

    public VistaRegistro getVistaRegistro() {
        return vistaRegistro;
    }

    public void setVistaRegistro(VistaRegistro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public RegistroControlador getRegistroControlador() {
        return registroControlador;
    }

    public void setRegistroControlador(RegistroControlador registroControlador) {
        this.registroControlador = registroControlador;
    }

    
}
