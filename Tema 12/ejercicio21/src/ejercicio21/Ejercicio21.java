/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {
    
    //Constante con la ruta del fichero
    public final static String FICHERO = "notas.obj";
    
    //Metodo para pedir al usuario una nota entre 0 y 10
    public static double pedirNota() {
    
        Scanner entrada = new Scanner(System.in);
        double nota = -1;
        
        System.out.println("Introduce la nota entre el 0 y el 10: ");
        
        if(nota < 0 || nota > 10) {
        
            try {
            
                nota = entrada.nextDouble();
            } catch(InputMismatchException e) {
                System.out.println("Error tipo de dato no valido");
            }
        }
        
        return nota;
    }
    
    //Metodo para escribir el objeto en el fichero
    public static void escribirFichero(String fichero) throws IOException, FileNotFoundException, ClassNotFoundException {
    
        System.out.println("Escribiendo fichero...");
        
        try (
                FileOutputStream fos = new FileOutputStream(fichero);
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                ) {
        
            oos.writeObject(new Asignaturas("Programacion", pedirNota()));
            oos.writeObject(new Asignaturas("Base de datos", pedirNota()));
            oos.writeObject(new Asignaturas("LMSGI", pedirNota()));
            oos.writeObject(new Asignaturas("Sistemas Informaticos", pedirNota()));
            oos.writeObject(new Asignaturas("Entornos de desarrollo", pedirNota()));
            oos.writeObject(new Asignaturas("Ingles", pedirNota()));
            
        }
    }
    
    //Metodo para leer el fichero de objetos
    public static void leerFichero(String fichero) throws IOException, FileNotFoundException, ClassNotFoundException {
    
        System.out.println("Leyendo fichero...");
        double suma=0;
        double media;
        
        try(
                FileInputStream fis = new FileInputStream(fichero);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ) {
        
            Asignaturas asignatura;
            
            while(true) {
            
                asignatura = (Asignaturas) ois.readObject();
                System.out.println(asignatura);
                System.out.println("***********");
                
                suma = suma + asignatura.getNota();

            }
        } catch(EOFException e) {
            System.out.println("Fin de la lectura.");
        }
        
        media = (double) suma / 6;
        System.out.println("Nota media: " + media);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        
            System.out.println("Escribe las notas en este orden (Programacion, Base de datos, LMSGI, Sistemas Informaticos, Entornos de desarrollo, Ingles.)");
            escribirFichero(FICHERO);
            leerFichero(FICHERO);
        }  catch(FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado.");
        }
         catch(ClassNotFoundException e) {
            System.out.println("ERROR: Clase no encontrado.");
        } catch(IOException e) {
            System.out.println("ERROR: Error de escritura o lectura.");
        }
        
        // TODO code application logic here
    }
    
}
