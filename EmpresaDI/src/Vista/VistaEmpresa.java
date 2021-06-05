/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ControladorEmpresa;
import Modelo.Empresa;
import Modelo.Cliente;
import Modelo.Empleado;
import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VistaEmpresa {
    private ControladorEmpresa controladorEmpresa;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private VistaDirectivo vistaDirectivo;
    private Scanner teclado;
    
    public VistaEmpresa(VistaCliente vistaCliente, VistaEmpleado vistaEmpleado, VistaDirectivo vistaDirectivo) {
        controladorEmpresa = new ControladorEmpresa();
        this.vistaCliente = vistaCliente;
        this.vistaEmpleado = vistaEmpleado;
        this.vistaDirectivo = vistaDirectivo;
        teclado = new Scanner(System.in);
    }
    
    public void menu (){
        int opcion=0;
        do{
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Gestionar cliente");
            System.out.println("7. Gestionar empleado");
            System.out.println("8. Gestionar directivo");
            System.out.println("9. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    crear();
                    break;
                case 2:
                    actualizar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    imprimir();
                    break;
                case 6:
                    cliente();
                    break;
                case 7:
                    empleado();
                    break;
                case 8:
                    directivo();
                    break;
            }
        }while(opcion<9);
    }
    
    public void crear(){
        System.out.println("Ingrese el nombre:");
        String nombre = teclado.next();
        System.out.println("Resultado: "+controladorEmpresa.crear(nombre));
    }
    
    public Empresa buscar(){
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.next();
        Empresa empresa = controladorEmpresa.buscar(nombre);
        controladorEmpresa.setSeleccionado(empresa);
        System.out.println(empresa);
        return empresa;
    }
    
    public void actualizar(){
        Empresa empresa = buscar();
        System.out.println("Ingrese el nuevo nombre: ");
        String nombreNuevo = teclado.next();
        System.out.println("Resultado: "+controladorEmpresa.actulizar(empresa.getNombre(), nombreNuevo));
    }
    
    public void eliminar(){
        Empresa empresa = buscar();
        System.out.println("Resultado: "+controladorEmpresa.eliminar(empresa.getNombre()));
    }
    public void imprimir(){
        for(Empresa empresa:controladorEmpresa.getListaEmpresa())
            System.out.println(empresa);
    }

    public void cliente() {
        Empresa empresa = buscar();
        if (empresa != null) {
            vistaCliente.getControladorCliente().setListaCliente(empresa.getListadoClientes());
            vistaCliente.menu();
        }
    }
    
    public void empleado() {
        Empresa empresa = buscar();
        //Empleado empleado = vistaEmpleado.buscar();
        //System.out.println("Resultado: " + controladorEmpresa.agregarEmpleado(empleado));
        if (empresa != null) {
            vistaEmpleado.getControladorEmpleado().setListaEmpleado(empresa.getListadoEmpleados());
            vistaEmpleado.menu();
        }
    }
    
    public void directivo() {
        Empresa empresa = buscar();
        if (empresa != null) {
            vistaDirectivo.getControladorDirectivo().setListaDirectivo(empresa.getListadoDirectivo());
            vistaDirectivo.menu();
        }
    }

    public ControladorEmpresa getControladorEmpresa() {
        return controladorEmpresa;
    }

    public void setControladorEmpresa(ControladorEmpresa controladorEmpresa) {
        this.controladorEmpresa = controladorEmpresa;
    }

    public VistaCliente getVistaCliente() {
        return vistaCliente;
    }

    public void setVistaCliente(VistaCliente vistaCliente) {
        this.vistaCliente = vistaCliente;
    }

    public VistaEmpleado getVistaEmpleado() {
        return vistaEmpleado;
    }

    public void setVistaEmpleado(VistaEmpleado vistaEmpleado) {
        this.vistaEmpleado = vistaEmpleado;
    }

    public VistaDirectivo getVistaDirectivo() {
        return vistaDirectivo;
    }

    public void setVistaDirectivo(VistaDirectivo vistaDirectivo) {
        this.vistaDirectivo = vistaDirectivo;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
    
}

    

