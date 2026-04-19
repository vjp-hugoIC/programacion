/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eejercicio1;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Eejercicio1 {
    
    //Metodo para pedir al usuario 10 numeros
    public static void rellenarVector(int vector[]) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce los 10 numeros que rellenaran el vector: ");
        
        for(int i = 0; i<10; i++) {
        
            System.out.println("Introduce un valor para la posicion " + i);
            vector[i] = entrada.nextInt();
        }
        
    }
    
    //Metodo para imprimir el vector
    public static void imprimirVector(int vector[]) {
    
        for(int i = 0; i<vector.length; i++) {
            
            
            if(vector[i] % 2 == 0){
                System.out.print(vector[i] + " ");
            }
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el vector
        int vector[] = new int [10];
        
        //llamo al metodo para rellenar el vector
        rellenarVector(vector);
        
        //Metodo para imprimir el vector
        imprimirVector(vector);
        
    }
    
}
