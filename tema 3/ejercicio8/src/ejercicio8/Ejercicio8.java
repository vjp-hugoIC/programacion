/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //declaro las variables
        int dinero, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        
        //declaro el scanner
        Scanner entrada = new Scanner (System.in);
        
        //le pido al usuario que introduzca los datos
           System.out.println("Porfavor, indique una cantidad de dinero:");
           dinero =entrada.nextInt();
           
           System.out.println(dinero + " Euros se descomponen en:");
           
           //lo descompongo
          billetes50 = dinero / 50;           
          billetes20 = dinero % 50 / 20;
          billetes10 = dinero % 20 / 10;
          billetes5 = dinero %10 / 5;
          monedas2 = dinero % 5 / 2;
          monedas1 = dinero % 1;
        
          //para que si no hay billetes o monedas no se muestren
          System.out.println("Descomposición:");
        if (billetes50 > 0) {
            System.out.println("Billetes de 50: " + billetes50);
        }
        if (billetes20 > 0) {
            System.out.println("Billetes de 20: " + billetes20);
        }
        if (billetes10 > 0) {
            System.out.println("Billetes de 10: " + billetes10);
        }
        if (billetes5 > 0) {
            System.out.println("Billetes de 5: " + billetes5);
        }
        if (monedas2 > 0) {
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if (monedas1 > 0) {
            System.out.println("Monedas de 1 euro: " + monedas1);
        }
          

        // TODO code application logic here
    }
    
}
