/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio3 {
    
    //Metodo para elegir la longitud del array
    public static int longitud() {
    
        Scanner entrada = new Scanner(System.in);
        int longitud;
        
        System.out.println("Introduce la longitud del vector: ");
        longitud = entrada.nextInt();
        
        return longitud;
    }
    
    //Metodo para rellenar el vector
    public static void rellenarVector(int vector[]) {
    
        for(int i = 0; i < vector.length; i++) {
        
            int num = (int)(Math.random() * 7); 
            vector[i] = num;
        }
    }
    
    //Metodo para mostrar el vector
    public static void mostrarVector(int vector[]) {
    
        for(int i = 0; i < vector.length; i++) {
        
            System.out.print(vector[i] + " ");
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el vector e invoco al metodo de pedir la dimension al usuario
        int vector[] = new int [longitud()];
        
        //Llamo al metodo de rellenar el vector
        rellenarVector(vector);
        
        //Llamo al metodo para mostrar el vector
        mostrarVector(vector);
        
        // TODO code application logic here
    }
    
}
