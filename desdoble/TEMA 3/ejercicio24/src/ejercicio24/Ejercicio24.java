/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables y el scanner
        int num=-1, contador=0, i;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Introduce un numero mayor que 0:");
            try {
                num = entrada.nextInt();
                if (num <= 0) {
                    System.out.println("Error: el numero debe ser mayor que 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un numero entero");
                entrada.next(); // limpiar buffer
            }
        } while (num <= 0);

        for (i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de numeros multiplos de 3 mostrados: " + contador);
        
    }
    
}
