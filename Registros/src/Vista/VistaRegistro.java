/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PersonaControlador;
import Controlador.RegistroControlador;
import Modulo.Registro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaRegistro {
    private Scanner teclado;
    private RegistroControlador registroControlador;
    private PersonaControlador personaControlador;
    public DateFormat formatoFecha;
    
    public VistaRegistro(RegistroControlador registroControlador,PersonaControlador personaControlador){
        teclado = new Scanner(System.in);
        this.registroControlador = registroControlador;
        this.personaControlador = personaControlador;
        formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
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
        System.out.println("Ingrese: \n codigo");        
        String codigo = teclado.next();
        System.out.println("Fecha (dd/mm/yyyy):");
        String fechaRegistro = teclado.next();        
        try {
            System.out.println("Res:" + registroControlador.Crear(codigo, formatoFecha.parse(fechaRegistro), personaControlador.getSeleccionado()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void Buscar(){
        System.out.println("Ingrese: \n codigo");
        String codigo = teclado.next();
        System.out.println(registroControlador.Buscar(codigo));
    }
    public void Actualizar(){
         System.out.println("Ingrese: \n codigo");        
        String codigo = teclado.next();
        System.out.println("Fecha (dd/mm/yyyy):");
        String fechaRegistro = teclado.next();        
        try {
            System.out.println("Res:" + registroControlador.Actualizar(codigo, formatoFecha.parse(fechaRegistro), personaControlador.getSeleccionado()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ registroControlador.Eliminar(registroControlador.getSeleccionado().getCodigo()));
    }
    public void Listar(){
        for (Registro registro : registroControlador.getListaRegistro()) {
            System.out.println(registro);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public RegistroControlador getRegistroControlador() {
        return registroControlador;
    }

    public void setRegistroControlador(RegistroControlador registroControlador) {
        this.registroControlador = registroControlador;
    }

    public PersonaControlador getPersonaControlador() {
        return personaControlador;
    }

    public void setPersonaControlador(PersonaControlador personaControlador) {
        this.personaControlador = personaControlador;
    }

    public DateFormat getFormatoFecha() {
        return formatoFecha;
    }

    public void setFormatoFecha(DateFormat formatoFecha) {
        this.formatoFecha = formatoFecha;
    }
    
}
