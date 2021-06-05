/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author mary zhingre
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //generar una aplicacion que permita determinar el grupo en base a la edad and & or || not !
        int edad = 34;
        if(edad > 0 & edad <=2){
          System.out.println("usted es menor de edad");
        } else if(edad > 2 & edad <= 12){
          System.out.println("usted es un nino");
        } else if(edad > 12 & edad <= 18){
          System.out.println("Usted es una joven");
        } else if(edad > 18 & edad <= 65 ){
          System.out.println("Usten es un adulto");
        } else if(edad > 65){
          System.out.println("Usted es un adulto mayor");
        } else {
          System.out.println("ingrese bien la edad");
        }
        
        
        
              
    }
    
}
