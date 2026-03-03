/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class pedirNumeros {
    
    public static int pedirNumero() {
        //Declaro la variable y  el escaner
        int num1;
        Scanner entrada = new Scanner(System.in);
    
        //Le pido al usuario el numero
        System.out.println("Introduce el primer numero: ");
        num1 = entrada.nextInt();
        
        //Devuelvo el numero
        return num1;
}
    
    
}
