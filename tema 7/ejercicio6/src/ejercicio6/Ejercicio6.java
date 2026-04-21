/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio6 {
    
    // Método que comprueba si un número es primo
    public static boolean esPrimo(int n) {

        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
     //Método que rellena el array con primos
    public static void rellenarArray(int array[]) {

        int numero = 2;
        int contador = 0;

        while (contador < array.length) {

            if (esPrimo(numero)) {
                array[contador] = numero;
                contador++;
            }

            numero++;
        }
    }
    
    // Método para mostrar el array
    public static void mostrarArray(int[] array) {

        System.out.println("Números primos:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int primos[] = new int[80];

        rellenarArray(primos);
        mostrarArray(primos);
        
        // TODO code application logic here
    }
    
}
