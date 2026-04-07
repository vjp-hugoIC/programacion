/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {
    
    //Metodo para mostrar el menu
    public static void mostrarMenu() {
    
        System.out.println("1. Crear cuenta vacia");
        System.out.println("2. Crear cuenta con saldo inicial");
        System.out.println("3. Ingresar dinero");
        System.out.println("4. Sacar dinero");
        System.out.println("5. Ver saldo");
        System.out.println("6. Salir");
    }
    
    //Metodo para pedir la opcion del menu al usuario
    public static int pedirOpcion() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Selecciona la opcion que quieras realizar: ");
        num = entrada.nextInt();
        
        return num;
    }
    
    //Metodo para pedir el dinero inicial de la cuenta en case de pulsar la opcion 2
    public static int saldoInicial() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el saldo inicial de la cuenta: ");
        num = entrada.nextInt();
        
        return num;
    } 
    
    //Metodo para pedir el ingreso de dinero 
    public static int dineroIngreso() {
    
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el dinero que quieres ingresar en la cuenta: ");
        num = entrada.nextInt();
        
        return num;
    } 
    
    //Opciones del menu
    public static void opciones (int num) {
        
        Cuenta cuenta1 = null;
    
        switch (num) {
    
            case 1:
                cuenta1 = new Cuenta();
                break;
            case 2: 
                cuenta1 = new Cuenta(saldoInicial());
                break;
            case 3: 
                cuenta1.ingresar(dineroIngreso());
        }    
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        // TODO code application logic here
    }
    
}
