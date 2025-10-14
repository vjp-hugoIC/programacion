/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaro las variables
        int contraseña;
        int intentos=0;
        
         //declaro el scanner
        Scanner entrada =  new Scanner (System.in);
        
         System.out.println("Introduzca la contraseña:");
            contraseña = entrada.nextInt();
        
        do {
              if (contraseña != 123456789) {  //para verificar que es la contraseña
                System.out.println("Introduzca la contraseña:");
              }
             intentos++; 
        }
        while(contraseña == 123456789);
        System.out.println("Enhorabuena");
        
        // TODO code application logic here
    }
    
}
