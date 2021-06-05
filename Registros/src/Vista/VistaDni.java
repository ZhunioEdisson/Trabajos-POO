/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DniControlador;
import Modulo.Dni;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaDni {
    private Scanner teclado;
    private DniControlador dniControlador;
    
    public  VistaDni (DniControlador dniControlador){
        teclado = new Scanner(System.in);
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
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println("Codigo Verificacio");
        int codigoVerificacion = teclado.nextInt();
        System.out.println("Res:" + dniControlador.Crear(numero, codigoVerificacion));
    }
    public Dni Buscar(){
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println(dniControlador.Buscar(numero));
        return dniControlador.Buscar(numero);
    }
    public void Actualizar(){
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println("Codigo Verificacio");
        int codigoVerificacion = teclado.nextInt();
        System.out.println("Res:" + dniControlador.Actualizar(numero, codigoVerificacion));
    }
    public void Eliminar(){
        this.Buscar();
        System.out.println("Res: "+ dniControlador.Eliminar(dniControlador.getSeleccionado().getNumero()));
    }
    public void Listar(){ 
        for (Dni dni : dniControlador.getListaDni()) {
            System.out.println(dni);
        }
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public DniControlador getDniControlador() {
        return dniControlador;
    }

    public void setDniControlador(DniControlador dniControlador) {
        this.dniControlador = dniControlador;
    }

}
