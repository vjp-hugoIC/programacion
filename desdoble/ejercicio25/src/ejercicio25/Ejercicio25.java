/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos las variables
        int num1;
        int num2;
        int num3;
        int suma;
        int multiplicacion;
        
        // Declaramos el Scanner
        Scanner entrada = new Scanner(System.in);
                
        // Pedimos al usuario los 3 numeros
        System.out.println("Por favor, introduzca el primer número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println("Por favor, introduzca el tercer número: ");
        num3 = entrada.nextInt();
        
        // La suma de los tres numeros
        suma = num1 + num2 + num3;
        System.out.println("La suma de los números introducidos es: " + suma);
        
        // La multiplicacion de los tres numeros
        multiplicacion = num1 * num2 * num3;
        System.out.println("El producto de los números introducidos es: " + multiplicacion);
        
        // TODO code application logic here
    }
    
}
