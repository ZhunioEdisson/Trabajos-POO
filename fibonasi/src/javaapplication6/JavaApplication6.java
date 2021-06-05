/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author mary zhingre
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0, suma = 0, var1=0,var2=1;
        while(contador <= 20){
            System.out.print(var1 + ",");
            suma = var1 + var2;
            var1 = var2;
            var2 = suma;
            contador ++;
        }
        //do-while
        System.out.println("");
           int contador1=0,suma1=0,var3=0,var4=1;
           do{
             System.out.print(var3 + ",");
             suma1 = var3 + var4;
             var3 = var4;
             var4 = suma1;
             contador1 ++; 
            }while(contador1 <= 20);
        //for    
        System.out.println("");
           int contador2=0, suma2=0,var5=0,var6=1;
        for(contador2 = 0; contador2 <= 20; contador2++){
           System.out.print(var5 + ",");
           suma2 = var5 + var6;
           var5 = var6;
           var6 = suma2; 
            
        }
         
    }
    
}
