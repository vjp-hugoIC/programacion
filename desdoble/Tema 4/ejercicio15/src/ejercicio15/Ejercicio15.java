/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio15 {
    
    // Método para pedir número 1
    public static int pedirNumero1() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    return entrada.nextInt();
}
    // Método para pedir número 2
    public static int pedirNumero2() {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Introduce el segundo número: ");
    return entrada.nextInt();
}

    // Método para mostrar el menú
    public static void mostrarMenu(){

        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.print("Elige una opción: ");

    }

    // Método sumar
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    // Método restar
    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    // Método multiplicar
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    // Método dividir con excepción
    public static void dividir(int num1, int num2){

        try{
            if(num2 == 0){
            }

            System.out.println("Resultado: " + (num1 / num2));

        }catch(ArithmeticException e){

            System.out.println("Error: no se puede dividir entre 0");

        }
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner entrada = new Scanner(System.in);

        num1 = pedirNumero1();
        num2 = pedirNumero2();

        int opcion;

        do {

            mostrarMenu();
            opcion = entrada.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;

                case 4:
                    dividir(num1, num2);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta");

            }

        } while(opcion != 5);
        
        
    }
    
}
