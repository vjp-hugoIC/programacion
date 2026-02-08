/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables que le vamos a pedir al usuario y el scanner
        int num1, num2, num3, num4, aux;
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos los numeros al usuario
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        num2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un cuarto numero: ");
        num4 = entrada.nextInt();
        
        // Ordenamos num1 y num2
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        // Ordenamos num1 y num3
        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        
        // Ordenamos num1 y num4
        if (num1 > num4) {
            aux = num1;
            num1 = num4;
            num4 = aux;
        }
        
        // Ordenamos num2 y num3
        if (num2 > num3) {
            aux = num3;
            num2 = num3;
            num3 = aux;
        }
        
        // Ordenamos num2 y num4
        if (num2 > num4) {
            aux = num2;
            num2 = num4;
            num4 = aux;
        }
        
        // Ordenamos num3 y num4
        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        
        //Imprimimos por pantalla los numeros ordenados
        System.out.println("Números ordenados de menor a mayor:");
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
        
    }
    
}
