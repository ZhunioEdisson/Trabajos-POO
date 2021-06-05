/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector.mayor.menor;
import java.util.Scanner;
/**
 *
 * @author mary zhingre
 */
public class VectorMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una matriz para sacar la transpuesta");
        System.out.println("ingrese numero de filas");
        int fila = teclado.nextInt();
        System.out.println("ingrese columnas");
        int columna = teclado.nextInt();
        
            int matriz[][] = new int[fila][columna]; 
        for (int i = 0;i<fila;i++){
            for (int j=0;j<columna;j++){
                matriz[i][j] = (int) (Math.random()*50);
            }
        }
        for (int i = 0;i<fila;i++){
            for (int j=0;j<columna;j++){
                System.out.print(matriz[i][j] + "\t");
            }  
            System.out.println("");
        }
        System.out.println("-----T-R-A-N-P-U-E-S-T-A-----");
        for (int i = 0;i<fila;i++){
            for (int j=0;j<columna;j++){
                System.out.print(matriz[j][i] + "\t");
            }  
            System.out.println(""); 
        }
        
        
    }
    
}
