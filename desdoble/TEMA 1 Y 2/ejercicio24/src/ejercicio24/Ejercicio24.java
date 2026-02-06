/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaramos todas las variables
        double notaProgramacion;
        double notaLenguaje;
        double notaBaseDatos;
        double notaEntornos;
        double notaSistemas;
        double notaIngles;
        double notaIpe;
        double notaMedia;
        
        // Declaramos el Scanner
        Scanner entrada = new Scanner (System.in);
        
        //  Le pedimos al usuario las notas
        System.out.println("Por favor, introduzca la nota de Programación:");
        notaProgramacion = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Lenguaje de Marcas:");
        notaLenguaje = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Base de Datos:");
        notaBaseDatos = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Entornos de Desarrollo:");
        notaEntornos = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Sistemas Informaticos:");
        notaSistemas = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Inglés:");
        notaIngles = entrada.nextDouble();
        
        System.out.println("Por favor, introduzca la nota de Itinerario Personal para la Empleabilidad:");
        notaIpe = entrada.nextDouble();
        
        // Calculamos la nota media
        notaMedia = (notaProgramacion + notaLenguaje + notaBaseDatos + notaEntornos + notaSistemas + notaIngles + notaIpe) / 7;
        
        System.out.println("Su nota media del curso es de: " + notaMedia);
        
        // TODO code application logic here
    }
    
}
