/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro la variable y la inicializo para que empiece en el 11
        int num = 11;
        
        //Utilizando un do while busco los numeros pares del 11 al 133
        do {
            num++;
            if ((num % 2) == 0){
            System.out.println(num);
            } 
            
        } while (num <= 133);
        
    }
    
}
