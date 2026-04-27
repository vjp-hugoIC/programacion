/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio6 {

    //Metodo para elegir el nombre del fichero
    public static String fichero() {

        Scanner entrada = new Scanner(System.in);
        String fichero;

        System.out.println("Introduce el nombre del fichero: ");
        fichero = entrada.nextLine();

        return fichero;
    }

    //Metodo para calcular los 100 numeros pares
    public static int[] numeros() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {

            array[i] = i * 2;
        }

        return array;
    }
    
    //Metodo para escribir los 100 numeros pares en el fichero
    public static void escribirFichero(String fichero, int[] array) throws FileNotFoundException, IOException {

        System.out.println("Escribiendo fichero...");

        try (
                FileWriter fw = new FileWriter(fichero, true); 
                PrintWriter pw = new PrintWriter(fw);) {

            for (int i = 0; i < array.length; i++) {

                pw.print(array[i]);
            }
        }
    }
    
    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {

        System.out.println("Leyendo fichero...");

        try (
                FileReader fr = new FileReader(fichero); BufferedReader br = new BufferedReader(fr);) {

            String linea = br.readLine();

            while (linea != null) {

                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        String nombreFichero = "";

        do {

            System.out.println("MENU");
            System.out.println("1. Crear fichero con 100 pares");
            System.out.println("2. Mostrar fichero");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            
        

        try {

            switch (opcion) {

                case 1:
                    nombreFichero = fichero();
                    escribirFichero(nombreFichero, numeros());
                    break;
                    
                case 2:
                    leerFichero(nombreFichero);
                    break;
                
                case 3:
                    System.out.println("Saliendo...");
                    break;
                
                default:
                    System.out.println("Elige una opcion valida.");

            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
      } while (opcion != 3);
    }

}
