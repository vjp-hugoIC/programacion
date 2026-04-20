/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio4 {
    
    //Metodo para llenar el array con numeros aleatorios
    public static void llenarArray(int array[][]) {    
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
            
                int num = (int)(Math.random() * 101) + 100;
                array[i][j] = num;
            }
        }
    }
    
    //Metodo para mostrar solo los numeros pares del array
    public static void mostrarArray(int array[][]) {
    
        System.out.println("Mostrando array: ");
        
        for(int i = 0; i<array.length; i++) {
            for(int j = 0; j<array[i].length; j++) {
            
                if(array[i][j] % 2 == 0){
                System.out.print(array[i][j] + " ");
                }
            }
            System.out.println(); // salto de línea por fila

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo el array 4x3
        int array[][] = new int [4][3];
        
        //Llamo al metodo para rellenar el array
        llenarArray(array);
        
        //Llamo al metodo para motrar el array
        mostrarArray(array);
        
        // TODO code application logic here
    }
    
}
