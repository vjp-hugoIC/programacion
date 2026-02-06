/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 1;
        int num2 = 2;
        int aux;
        
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("La variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2);
        
        // TODO code application logic here
    }
    
}
