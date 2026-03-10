/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String diaSemana;
        boolean iguales;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un dia de la semana: ");
        diaSemana = entrada.nextLine();
        
        iguales = diaSemana.equalsIgnoreCase("Lunes");
        if (iguales==true) {
            
            System.out.println("El Lunes es el primer día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Martes");
        if (iguales==true) {
            
            System.out.println("El Martes es el segundo día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Miercoles");
        if (iguales==true) {
            
            System.out.println("El Miercoles es el tercer día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Jueves");
        if (iguales==true) {
            
            System.out.println("El Martes es el cuarto día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Viernes");
        if (iguales==true) {
            
            System.out.println("El Viernes es el quinto día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Sabado");
        if (iguales==true) {
            
            System.out.println("El Sabado es el sexto día de la semana");
        }
        
        iguales = diaSemana.equalsIgnoreCase("Domingo");
        if (iguales==true) {
            
            System.out.println("El Domingo es el septimo día de la semana");
        }
        
        // TODO code application logic here
    }
    
}
