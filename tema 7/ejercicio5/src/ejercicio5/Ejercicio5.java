/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio5 {
    
    //Metodo para llenar el array
    public static void llenarArray(int array[][]) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Rellena el array");
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                System.out.println("Introduce un valor para la posicion " + i + j);
                array[i][j] = entrada.nextInt();
            }
        }
    }
    
    //Metodo para mostrar el array
    public static void mostrarArray(int array[][]) {
    
        System.out.println("Mostrando array: ");
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                System.out.print(array[i][j]);
            }
            
            System.out.println(); // salto de línea por fila
        }
    }
    
    //Metodo para mostrar el mayor 
    public static int mayor(int array[][]){
    
        int mayor = array[0][0];
        System.out.println("El mayor es: "); 
       
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                if(array[i][j] > mayor) {
                mayor = array[i][j];
                }
            }
        }
        return mayor;
    }
    
    //Metodo para mostrar el menor
    public static int menor(int array[][]){
    
        int menor = array[0][0];
        System.out.println("El menor es: ");
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                if(array[i][j] < menor) {
                menor = array[i][j];
                }
            }
        }
        return menor;
    }
    
    //Metodo para mostrar la suma de todos
    public static int suma(int array[][]){
    
        int suma=0;
        System.out.println("La suma es: ");
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                suma = array[i][j] + suma;
            }
        }
        return suma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el array
        int array[][] = new int [4][2];
        
        //Llamamos al metodo para rellenar el array
        llenarArray(array);
        
        //Mostrar array
        mostrarArray(array);
        System.out.println("");
        
        //El numnero mayor del array
        System.out.println(mayor(array));
        System.out.println("");
        
        //El menor del array
        System.out.println(menor(array));
        System.out.println("");
        
        //La suma de los numeros del array
        System.out.println(suma(array));
        System.out.println("");
        
        // TODO code application logic here
    }
    
}
