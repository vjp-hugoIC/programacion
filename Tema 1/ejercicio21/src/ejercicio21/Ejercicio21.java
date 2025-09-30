/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int segundos;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Porfavor, introduzca el numero de segundos: ");
        segundos = entrada.nextInt();
        
        int dias = segundos / 864000;
        int horas = segundos / 24;
        int minutos = horas / 1440;
         
        System.out.println(segundos + " hacen un total de: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundos);
        
        // TODO code application logic here
    }
    
}
