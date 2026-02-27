/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intento;
        int contadorIntentos = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número entre 1 y 100. Intenta adivinarlo.");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número.");
                System.out.println("Número de intentos: " + contadorIntentos);
            }

        } while (intento != numeroSecreto);
    }
}
