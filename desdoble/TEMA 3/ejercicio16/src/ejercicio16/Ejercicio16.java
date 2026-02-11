/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro las variables
        int num = 20, contador = 0;
        
        //Busco los numeros impares entre ese rango
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
        do {
            num++;
            if ((num % 2)!= 0) {
                System.out.println(num);
                contador++;
            }
        } while (num <= 159);
        
        //Imprimo el contador de numeros impares
        System.out.println("La cantidad de números impares impresos han sido: " + contador);
    }
    
}
