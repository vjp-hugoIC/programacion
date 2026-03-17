/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5 {
    
    public static int pedirNotas() {
        
        int num;
        Scanner entrada = new Scanner (System.in);
       
        num = entrada.nextInt();
        
        return num;
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        //Creo cada una de las asignaturas con el nombre de cada una 
        Asignatura programacion = new Asignatura("Programacion ");
        Asignatura lenguaje = new Asignatura("Lenguaje ");
        Asignatura baseDatos = new Asignatura("Base de datos ");
        Asignatura entornos = new Asignatura("Entornos de desarrollo ");
        Asignatura sistemas = new Asignatura ("Sistemas Informáticos ");
        Asignatura fol = new Asignatura ("Fol ");
        
        //Asigno las notas a las asignaturas mediante el metodo pedir notas
        System.out.println("Introduce la nota de programacion: ");
        programacion.setNota(pedirNotas());
        System.out.println("Introduce la nota de lenguaje: ");
        lenguaje.setNota(pedirNotas());
        System.out.println("Introduce la nota de base de datos: ");
        baseDatos.setNota(pedirNotas());
        System.out.println("Introduce la nota de entornos: ");
        entornos.setNota(pedirNotas());
        System.out.println("Introduce la nota de sistemas: ");
        sistemas.setNota(pedirNotas());
        System.out.println("Introduce la nota de fol: ");
        fol.setNota(pedirNotas());
        
        //Muestro cada asignatura con su nota
        programacion.mostrarAsignatura();
        lenguaje.mostrarAsignatura();
        baseDatos.mostrarAsignatura();
        entornos.mostrarAsignatura();
        sistemas.mostrarAsignatura();
        fol.mostrarAsignatura();
        
        Asignatura.notaMedia(programacion, lenguaje, baseDatos, entornos, sistemas, fol);        
        // TODO code application logic here
    }
    
}
