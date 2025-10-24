/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        int numero, contador = 0;
        
        //declaro el escaner
        Scanner entrada =  new Scanner (System.in);
        
        //genero el numero random
        int numrandom = (int)(Math.random() * 100);
        
        //declaro la condicion
        do {
        //le pregunto al usuario el numero hasta que lo adivine
        System.out.println("Introduce el numero: ");
        numero = entrada.nextInt();
        contador++;
        
        //para calcular y que le diga al usuario si el numero introducido es mayor o menor
        if (numero < numrandom) {
        
            System.out.println("El numero es grande");
        } else {
            System.out.print("El numero es mas pequeno \n");
        }
        } while (numero != numrandom);
        
        //le decimos que lo ha adivinado y el numero de intento que le ha tomado
        System.out.println("Has adivinado el numero en " + contador + " intentos");
        
        // TODO code application logic here
    }
    
}
