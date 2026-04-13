/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {
    
    public final static String AGENDA = "agenda.txt";
    
    //Metodo para mostrar las opciones del menu
    public static void opciones(){
    
        System.out.println("1. Añadir un contacto a un fichero de texto");
        System.out.println("2. Mostrar por pantalla el contenido del fichero de texto creado");
        System.out.println("3. Salir del programa");
    }
    
    //pedir opciones del menu
    public static int pedirOpcion() {
    
        System.out.println("Elige una opcion");
        
        int opcion;
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();
        
        return opcion;
    }
    
    //Metodo para pedir nombre
    public static String pedirNombre() throws InputMismatchException {
    
        String nombre;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        return nombre;
    }
    
     //Metodo para pedir edad
    public static int pedirEdad() {
    
        int edad;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Edad: ");
        edad = entrada.nextInt();
        return edad;
    }
    
     //Metodo para pedir numero de telefono
    public static int pedirTelf() {
    
        int telf;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Telefono: ");
        telf = entrada.nextInt();
        return telf;
    }
    
    
    //Metodo para escribir en el fichero
    public static void escribirFichero(String fichero, String nombre, int edad, int telefono) throws FileNotFoundException, IOException {
        System.out.println("ESCRIBIENDO EN EL FICHERO");
        
        try(
                FileWriter fw = new FileWriter(nombre);
                PrintWriter pw = new PrintWriter(fw);
                ) {
         pw.println(nombre);
         pw.println(edad);
         pw.println(telefono);
            
        }
        
    }
    
    //Metodo para leer el fichero
    public static void leerFichero(String fichero) throws FileNotFoundException, IOException {
        System.out.println("LEYENDO FICHERO");
        
        try (
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
        
        //Muestro las opciones del menu al usuario
        opciones();
        
        switch(pedirOpcion()) {
        
            case 1: 
                pedirNombre();
                pedirEdad();
                pedirTelf();
        }
        
        
        // TODO code application logic here
    }
    
}
