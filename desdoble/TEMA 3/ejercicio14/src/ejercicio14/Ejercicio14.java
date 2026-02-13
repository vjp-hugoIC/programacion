/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables
        int num = 0;
        int contador = 0;
        
        while (contador <= 100) {
             if ((num % 2) == 0) {
                System.out.println(num);
                contador++;
            }
            num++;

            
        }
    }
}
