/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12.bis2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */

public class Ejercicio12Bis2 {
    
    public final static String FICHERO = "fichero.txt";
    
    //Rellenar el array
    public static void rellenarArray(String array[]) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Rellena el array con 4 caracteres");
        
        for(int i = 0; i < array.length; i++) {
        
            array[i] = entrada.nextLine();
        }
    }
    
    //Metodo para escribir en el fichero el array
    public static void escribirCadenasEnArchivo(String fichero, String[] array) throws FileNotFoundException, IOException {

        System.out.println("Escribiendo fichero: ");

        try (
                FileWriter fw = new FileWriter(fichero, true); 
                PrintWriter pw = new PrintWriter(fw);) {

            for (int i = 0; i < array.length; i++) {
                pw.print(array[i]);
            }
            pw.println();
        }
    }
    
    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws  FileNotFoundException, IOException {
    
        System.out.println("Leyendo fichero: ");
        
         try (
                FileReader fr = new FileReader(fichero); 
                BufferedReader br = new BufferedReader(fr);) {

                String linea = br.readLine();

            while (linea != null){
                System.out.println(linea);
                  linea = br.readLine();
        }
    }
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos el array y le pedimos al usuario que lo rellene
        String array[] = new String [4];
        rellenarArray(array);
       
        try {
        
            //Escribimos el array en el fichero
            escribirCadenasEnArchivo(FICHERO, array);
            
            //Llamamos al metodo leerFichero para leerlo
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

