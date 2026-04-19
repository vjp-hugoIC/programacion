/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio2 {
    
    //Metodo para introducir los datos en un vector
    public static void llenarVector(int vector[]) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los numeros para llenar el vector");
        
        for(int i = 0; i<7; i++) {
        
            System.out.println("Introduce el valor para la posicion " + i);
            vector[i] = entrada.nextInt();
        }
    }
    
    //Metodo para mostrar el vector
    public static void mostrarVector(int vector[]) {
    
        for(int i =0; i < vector.length; i++) {
        
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    
    //Metodo para cambiar las posiciones
    public static void cambiarPosiciones(int vector[]) {
    
        int aux = vector[2];
        vector[2] = vector[4];
        vector[4] = aux;
        
        for(int i = 0; i < vector.length; i++) {
        
            System.out.print(vector[i] + " ");
        }
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el vector
        int vector[] = new int [7];
        
        //Llamo al metodo para rellenar el vector
        llenarVector(vector);
        
        //Llamo al metodo para imprimirlo
        mostrarVector(vector);
        
        //Llamo al metodo para cambiar las posiciones y lo vuelvo a imprimir
        cambiarPosiciones(vector);
        
        // TODO code application logic here
    }
    
}
