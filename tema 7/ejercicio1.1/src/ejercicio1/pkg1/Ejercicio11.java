/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.pkg1;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio11 {
    
    public static int elegirLongitud(){
    
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        
        System.out.println("Introduzca la longitud del vector: ");
        longitud = entrada.nextInt();
        
        return longitud;
    }
    
   public static void rellenarVector(int vector[]) {
   
       Scanner entrada = new Scanner (System.in);
       int i;
       
       System.out.println("Rellena el array con 10 numeros enteros");
       
       for (i=0; i<10; i++) {
           vector[i] = entrada.nextInt();
       }
   }
   
   
   public static void mostrarVector(int vector[]) {
   
       int i;
       
       for(i=0; i<10; i++) {
           System.out.println("El valor guardado en la posicion " + i + " es de: " + vector[i]);
       }
   
   }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int [elegirLongitud()];
        
        rellenarVector(vector);
        mostrarVector(vector);
        
        
    }
    
}
