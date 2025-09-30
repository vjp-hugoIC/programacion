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
        
        int dias = segundos / 86400;
        int resto = segundos % 86400;
        int horas = resto / 3600;
        resto = resto % 3600;
        int minutos = resto / 60;
        int segundostotales = resto % 60;
         
        System.out.println(segundos + " hacen un total de: " + dias + " dias, " + horas + " horas, " + minutos + " minutos y " + segundostotales);
        
        // TODO code application logic here
    }
    
}
