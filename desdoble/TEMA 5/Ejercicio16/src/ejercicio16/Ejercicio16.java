/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio16 {
    
    //Metodo para pedir la nota
    public static int pedirNota() {
    
        //Declaro la variable y el scanner
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la nota del alumno: ");
        num = entrada.nextInt();
        
        return num;
        
    }
    
    //Metodo para pedir el nombre del alumno
    public static String pedirNombre() {
    
        //Declaro la variable y el scanner
        String nom;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del alumno: ");
        nom = entrada.nextLine();
        
        return nom;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo 3 objetos
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        
        //Le pido al usuario las notas de los alumnos con el metodo pedirNota
        alumno1.setNota(pedirNota());
        alumno2.setNota(pedirNota());
        alumno3.setNota(pedirNota());
        
        //Le pido al usuario el nombre de los alumnos
        alumno1.setNombre(pedirNombre());
        alumno2.setNombre(pedirNombre());
        alumno3.setNombre(pedirNombre());
        
        //Muestro las notas de los alumnos 
        alumno1.mostrarCalificaciones();
        alumno2.mostrarCalificaciones();
        alumno3.mostrarCalificaciones();
        
        // TODO code application logic here
    }
    
}
