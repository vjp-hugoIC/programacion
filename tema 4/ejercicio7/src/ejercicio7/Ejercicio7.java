/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Programa donde el usuario introduzca cuatro números enteros desde el main.
        // despues enviar esos números a un método que los muestre ordenados de menor a mayor.

        Scanner entrada = new Scanner(System.in); //Atributo scanner

        System.out.println("Introduzca el 1º numero :");
        int num1 = entrada.nextInt();
       
       
        System.out.println("Imtroduzca el 2º numero :");
        int num2 = entrada.nextInt();
       
        System.out.println("Imtroduzca el 3º numero :");
        int num3 = entrada.nextInt();
       
        System.out.println("Imtroduzca el 4º numero :");
        int num4 = entrada.nextInt();
        
        //llamo al metodo
        ordenar(num1, num2, num3, num4);
        
        // TODO code application logic here
        
    }
    
    //creo el metodo
    public static void ordenar(int num1, int num2, int num3, int num4){
    
        //metodo burbuja para ordenar los numeros
        int aux, i;
        
        for (i=0; i<3; i++) {
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num2 > num3) {
        aux = num2;
        num2 = num3;
        num3 = aux;
        }
        if(num3 > num4) {
        aux = num3;
        num3 = num4;
        num4 = aux;
        }
    }
        System.out.println("El orden de los números introducidos es el: " + num1 + num2 + num3 + num4);
        
    }
    
}
