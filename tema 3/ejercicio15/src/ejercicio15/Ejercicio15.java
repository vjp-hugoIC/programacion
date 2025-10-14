/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        int num;
        int multi;
        int i;
        
        //declaro el scanner
         Scanner entrada =  new Scanner (System.in);
         
         //pido al usuario que introduzca un numero para calcular la tabla de multiplicar
         System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
         num = entrada.nextInt();
         
         //desde i=0 mientras que i sea menor o igual que 10 incrementando 1 a i
         for (i=0; i<=10; i++) {
             multi = num * i;
             System.out.println(num + " x " + i + " = " + multi);         
         }
        
        // TODO code application logic here
    }
    
}
