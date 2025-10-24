/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import utilidades.utilidades;


/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        
        num1 = utilidades.pedirNum();
        
        if (num1 > 0) {
            System.out.println("El numero que has introducido es positivo");
        }
        else {
            System.out.println("El numero que has introducido es negativo");
        }
        
        
        // TODO code application logic here
    }
    
}
