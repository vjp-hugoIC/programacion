/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

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
public class Ejercicio10 {
    
    public final static String FICHERO = "dni.txt";
    
    //Metodo para pedir dni
    public static int pedirDni() {
    
        Scanner entrada = new Scanner(System.in);
        int dni;
        
        System.out.println("Introduce tu DNI: ");
        dni = entrada.nextInt();
        
        return dni;
    }
    
    //Metodo para escribir el dni en el fichero
    public static void escribirFichero(String fichero, int dni) throws FileNotFoundException, IOException {
    
        System.out.println("Escribiendo fichero...");
        
        try (
                FileWriter fw = new FileWriter(fichero, true);
                PrintWriter pw = new PrintWriter(fw);
                ) {
        
            pw.println(dni);
        }
    }
    
    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
    
        System.out.println("Leyendo fichero...");
        try(
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                ) {
        
            String linea = br.readLine();
            
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try {
       
           escribirFichero(FICHERO, pedirDni());
           leerFichero(FICHERO);
       } catch (InputMismatchException e) {
            System.out.println("ERROR: Has escrito un tipo de dato incorrecto.");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ha ocurrido un error en la escritura o lectura del fichero.");
        } catch (Exception e) {
            System.out.println("ERROR: Ha ocurrido un error desconocido.");
        }
        
        // TODO code application logic here
    }
    
}
