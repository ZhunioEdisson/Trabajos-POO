/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector.de.mayor.a.menor;

import java.util.Scanner;

/**
 *
 * @author mary zhingre
 */
public class VECTORDEMAYORAMENOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner b=new Scanner(System.in);
        System.out.println("iingrese num del vector: ");
        int aux=0,var1=0;
        
         
        int[] vector = {2, 4, 6, 5, 9, 0, 79, 34, 12};

        for (int i = 0; i < vector.length - 1; i++) {
            for (int x = i + 1; x < vector.length; x++) {
                if (vector[i] < vector[x]) {
                    aux = vector[i];
                    vector[i] = vector[x];
                    vector[x] = aux;
                }
            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }


    }

}
