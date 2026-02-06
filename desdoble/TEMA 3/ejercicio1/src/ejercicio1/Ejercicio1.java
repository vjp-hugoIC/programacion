/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declaro la variable y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        //Pido el numero al usuario
        System.out.println("Por favor, introduzca un numero: ");
        num = entrada.nextInt();
        
        //Comprueba si el numero es negativo o positivo
       if(num<0) {
           System.out.println("El número introducido es negativo");
       } else{
           System.out.println("El número introducido es positivo");
       }
        
    }
    
}
