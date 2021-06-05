/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author mary zhingre
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=12;
        int numero=8;
        while(contador >= 1){
            int resultado = contador * numero;
            System.out.println(numero + "*" + contador +  "=" + resultado);
            contador -= 1;
        }
    }
    
}
