/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        //Le pido el numero al usuario 
        System.out.println("Introduce un numero:");
        num = entrada.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero introducido es par");
        } else {
            System.out.println("El numero introducido es impar");
        }
        
    }
    
}
