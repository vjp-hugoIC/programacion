/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.pkg1;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio11 {
    
    public static int pedirNumero() {
        
        //Declaro la variable y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        //Con un do le pido de nuevo un numero en caso de que introduzca uno negativo
        do{ 
            System.out.println("Introduce un numero para calcular la raiz cuadrada: ");
            num = entrada.nextInt();
        } while (num < 0);
        
        //Devuelvo el numero introducido
        return num;
        
    }
    
    public static int raizCuadrada(int num) {
        
        //Calculo la raiz cuadrada 
        int resultado =(int)Math.sqrt(num);
        
        //Devuelve el resultado de la operacion
        return resultado;

    }
    
    public static void mostrarResultado (int num) {
        
        //Imprime el resultado
        System.out.println("El resultado de la raiz cuadrada es: " + num);
    
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Lama al metodo pedir numero y lo almacena en una variable
        int numero = pedirNumero();
        
        //Llama al metodo raizCuadrada para calcular pasandole por parametro el numero introducido y almacenando el resultado en una variable
        int resultadoRaiz = raizCuadrada(numero);     
        
        //Lama al metodo para mostrar el resultado
        mostrarResultado(resultadoRaiz);     
        
    }
    
}
