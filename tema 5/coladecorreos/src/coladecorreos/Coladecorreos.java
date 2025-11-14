/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Coladecorreos {
    
    // Variables globales
    public static int numeroEnvio = 1;
    public static int numeroRecogida = 1;

    public static Scanner sc = new Scanner(System.in);

    // Muestra el menú de opciones
    public static void mostrarMenu() {
        System.out.println("=== Oficina de Correos ===");
        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    // Pide la opción al usuario y devuelve un entero
    public static int pedirOpcion() {
        int opcion = 0;
        try {
            opcion = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            opcion = -1; // valor inválido
        }
        return opcion;
    }

    // Genera una letra aleatoria entre 'A' y 'F'
    public static String generarLetraAleatoria() {
        int numero = (int)(Math.random() * 6) + 65; // 0-5 + 65 => 65-70
        char letra = (char)numero;
        return "" + letra;
    }

    // Incrementa el número de envío
    public static void incrementarNumeroEnvio() {
        numeroEnvio++;
    }

    // Incrementa el número de recogida
    public static void incrementarNumeroRecogida() {
        numeroRecogida++;
    }

    // Genera y muestra un número de espera para envío
    public static void generarNumeroEsperaEnvio() {
        System.out.println("Su número de espera para enviar es: E-" + numeroEnvio);
        System.out.println("Mesa asignada: " + generarLetraAleatoria());
        incrementarNumeroEnvio();
    }

    // Genera y muestra un número de espera para recogida
    public static void generarNumeroEsperaRecogida() {
        System.out.println("Su número de espera para recoger es: R-" + numeroRecogida);
        System.out.println("Mesa asignada: " + generarLetraAleatoria());
        incrementarNumeroRecogida();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = pedirOpcion();

            switch(opcion) {
                case 1:
                    generarNumeroEsperaEnvio();
                    break;
                case 2:
                    generarNumeroEsperaRecogida();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, inténtalo de nuevo.");
            }
        } while(opcion != 3);

        sc.close();
  
        // TODO code application logic here
    }
    
}
