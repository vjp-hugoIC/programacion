/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int primernum;
        int segundonum;
        int tercernum;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca el primer numero");
        primernum = entrada.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        segundonum = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero");
        tercernum = entrada.nextInt();
        
        int suma = primernum + segundonum + tercernum;
        System.out.println("La suma de los numeros es: " + suma);
        
        int producto = primernum * segundonum * tercernum;
        System.out.println("El producto de los numeros es: " + producto);
        
        // TODO code application logic here
    }
    
}
