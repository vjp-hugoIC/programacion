/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables y el scanner
        int num, resultado, i;
        Scanner entrada = new Scanner(System.in);
        
        //Le pido al usuario el numero
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar:");
        num = entrada.nextInt();
        
        //Utilizo for porque se que las tablas de multiplicar van del 0 al 10
        for (i=0; i<=10; i++) {
            resultado = num * i;
            System.out.println(num + " X " + i + " = " +resultado);
        }
        
    }
    
}
