/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("La variable num1 contiene el valor " + num1 + "y la variable num2 contiene el valor " + num2);
        
        int aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("Ahora, la variable num1 contiene el valor " + num1 + " y la variable num2 contiene el valor " + num2);
        // TODO code application logic here
    }
    
}
