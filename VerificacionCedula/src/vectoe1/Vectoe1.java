/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoe1;

/**
 *
 * @author mary zhingre
 */
public class Vectoe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {0,1,0,6,5,7,9,0,5};
        int cont=0, suma=0,vali=0;
        for(int i=0;i<9;i++){
            if(i==0){
               suma=vector[i]*2; 
               cont+=suma;
            }else if(i%2==0){
               suma=vector[i]*2;
               if(suma>=10){
                   suma=suma-9;
                   cont+=suma;
               }else{   
                   cont+=suma;
                }
            }else{
               cont+=vector[i];
            }System.out.print(vector[i]+" ");
        }System.out.println("");
        vali=cont%10;
        if(vali==0){
            System.out.println("si su ultimo numerto termina en: "+vali+" esta verificado");
        }else{
            vali=10-vali;
            System.out.println("Si su ultimo numero termina en: "+vali+" esta verificado");
        }
        
            
        
        
        
    }
    
}
