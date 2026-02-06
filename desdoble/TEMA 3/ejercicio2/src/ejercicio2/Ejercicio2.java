/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables y el scanner
        int num1, num2, multiplicacion, suma;
        Scanner entrada = new Scanner(System.in);
        
        //Pido los dos numeros al usuario
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        num2 = entrada.nextInt();
        
        //Si uno es mayor que 10 los multiplico sino los sumo
        if (num1>10) {
            multiplicacion = num1 * num2;
            System.out.println("La operación que se realizó es  producto y el resultado es: " + multiplicacion);
        } else {
            suma = num1 + num2;
            System.out.println("La operación que se realizó es  suma y el resultado es: " + suma);
        }
        
    }
    
}
