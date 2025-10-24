/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        int num1, num2, result;
        
        //declaro el escaner
        Scanner entrada = new Scanner (System.in);
        
        //pedimos los numeros al usuario
        System.out.print("Introduzca el primer numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        
        //Para capturar el error
        try {
            result = num1 / num2;
        }
        catch (ArithmeticException e) {
            System.out.print("Error, no se puede dividir entre 0 " + e.getMessage ());
            result = 0;
        }
        
        System.out.print("El resultado es: " + result);
        
        // TODO code application logic here
    }
    
}
