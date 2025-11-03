/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.string;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //decaro una variable de tipo String
        String nombre;
        String nombre1;
        
        //inicializar la variable String
        nombre = "Manolo";
        nombre1 = "manolo";
        
        //declaro e inicializo la variable String
        String apellido = "Arsanaliev";
        
        //Pedir una cadena al usuario
//       Scanner entrada = new Scanner(System.in);
//        System.out.println("¿Cual fue el ultimo trofeo que ganaste?");
//        String trofeos = entrada.nextLine();
//        System.out.println("Has ganado el trofeo " + trofeos);
        
        //Comparar dos valores
        if (nombre.equals(apellido)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        
        if (nombre.equalsIgnoreCase(nombre1)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        
        // TODO code application logic here
    }
    
}
