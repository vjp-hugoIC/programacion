/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, primeracif, segundacif, terceracif, cuartacif;
        
        Scanner entrada =  new Scanner (System.in);
        
        System.out.println("Introduzca un numero de 4 cifras");
        numero = entrada.nextInt();
        
        primeracif = numero / 1000;
        System.out.println("La primera cifra es: " + primeracif);
        
        segundacif = numero % 1000 / 100;
        System.out.println("La segunda cifra es: " + segundacif);
        
        terceracif = numero % 100 / 10;
        System.out.println("La tercera cifra es: " + terceracif);
        
        cuartacif = numero % 10;
        System.out.println("La cuarta cifra es: " + cuartacif);
        
        
        // TODO code application logic here
    }
    
}
