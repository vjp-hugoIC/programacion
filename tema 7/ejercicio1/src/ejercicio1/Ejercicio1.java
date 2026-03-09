/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {
    
    //Metodo para pedir los 10 numeros al usuario
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro un array
        String[] parteCuerpo = new String[4];        
        
        //Declaro e inicializo un array
        int[] notas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //Insertar un elemento
        parteCuerpo [0] = "Cabeza";
        parteCuerpo [1] = "rodilla";
        parteCuerpo [2] = "muslos";
        parteCuerpo [3] = "y cadera";
        System.out.print(Arrays.toString(parteCuerpo));
        
        System.out.println(" ");
        
        //Recorrer y mostrar un array
        for(int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " - ");
        }
        
        //Reellenar un array
        for(int i = 0; i < notas.length; i++) {
            notas[i] = (int)(Math.random() * 10);
        }
        
        // TODO code application logic here
    }
    
}
