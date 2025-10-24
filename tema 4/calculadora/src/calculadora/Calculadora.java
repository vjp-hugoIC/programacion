/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    /**
     * metodo resta dos numero pasados por parametro
     * @param num1
     * @param num2
     * @return la resta de dos numeros
     */
    public static int resta (int num1, int num2) {
    return num1 - num2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 2;
        
        resta(num1, num2);
        System.out.println(num1, num2);
        
        
        // TODO code application logic here
    }
    
}
