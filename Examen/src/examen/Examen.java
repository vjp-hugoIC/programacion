/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Examen {
    
    //Metodo que unicamente muestra el menú
    public static void mostrarMenu(){
        System.out.println("1. Analizar señal recibida del espacio");
        System.out.println("2. Ajustar las potencias de sus motores antes del lanzamiento");
        System.out.println("3. Calcular el volumen de un planeta");
        System.out.println("4. Salir");
    }
    
    //Metodo para elegir una opcion del menú
    public static int pedirNum() {
        int num1 = 0;
        try {      //utilizamos el try para capturar si el usuario introduce una letra en vez de un número
            System.out.println("Selecciona una de estas 3 opciones: ");
            Scanner entrada = new Scanner(System.in);
            num1 = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido");
        }
        return num1;
    }

    public static int num1() {
        int numSeñal=0;
        try {      //utilizamos el try para capturar si el usuario introduce una letra en vez de un número
            System.out.println("Introduce la señal recibida del espacio: ");
            Scanner entrada = new Scanner(System.in);
            numSeñal = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido");
        }
        return numSeñal;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        //declaro las variables
        int num1 = 0;
        int numSeñal = 0;
        int resultado = 1;
        int name;
        int potencia1, potencia2, potencia3;
        double radio = 0; 
        double volumen;
        
        //Mostramos el menú
        mostrarMenu();
        
        //lo hago aqui porque el metodo no me va
          try {      //utilizamos el try para capturar si el usuario introduce una letra en vez de un número
            System.out.println("Selecciona una de estas 3 opciones: ");
            Scanner entrada = new Scanner(System.in);
            num1 = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido");
        }
        
            switch (num1) {
                case 1: 
                    try {  //usamos el try para capturar excepciones
                        System.out.println("Introduzca la señal recibida del espacio: ");
                        Scanner entrada = new Scanner(System.in);   //pedimos la señal
                        numSeñal = entrada.nextInt();
                    } catch (InputMismatchException e) {
                            System.out.println("Introduce un valor valido");
                      }
                    //Utilizamos el do while para encontrar el numero que divida exactamente la señal
                       do {
                           name = numSeñal % resultado;
                          resultado++;
                       } while (name == 0);
                       System.out.println("La frcuencia es: " + resultado);
                   break;
                case 2:
                    try {  //usamos el try para capturar excepciones
                        System.out.println("Introduce los tres valores de potencia");
                        Scanner entrada = new Scanner(System.in);   //pedimos la señal
                        potencia1 = entrada.nextInt();
                        potencia2 = entrada.nextInt();
                        potencia3 = entrada.nextInt();
                    } catch (InputMismatchException e) {
                            System.out.println("Introduce un valor valido");
                      }
                    break;
                case 3:
                    System.out.println("Calcular el volumen del planeta");
                    try {  //usamos el try para capturar excepciones
                        System.out.println("Introduce el radio del planeta: ");
                        Scanner entrada = new Scanner(System.in);   //pedimos la señal
                        radio = entrada.nextDouble();
                    } catch (InputMismatchException e) {
                            System.out.println("Introduce un valor valido");
                      }
                    volumen = 4/3 * Math.PI * radio;
                    System.out.println("El volumen es " + volumen);
                    break;
                case 4:
                    System.out.println("Salir");
                    break;
                default: System.out.println("Valor no valido, Selecciona una de las 3 opciones");
            }
        
        
        // TODO code application logic here
    }
    
}
