/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author VSPC-210660
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto de cada subclase y pruebo el metodo de saludar
        Alumno alumno1 = new Alumno("Hugo", "3ºA");
        Profesor profesor1 = new Profesor("Jose", "Lengua");
        
        System.out.println(alumno1.saludar());
        System.out.println(profesor1.saludar());
        System.out.println("");
        
        //Utilizando polimorfismo
        Persona alumno2 = new Alumno("alumno2", "4ºB");
        Persona profesor2 = new Profesor("profesor2", "Matematicas");
        
        System.out.println(alumno2.saludar());
        System.out.println(profesor2.saludar());
        
        // TODO code application logic here
    }
    
}
