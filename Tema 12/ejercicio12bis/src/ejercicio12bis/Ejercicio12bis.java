/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio12bis {

    public final static String FICHERO = "masnumeros.txt";

    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        
        int suma = 0;

        try (
                FileReader fr = new FileReader(fichero); 
                BufferedReader br = new BufferedReader(fr);) {

            String linea = br.readLine();

            while (linea != null) {
                
                String[] numeros = linea.split(";");  //Divide el texto en partes usando ; y cada parte la almacena en el array de Strings

                for (String num : numeros) {          //Recorre el array y guarda cada elemento del array en num
                    suma += Integer.parseInt(num.trim());   //Pasa el String a numero y va sumando cada numero
                }

                linea = br.readLine();
            }

            System.out.println("Suma total: " + suma);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

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
